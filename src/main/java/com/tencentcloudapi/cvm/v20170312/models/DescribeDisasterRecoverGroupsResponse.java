package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeDisasterRecoverGroupsResponse  extends AbstractModel{


    /**
    * 分散置放群组信息列表。
    */
    @SerializedName("DisasterRecoverGroupSet")
    @Expose
    private DisasterRecoverGroup [] DisasterRecoverGroupSet;

    /**
    * 用户置放群组总量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取分散置放群组信息列表。
     * @return DisasterRecoverGroupSet 分散置放群组信息列表。
     */
    public DisasterRecoverGroup [] getDisasterRecoverGroupSet() {
        return this.DisasterRecoverGroupSet;
    }

    /**
     * 设置分散置放群组信息列表。
     * @param DisasterRecoverGroupSet 分散置放群组信息列表。
     */
    public void setDisasterRecoverGroupSet(DisasterRecoverGroup [] DisasterRecoverGroupSet) {
        this.DisasterRecoverGroupSet = DisasterRecoverGroupSet;
    }

    /**
     * 获取用户置放群组总量。
     * @return TotalCount 用户置放群组总量。
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置用户置放群组总量。
     * @param TotalCount 用户置放群组总量。
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DisasterRecoverGroupSet.", this.DisasterRecoverGroupSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

