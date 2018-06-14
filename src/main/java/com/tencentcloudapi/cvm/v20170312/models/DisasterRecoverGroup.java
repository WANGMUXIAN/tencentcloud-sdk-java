package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DisasterRecoverGroup  extends AbstractModel{


    /**
    * 分散置放群组id。
    */
    @SerializedName("DisasterRecoverGroupId")
    @Expose
    private String DisasterRecoverGroupId;

    /**
    * 分散置放群组名称，长度1-60个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分散置放群组类型，取值范围：<br><li>HOST：物理机<br><li>SW：交换机<br><li>RACK：机架
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 分散置放群组内最大容纳云主机数量。
    */
    @SerializedName("CvmQuotaTotal")
    @Expose
    private Integer CvmQuotaTotal;

    /**
    * 分散置放群组内云主机当前数量。
    */
    @SerializedName("CurrentNum")
    @Expose
    private Integer CurrentNum;

    /**
    * 分散置放群组内，云主机id列表。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 分散置放群组创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * 获取分散置放群组id。
     * @return DisasterRecoverGroupId 分散置放群组id。
     */
    public String getDisasterRecoverGroupId() {
        return this.DisasterRecoverGroupId;
    }

    /**
     * 设置分散置放群组id。
     * @param DisasterRecoverGroupId 分散置放群组id。
     */
    public void setDisasterRecoverGroupId(String DisasterRecoverGroupId) {
        this.DisasterRecoverGroupId = DisasterRecoverGroupId;
    }

    /**
     * 获取分散置放群组名称，长度1-60个字符。
     * @return Name 分散置放群组名称，长度1-60个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置分散置放群组名称，长度1-60个字符。
     * @param Name 分散置放群组名称，长度1-60个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取分散置放群组类型，取值范围：<br><li>HOST：物理机<br><li>SW：交换机<br><li>RACK：机架
     * @return Type 分散置放群组类型，取值范围：<br><li>HOST：物理机<br><li>SW：交换机<br><li>RACK：机架
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置分散置放群组类型，取值范围：<br><li>HOST：物理机<br><li>SW：交换机<br><li>RACK：机架
     * @param Type 分散置放群组类型，取值范围：<br><li>HOST：物理机<br><li>SW：交换机<br><li>RACK：机架
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取分散置放群组内最大容纳云主机数量。
     * @return CvmQuotaTotal 分散置放群组内最大容纳云主机数量。
     */
    public Integer getCvmQuotaTotal() {
        return this.CvmQuotaTotal;
    }

    /**
     * 设置分散置放群组内最大容纳云主机数量。
     * @param CvmQuotaTotal 分散置放群组内最大容纳云主机数量。
     */
    public void setCvmQuotaTotal(Integer CvmQuotaTotal) {
        this.CvmQuotaTotal = CvmQuotaTotal;
    }

    /**
     * 获取分散置放群组内云主机当前数量。
     * @return CurrentNum 分散置放群组内云主机当前数量。
     */
    public Integer getCurrentNum() {
        return this.CurrentNum;
    }

    /**
     * 设置分散置放群组内云主机当前数量。
     * @param CurrentNum 分散置放群组内云主机当前数量。
     */
    public void setCurrentNum(Integer CurrentNum) {
        this.CurrentNum = CurrentNum;
    }

    /**
     * 获取分散置放群组内，云主机id列表。
     * @return InstanceIds 分散置放群组内，云主机id列表。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * 设置分散置放群组内，云主机id列表。
     * @param InstanceIds 分散置放群组内，云主机id列表。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * 获取分散置放群组创建时间。
     * @return CreateTime 分散置放群组创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置分散置放群组创建时间。
     * @param CreateTime 分散置放群组创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisasterRecoverGroupId", this.DisasterRecoverGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CvmQuotaTotal", this.CvmQuotaTotal);
        this.setParamSimple(map, prefix + "CurrentNum", this.CurrentNum);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

