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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedisNode extends AbstractModel{

    /**
    * 节点key的个数
    */
    @SerializedName("Keys")
    @Expose
    private Long Keys;

    /**
    * 节点slot分布
    */
    @SerializedName("Slot")
    @Expose
    private String Slot;

    /**
    * 节点的序列ID
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 节点的状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 节点key的个数 
     * @return Keys 节点key的个数
     */
    public Long getKeys() {
        return this.Keys;
    }

    /**
     * Set 节点key的个数
     * @param Keys 节点key的个数
     */
    public void setKeys(Long Keys) {
        this.Keys = Keys;
    }

    /**
     * Get 节点slot分布 
     * @return Slot 节点slot分布
     */
    public String getSlot() {
        return this.Slot;
    }

    /**
     * Set 节点slot分布
     * @param Slot 节点slot分布
     */
    public void setSlot(String Slot) {
        this.Slot = Slot;
    }

    /**
     * Get 节点的序列ID 
     * @return NodeId 节点的序列ID
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点的序列ID
     * @param NodeId 节点的序列ID
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 节点的状态 
     * @return Status 节点的状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 节点的状态
     * @param Status 节点的状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keys", this.Keys);
        this.setParamSimple(map, prefix + "Slot", this.Slot);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

