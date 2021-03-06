/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GatewayApiGroupVo extends AbstractModel{

    /**
    * 分组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 分组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 分组下API个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupApiCount")
    @Expose
    private Long GroupApiCount;

    /**
    * 分组API列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupApis")
    @Expose
    private GatewayGroupApiVo [] GroupApis;

    /**
     * Get 分组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 分组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 分组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 分组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 分组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 分组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 分组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 分组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 分组下API个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupApiCount 分组下API个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGroupApiCount() {
        return this.GroupApiCount;
    }

    /**
     * Set 分组下API个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupApiCount 分组下API个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupApiCount(Long GroupApiCount) {
        this.GroupApiCount = GroupApiCount;
    }

    /**
     * Get 分组API列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupApis 分组API列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GatewayGroupApiVo [] getGroupApis() {
        return this.GroupApis;
    }

    /**
     * Set 分组API列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupApis 分组API列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupApis(GatewayGroupApiVo [] GroupApis) {
        this.GroupApis = GroupApis;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupApiCount", this.GroupApiCount);
        this.setParamArrayObj(map, prefix + "GroupApis.", this.GroupApis);

    }
}

