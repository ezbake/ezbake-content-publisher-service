/*   Copyright (C) 2013-2014 Computer Sciences Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. */

package ezbake.publisher.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Properties;

import org.apache.thrift.TException;
import org.apache.thrift.TSerializer;
import org.apache.thrift.protocol.TSimpleJSONProtocol;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

import com.google.common.collect.Sets;

import ezbake.base.thrift.EzSecurityToken;
import ezbake.base.thrift.EzSecurityTokenException;
import ezbake.base.thrift.SSR;
import ezbake.base.thrift.Visibility;
import ezbake.frack.common.utils.thrift.SSRJSON;
import ezbake.publisher.thrift.ContentPublisher;
import ezbake.publisher.thrift.PublishData;
import ezbake.security.client.EzbakeSecurityClient;
import ezbake.security.test.MockEzSecurityToken;
import ezbake.thrift.ThriftClientPool;
import ezbake.warehaus.UpdateEntry;

public class ContentPublisherClient {
    private TSerializer serializer = new TSerializer(new TSimpleJSONProtocol.Factory());
    private ThriftClientPool pool;

    @Option(name="-f", aliases = "--configFile",
            usage="The configuration file for the content publisher client to be instantiated", required = true)
    private String configFile;

    public void run() throws IOException, TException {
        Properties props = new Properties();
        props.load(new FileInputStream(new File(configFile)));
        pool = new ThriftClientPool(props);
        ContentPublisher.Client client = pool.getClient("content-publisher", ContentPublisher.Client.class);

        Visibility visibility = new Visibility().setFormalVisibility("U");

        String parsedData = "this is parsed data";

        PublishData data = new PublishData();
        UpdateEntry entry = new UpdateEntry("DEV://contentpublisher/test");
        entry.setRawData(ByteBuffer.wrap("this is raw data".getBytes()));
        entry.setParsedData(ByteBuffer.wrap(parsedData.getBytes()));

        SSRJSON ssrjson = new SSRJSON();
        SSR ssr = new SSR();
        ssr.setUri(entry.getUri());
        ssr.setVisibility(visibility);
        ssrjson.setSsr(ssr);
        ssrjson.setJsonString(serializer.toString(ssr));

        data.setEntry(entry);
        data.setSsrjson(ssrjson);
        data.setFeedname("publishContent");

        System.out.println("sending message");
        try {
            client.publish(data, visibility, getToken(props));
        } catch (Exception e ) {
            e.printStackTrace();
        }
        System.out.println("sent message");
    }

    public static void main(String[] args) {
        ContentPublisherClient client = new ContentPublisherClient();
        CmdLineParser parser = new CmdLineParser(client);

        try {
            parser.parseArgument(args);
            client.run();
        } catch (CmdLineException e) {
            System.err.println(e.getMessage());
            parser.printUsage(System.err);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

    private EzSecurityToken getToken(Properties props) 
            throws EzSecurityTokenException, IOException {
        EzbakeSecurityClient client = new EzbakeSecurityClient(props);
        EzSecurityToken usertoken = client.fetchTokenForProxiedUser();
        client.close();
        return usertoken;
    }
}
