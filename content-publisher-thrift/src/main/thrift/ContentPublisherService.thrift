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

namespace * ezbake.publisher.thrift

include "ezbakeBaseTypes.thrift"
include "ezbakeBaseService.thrift"
include "SSRJSON.thrift"
include "WarehausData.thrift"
include "ezbakeBaseVisibility.thrift"
include "ProvenanceRegistration.thrift"

const string SERVICE_NAME = "ContentPublisher"

struct PublishData {
    1: string feedname,
    2: WarehausData.UpdateEntry entry,
    3: optional SSRJSON.SSRJSON ssrjson,
    4: optional ProvenanceRegistration.ProvenanceRegistration provenance,
    5: optional bool ignoreProvenanceDuplicate = false
}

struct PublishResult {
    1: optional i64 provenanceDocumentId,
    2: optional i64 warehouseTimestamp
}

service ContentPublisher extends ezbakeBaseService.EzBakeBaseService {

    PublishResult publish(1: PublishData data, 2: ezbakeBaseVisibility.Visibility visibility, 3: ezbakeBaseTypes.EzSecurityToken token);
}
