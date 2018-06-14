package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class IKEOptionsSpecification  extends AbstractModel{


    /**
    * 加密算法，可选值：'3DES-CBC', 'AES-CBC-128', 'AES-CBS-192', 'AES-CBC-256', 'DES-CBC'，默认为3DES-CBC
    */
    @SerializedName("PropoEncryAlgorithm")
    @Expose
    private String PropoEncryAlgorithm;

    /**
    * 认证算法：可选值：'MD5', 'SHA1'，默认为MD5
    */
    @SerializedName("PropoAuthenAlgorithm")
    @Expose
    private String PropoAuthenAlgorithm;

    /**
    * 协商模式：可选值：'AGGRESSIVE', 'MAIN'，默认为MAIN
    */
    @SerializedName("ExchangeMode")
    @Expose
    private String ExchangeMode;

    /**
    * 本端标识类型：可选值：'ADDRESS', 'FQDN'，默认为ADDRESS
    */
    @SerializedName("LocalIdentity")
    @Expose
    private String LocalIdentity;

    /**
    * 对端标识类型：可选值：'ADDRESS', 'FQDN'，默认为ADDRESS
    */
    @SerializedName("RemoteIdentity")
    @Expose
    private String RemoteIdentity;

    /**
    * 本端标识，当LocalIdentity选为ADDRESS时，LocalAddress必填。localAddress默认为vpn网关公网IP
    */
    @SerializedName("LocalAddress")
    @Expose
    private String LocalAddress;

    /**
    * 对端标识，当RemoteIdentity选为ADDRESS时，RemoteAddress必填
    */
    @SerializedName("RemoteAddress")
    @Expose
    private String RemoteAddress;

    /**
    * 本端标识，当LocalIdentity选为FQDN时，LocalFqdnName必填
    */
    @SerializedName("LocalFqdnName")
    @Expose
    private String LocalFqdnName;

    /**
    * 对端标识，当remoteIdentity选为FQDN时，RemoteFqdnName必填
    */
    @SerializedName("RemoteFqdnName")
    @Expose
    private String RemoteFqdnName;

    /**
    * DH group，指定IKE交换密钥时使用的DH组，可选值：'GROUP1', 'GROUP2', 'GROUP5', 'GROUP14', 'GROUP24'，
    */
    @SerializedName("DhGroupName")
    @Expose
    private String DhGroupName;

    /**
    * IKE SA Lifetime，单位：秒，设置IKE SA的生存周期，取值范围：60-604800
    */
    @SerializedName("IKESaLifetimeSeconds")
    @Expose
    private Integer IKESaLifetimeSeconds;

    /**
    * IKE版本
    */
    @SerializedName("IKEVersion")
    @Expose
    private String IKEVersion;

    /**
     * 获取加密算法，可选值：'3DES-CBC', 'AES-CBC-128', 'AES-CBS-192', 'AES-CBC-256', 'DES-CBC'，默认为3DES-CBC
     * @return PropoEncryAlgorithm 加密算法，可选值：'3DES-CBC', 'AES-CBC-128', 'AES-CBS-192', 'AES-CBC-256', 'DES-CBC'，默认为3DES-CBC
     */
    public String getPropoEncryAlgorithm() {
        return this.PropoEncryAlgorithm;
    }

    /**
     * 设置加密算法，可选值：'3DES-CBC', 'AES-CBC-128', 'AES-CBS-192', 'AES-CBC-256', 'DES-CBC'，默认为3DES-CBC
     * @param PropoEncryAlgorithm 加密算法，可选值：'3DES-CBC', 'AES-CBC-128', 'AES-CBS-192', 'AES-CBC-256', 'DES-CBC'，默认为3DES-CBC
     */
    public void setPropoEncryAlgorithm(String PropoEncryAlgorithm) {
        this.PropoEncryAlgorithm = PropoEncryAlgorithm;
    }

    /**
     * 获取认证算法：可选值：'MD5', 'SHA1'，默认为MD5
     * @return PropoAuthenAlgorithm 认证算法：可选值：'MD5', 'SHA1'，默认为MD5
     */
    public String getPropoAuthenAlgorithm() {
        return this.PropoAuthenAlgorithm;
    }

    /**
     * 设置认证算法：可选值：'MD5', 'SHA1'，默认为MD5
     * @param PropoAuthenAlgorithm 认证算法：可选值：'MD5', 'SHA1'，默认为MD5
     */
    public void setPropoAuthenAlgorithm(String PropoAuthenAlgorithm) {
        this.PropoAuthenAlgorithm = PropoAuthenAlgorithm;
    }

    /**
     * 获取协商模式：可选值：'AGGRESSIVE', 'MAIN'，默认为MAIN
     * @return ExchangeMode 协商模式：可选值：'AGGRESSIVE', 'MAIN'，默认为MAIN
     */
    public String getExchangeMode() {
        return this.ExchangeMode;
    }

    /**
     * 设置协商模式：可选值：'AGGRESSIVE', 'MAIN'，默认为MAIN
     * @param ExchangeMode 协商模式：可选值：'AGGRESSIVE', 'MAIN'，默认为MAIN
     */
    public void setExchangeMode(String ExchangeMode) {
        this.ExchangeMode = ExchangeMode;
    }

    /**
     * 获取本端标识类型：可选值：'ADDRESS', 'FQDN'，默认为ADDRESS
     * @return LocalIdentity 本端标识类型：可选值：'ADDRESS', 'FQDN'，默认为ADDRESS
     */
    public String getLocalIdentity() {
        return this.LocalIdentity;
    }

    /**
     * 设置本端标识类型：可选值：'ADDRESS', 'FQDN'，默认为ADDRESS
     * @param LocalIdentity 本端标识类型：可选值：'ADDRESS', 'FQDN'，默认为ADDRESS
     */
    public void setLocalIdentity(String LocalIdentity) {
        this.LocalIdentity = LocalIdentity;
    }

    /**
     * 获取对端标识类型：可选值：'ADDRESS', 'FQDN'，默认为ADDRESS
     * @return RemoteIdentity 对端标识类型：可选值：'ADDRESS', 'FQDN'，默认为ADDRESS
     */
    public String getRemoteIdentity() {
        return this.RemoteIdentity;
    }

    /**
     * 设置对端标识类型：可选值：'ADDRESS', 'FQDN'，默认为ADDRESS
     * @param RemoteIdentity 对端标识类型：可选值：'ADDRESS', 'FQDN'，默认为ADDRESS
     */
    public void setRemoteIdentity(String RemoteIdentity) {
        this.RemoteIdentity = RemoteIdentity;
    }

    /**
     * 获取本端标识，当LocalIdentity选为ADDRESS时，LocalAddress必填。localAddress默认为vpn网关公网IP
     * @return LocalAddress 本端标识，当LocalIdentity选为ADDRESS时，LocalAddress必填。localAddress默认为vpn网关公网IP
     */
    public String getLocalAddress() {
        return this.LocalAddress;
    }

    /**
     * 设置本端标识，当LocalIdentity选为ADDRESS时，LocalAddress必填。localAddress默认为vpn网关公网IP
     * @param LocalAddress 本端标识，当LocalIdentity选为ADDRESS时，LocalAddress必填。localAddress默认为vpn网关公网IP
     */
    public void setLocalAddress(String LocalAddress) {
        this.LocalAddress = LocalAddress;
    }

    /**
     * 获取对端标识，当RemoteIdentity选为ADDRESS时，RemoteAddress必填
     * @return RemoteAddress 对端标识，当RemoteIdentity选为ADDRESS时，RemoteAddress必填
     */
    public String getRemoteAddress() {
        return this.RemoteAddress;
    }

    /**
     * 设置对端标识，当RemoteIdentity选为ADDRESS时，RemoteAddress必填
     * @param RemoteAddress 对端标识，当RemoteIdentity选为ADDRESS时，RemoteAddress必填
     */
    public void setRemoteAddress(String RemoteAddress) {
        this.RemoteAddress = RemoteAddress;
    }

    /**
     * 获取本端标识，当LocalIdentity选为FQDN时，LocalFqdnName必填
     * @return LocalFqdnName 本端标识，当LocalIdentity选为FQDN时，LocalFqdnName必填
     */
    public String getLocalFqdnName() {
        return this.LocalFqdnName;
    }

    /**
     * 设置本端标识，当LocalIdentity选为FQDN时，LocalFqdnName必填
     * @param LocalFqdnName 本端标识，当LocalIdentity选为FQDN时，LocalFqdnName必填
     */
    public void setLocalFqdnName(String LocalFqdnName) {
        this.LocalFqdnName = LocalFqdnName;
    }

    /**
     * 获取对端标识，当remoteIdentity选为FQDN时，RemoteFqdnName必填
     * @return RemoteFqdnName 对端标识，当remoteIdentity选为FQDN时，RemoteFqdnName必填
     */
    public String getRemoteFqdnName() {
        return this.RemoteFqdnName;
    }

    /**
     * 设置对端标识，当remoteIdentity选为FQDN时，RemoteFqdnName必填
     * @param RemoteFqdnName 对端标识，当remoteIdentity选为FQDN时，RemoteFqdnName必填
     */
    public void setRemoteFqdnName(String RemoteFqdnName) {
        this.RemoteFqdnName = RemoteFqdnName;
    }

    /**
     * 获取DH group，指定IKE交换密钥时使用的DH组，可选值：'GROUP1', 'GROUP2', 'GROUP5', 'GROUP14', 'GROUP24'，
     * @return DhGroupName DH group，指定IKE交换密钥时使用的DH组，可选值：'GROUP1', 'GROUP2', 'GROUP5', 'GROUP14', 'GROUP24'，
     */
    public String getDhGroupName() {
        return this.DhGroupName;
    }

    /**
     * 设置DH group，指定IKE交换密钥时使用的DH组，可选值：'GROUP1', 'GROUP2', 'GROUP5', 'GROUP14', 'GROUP24'，
     * @param DhGroupName DH group，指定IKE交换密钥时使用的DH组，可选值：'GROUP1', 'GROUP2', 'GROUP5', 'GROUP14', 'GROUP24'，
     */
    public void setDhGroupName(String DhGroupName) {
        this.DhGroupName = DhGroupName;
    }

    /**
     * 获取IKE SA Lifetime，单位：秒，设置IKE SA的生存周期，取值范围：60-604800
     * @return IKESaLifetimeSeconds IKE SA Lifetime，单位：秒，设置IKE SA的生存周期，取值范围：60-604800
     */
    public Integer getIKESaLifetimeSeconds() {
        return this.IKESaLifetimeSeconds;
    }

    /**
     * 设置IKE SA Lifetime，单位：秒，设置IKE SA的生存周期，取值范围：60-604800
     * @param IKESaLifetimeSeconds IKE SA Lifetime，单位：秒，设置IKE SA的生存周期，取值范围：60-604800
     */
    public void setIKESaLifetimeSeconds(Integer IKESaLifetimeSeconds) {
        this.IKESaLifetimeSeconds = IKESaLifetimeSeconds;
    }

    /**
     * 获取IKE版本
     * @return IKEVersion IKE版本
     */
    public String getIKEVersion() {
        return this.IKEVersion;
    }

    /**
     * 设置IKE版本
     * @param IKEVersion IKE版本
     */
    public void setIKEVersion(String IKEVersion) {
        this.IKEVersion = IKEVersion;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PropoEncryAlgorithm", this.PropoEncryAlgorithm);
        this.setParamSimple(map, prefix + "PropoAuthenAlgorithm", this.PropoAuthenAlgorithm);
        this.setParamSimple(map, prefix + "ExchangeMode", this.ExchangeMode);
        this.setParamSimple(map, prefix + "LocalIdentity", this.LocalIdentity);
        this.setParamSimple(map, prefix + "RemoteIdentity", this.RemoteIdentity);
        this.setParamSimple(map, prefix + "LocalAddress", this.LocalAddress);
        this.setParamSimple(map, prefix + "RemoteAddress", this.RemoteAddress);
        this.setParamSimple(map, prefix + "LocalFqdnName", this.LocalFqdnName);
        this.setParamSimple(map, prefix + "RemoteFqdnName", this.RemoteFqdnName);
        this.setParamSimple(map, prefix + "DhGroupName", this.DhGroupName);
        this.setParamSimple(map, prefix + "IKESaLifetimeSeconds", this.IKESaLifetimeSeconds);
        this.setParamSimple(map, prefix + "IKEVersion", this.IKEVersion);

    }
}

