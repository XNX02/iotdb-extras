/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.iotdb.collector.api.ping.impl;

import org.apache.iotdb.collector.api.ping.PingApiService;
import org.apache.iotdb.collector.api.ping.model.ExecutionStatus;
import org.apache.iotdb.rpc.TSStatusCode;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

public class PingApiServiceImpl extends PingApiService {

  @Override
  public Response tryPing(final SecurityContext securityContext) {
    return Response.ok()
        .entity(
            new ExecutionStatus()
                .code(TSStatusCode.SUCCESS_STATUS.getStatusCode())
                .message(TSStatusCode.SUCCESS_STATUS.name()))
        .build();
  }
}
