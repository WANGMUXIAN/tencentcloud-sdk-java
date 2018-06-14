package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeVpnGatewaysResponse  extends AbstractModel{


    /**
    * 符合条件的实例数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * VPN网关实例详细信息列表。
    */
    @SerializedName("VpnGatewaySet")
    @Expose
    private VpnGateway [] VpnGatewaySet;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取符合条件的实例数量。
     * @return TotalCount 符合条件的实例数量。
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置符合条件的实例数量。
     * @param TotalCount 符合条件的实例数量。
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取VPN网关实例详细信息列表。
     * @return VpnGatewaySet VPN网关实例详细信息列表。
     */
    public VpnGateway [] getVpnGatewaySet() {
        return this.VpnGatewaySet;
    }

    /**
     * 设置VPN网关实例详细信息列表。
     * @param VpnGatewaySet VPN网关实例详细信息列表。
     */
    public void setVpnGatewaySet(VpnGateway [] VpnGatewaySet) {
        this.VpnGatewaySet = VpnGatewaySet;
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "VpnGatewaySet.", this.VpnGatewaySet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

