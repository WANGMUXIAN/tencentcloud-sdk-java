package com.tencentcloudapi.mariadb.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeDBInstancesRequest  extends AbstractModel{


    /**
    * 按照一个或者多个实例 ID 查询。实例 ID 形如：tdsql-ow728lmc。每次请求的实例的上限为100。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 搜索的字段名，当前支持的值有：instancename、vip、all。传 instancename 表示按实例名进行搜索；传 vip 表示按内网IP进行搜索；传 all 将会按实例ID、实例名和内网IP进行搜索。
    */
    @SerializedName("SearchName")
    @Expose
    private String SearchName;

    /**
    * 搜索的关键字，支持模糊搜索。多个关键字使用换行符（'\n'）分割。
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 按项目 ID 查询
    */
    @SerializedName("ProjectIds")
    @Expose
    private Integer [] ProjectIds;

    /**
    * 是否根据 VPC 网络来搜索，0 为否，1 为是
    */
    @SerializedName("IsFilterVpc")
    @Expose
    private Integer IsFilterVpc;

    /**
    * 私有网络 ID， IsFilterVpc 为 1 时有效
    */
    @SerializedName("VpcId")
    @Expose
    private Integer VpcId;

    /**
    * 私有网络的子网 ID， IsFilterVpc 为 1 时有效
    */
    @SerializedName("SubnetId")
    @Expose
    private Integer SubnetId;

    /**
    * 排序字段， projectId， createtime， instancename 三者之一
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序类型， desc 或者 asc
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * 偏移量，默认为 0
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 返回数量，默认为 20，最大值为 100。
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 按 OriginSerialId 查询
    */
    @SerializedName("OriginSerialIds")
    @Expose
    private String [] OriginSerialIds;

    /**
     * 获取按照一个或者多个实例 ID 查询。实例 ID 形如：tdsql-ow728lmc。每次请求的实例的上限为100。
     * @return InstanceIds 按照一个或者多个实例 ID 查询。实例 ID 形如：tdsql-ow728lmc。每次请求的实例的上限为100。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * 设置按照一个或者多个实例 ID 查询。实例 ID 形如：tdsql-ow728lmc。每次请求的实例的上限为100。
     * @param InstanceIds 按照一个或者多个实例 ID 查询。实例 ID 形如：tdsql-ow728lmc。每次请求的实例的上限为100。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * 获取搜索的字段名，当前支持的值有：instancename、vip、all。传 instancename 表示按实例名进行搜索；传 vip 表示按内网IP进行搜索；传 all 将会按实例ID、实例名和内网IP进行搜索。
     * @return SearchName 搜索的字段名，当前支持的值有：instancename、vip、all。传 instancename 表示按实例名进行搜索；传 vip 表示按内网IP进行搜索；传 all 将会按实例ID、实例名和内网IP进行搜索。
     */
    public String getSearchName() {
        return this.SearchName;
    }

    /**
     * 设置搜索的字段名，当前支持的值有：instancename、vip、all。传 instancename 表示按实例名进行搜索；传 vip 表示按内网IP进行搜索；传 all 将会按实例ID、实例名和内网IP进行搜索。
     * @param SearchName 搜索的字段名，当前支持的值有：instancename、vip、all。传 instancename 表示按实例名进行搜索；传 vip 表示按内网IP进行搜索；传 all 将会按实例ID、实例名和内网IP进行搜索。
     */
    public void setSearchName(String SearchName) {
        this.SearchName = SearchName;
    }

    /**
     * 获取搜索的关键字，支持模糊搜索。多个关键字使用换行符（'\n'）分割。
     * @return SearchKey 搜索的关键字，支持模糊搜索。多个关键字使用换行符（'\n'）分割。
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * 设置搜索的关键字，支持模糊搜索。多个关键字使用换行符（'\n'）分割。
     * @param SearchKey 搜索的关键字，支持模糊搜索。多个关键字使用换行符（'\n'）分割。
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * 获取按项目 ID 查询
     * @return ProjectIds 按项目 ID 查询
     */
    public Integer [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * 设置按项目 ID 查询
     * @param ProjectIds 按项目 ID 查询
     */
    public void setProjectIds(Integer [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * 获取是否根据 VPC 网络来搜索，0 为否，1 为是
     * @return IsFilterVpc 是否根据 VPC 网络来搜索，0 为否，1 为是
     */
    public Integer getIsFilterVpc() {
        return this.IsFilterVpc;
    }

    /**
     * 设置是否根据 VPC 网络来搜索，0 为否，1 为是
     * @param IsFilterVpc 是否根据 VPC 网络来搜索，0 为否，1 为是
     */
    public void setIsFilterVpc(Integer IsFilterVpc) {
        this.IsFilterVpc = IsFilterVpc;
    }

    /**
     * 获取私有网络 ID， IsFilterVpc 为 1 时有效
     * @return VpcId 私有网络 ID， IsFilterVpc 为 1 时有效
     */
    public Integer getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络 ID， IsFilterVpc 为 1 时有效
     * @param VpcId 私有网络 ID， IsFilterVpc 为 1 时有效
     */
    public void setVpcId(Integer VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取私有网络的子网 ID， IsFilterVpc 为 1 时有效
     * @return SubnetId 私有网络的子网 ID， IsFilterVpc 为 1 时有效
     */
    public Integer getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置私有网络的子网 ID， IsFilterVpc 为 1 时有效
     * @param SubnetId 私有网络的子网 ID， IsFilterVpc 为 1 时有效
     */
    public void setSubnetId(Integer SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取排序字段， projectId， createtime， instancename 三者之一
     * @return OrderBy 排序字段， projectId， createtime， instancename 三者之一
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * 设置排序字段， projectId， createtime， instancename 三者之一
     * @param OrderBy 排序字段， projectId， createtime， instancename 三者之一
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * 获取排序类型， desc 或者 asc
     * @return OrderByType 排序类型， desc 或者 asc
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * 设置排序类型， desc 或者 asc
     * @param OrderByType 排序类型， desc 或者 asc
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * 获取偏移量，默认为 0
     * @return Offset 偏移量，默认为 0
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量，默认为 0
     * @param Offset 偏移量，默认为 0
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回数量，默认为 20，最大值为 100。
     * @return Limit 返回数量，默认为 20，最大值为 100。
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回数量，默认为 20，最大值为 100。
     * @param Limit 返回数量，默认为 20，最大值为 100。
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取按 OriginSerialId 查询
     * @return OriginSerialIds 按 OriginSerialId 查询
     */
    public String [] getOriginSerialIds() {
        return this.OriginSerialIds;
    }

    /**
     * 设置按 OriginSerialId 查询
     * @param OriginSerialIds 按 OriginSerialId 查询
     */
    public void setOriginSerialIds(String [] OriginSerialIds) {
        this.OriginSerialIds = OriginSerialIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "SearchName", this.SearchName);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "IsFilterVpc", this.IsFilterVpc);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "OriginSerialIds.", this.OriginSerialIds);

    }
}

