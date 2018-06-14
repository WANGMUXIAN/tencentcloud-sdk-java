package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateRoutesRequest  extends AbstractModel{


    /**
    * 路由表实例ID。
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * 路由策略对象。
    */
    @SerializedName("Routes")
    @Expose
    private String [] Routes;

    /**
     * 获取路由表实例ID。
     * @return RouteTableId 路由表实例ID。
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * 设置路由表实例ID。
     * @param RouteTableId 路由表实例ID。
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * 获取路由策略对象。
     * @return Routes 路由策略对象。
     */
    public String [] getRoutes() {
        return this.Routes;
    }

    /**
     * 设置路由策略对象。
     * @param Routes 路由策略对象。
     */
    public void setRoutes(String [] Routes) {
        this.Routes = Routes;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamArraySimple(map, prefix + "Routes.", this.Routes);

    }
}

