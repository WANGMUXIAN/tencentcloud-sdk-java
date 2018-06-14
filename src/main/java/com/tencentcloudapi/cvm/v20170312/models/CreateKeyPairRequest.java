package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateKeyPairRequest  extends AbstractModel{


    /**
    * 密钥对名称，可由数字，字母和下划线组成，长度不超过25个字符。
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * 密钥对创建后所属的项目ID。
可以通过以下方式获取项目ID：
<li>通过项目列表查询项目ID。
<li>通过调用接口DescribeProject，取返回信息中的`projectId `获取项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
     * 获取密钥对名称，可由数字，字母和下划线组成，长度不超过25个字符。
     * @return KeyName 密钥对名称，可由数字，字母和下划线组成，长度不超过25个字符。
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * 设置密钥对名称，可由数字，字母和下划线组成，长度不超过25个字符。
     * @param KeyName 密钥对名称，可由数字，字母和下划线组成，长度不超过25个字符。
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * 获取密钥对创建后所属的项目ID。
可以通过以下方式获取项目ID：
<li>通过项目列表查询项目ID。
<li>通过调用接口DescribeProject，取返回信息中的`projectId `获取项目ID。
     * @return ProjectId 密钥对创建后所属的项目ID。
可以通过以下方式获取项目ID：
<li>通过项目列表查询项目ID。
<li>通过调用接口DescribeProject，取返回信息中的`projectId `获取项目ID。
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置密钥对创建后所属的项目ID。
可以通过以下方式获取项目ID：
<li>通过项目列表查询项目ID。
<li>通过调用接口DescribeProject，取返回信息中的`projectId `获取项目ID。
     * @param ProjectId 密钥对创建后所属的项目ID。
可以通过以下方式获取项目ID：
<li>通过项目列表查询项目ID。
<li>通过调用接口DescribeProject，取返回信息中的`projectId `获取项目ID。
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

