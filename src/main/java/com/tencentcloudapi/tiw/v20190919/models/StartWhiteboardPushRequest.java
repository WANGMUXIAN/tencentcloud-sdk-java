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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartWhiteboardPushRequest extends AbstractModel{

    /**
    * 客户的SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 需要推流白板的房间号，取值范围: (1, 4294967295)
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 用于白板推流服务进房进行推流的用户ID，最大长度不能大于60个字节，该ID必须是一个单独的未在SDK中使用的ID，白板推流服务使用这个用户ID进入房间进行白板音视频推流，若该ID和SDK中使用的ID重复，会导致SDK和白板推流服务互踢，影响正常推流。
    */
    @SerializedName("PushUserId")
    @Expose
    private String PushUserId;

    /**
    * 与PushUserId对应的签名
    */
    @SerializedName("PushUserSig")
    @Expose
    private String PushUserSig;

    /**
    * 白板参数，例如白板宽高、背景颜色等
    */
    @SerializedName("Whiteboard")
    @Expose
    private Whiteboard Whiteboard;

    /**
    * 自动停止推流超时时间，单位秒，取值范围[300, 259200], 默认值为1800秒。

当白板超过设定时间没有操作的时候，白板推流服务会自动停止白板推流。
    */
    @SerializedName("AutoStopTimeout")
    @Expose
    private Long AutoStopTimeout;

    /**
    * 对主白板推流任务进行操作时，是否同时同步操作备份任务
    */
    @SerializedName("AutoManageBackup")
    @Expose
    private Boolean AutoManageBackup;

    /**
    * 备份白板推流相关参数。

指定了备份参数的情况下，白板推流服务会在房间内新增一路白板画面视频流，即同一个房间内会有两路白板画面推流。
    */
    @SerializedName("Backup")
    @Expose
    private WhiteboardPushBackupParam Backup;

    /**
    * 在实时音视频云端录制模式选择为 `指定用户录制` 模式的时候是否自动录制白板推流。

默认在实时音视频的云端录制模式选择为 `指定用户录制` 模式的情况下，不会自动进行白板推流录制，如果希望进行白板推流录制，请将此参数设置为true。

如果实时音视频的云端录制模式选择为 `全局自动录制` 模式，可忽略此参数。
    */
    @SerializedName("AutoRecord")
    @Expose
    private Boolean AutoRecord;

    /**
    * 内部参数，不需要关注此参数
    */
    @SerializedName("ExtraData")
    @Expose
    private String ExtraData;

    /**
     * Get 客户的SdkAppId 
     * @return SdkAppId 客户的SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 客户的SdkAppId
     * @param SdkAppId 客户的SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 需要推流白板的房间号，取值范围: (1, 4294967295) 
     * @return RoomId 需要推流白板的房间号，取值范围: (1, 4294967295)
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 需要推流白板的房间号，取值范围: (1, 4294967295)
     * @param RoomId 需要推流白板的房间号，取值范围: (1, 4294967295)
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 用于白板推流服务进房进行推流的用户ID，最大长度不能大于60个字节，该ID必须是一个单独的未在SDK中使用的ID，白板推流服务使用这个用户ID进入房间进行白板音视频推流，若该ID和SDK中使用的ID重复，会导致SDK和白板推流服务互踢，影响正常推流。 
     * @return PushUserId 用于白板推流服务进房进行推流的用户ID，最大长度不能大于60个字节，该ID必须是一个单独的未在SDK中使用的ID，白板推流服务使用这个用户ID进入房间进行白板音视频推流，若该ID和SDK中使用的ID重复，会导致SDK和白板推流服务互踢，影响正常推流。
     */
    public String getPushUserId() {
        return this.PushUserId;
    }

    /**
     * Set 用于白板推流服务进房进行推流的用户ID，最大长度不能大于60个字节，该ID必须是一个单独的未在SDK中使用的ID，白板推流服务使用这个用户ID进入房间进行白板音视频推流，若该ID和SDK中使用的ID重复，会导致SDK和白板推流服务互踢，影响正常推流。
     * @param PushUserId 用于白板推流服务进房进行推流的用户ID，最大长度不能大于60个字节，该ID必须是一个单独的未在SDK中使用的ID，白板推流服务使用这个用户ID进入房间进行白板音视频推流，若该ID和SDK中使用的ID重复，会导致SDK和白板推流服务互踢，影响正常推流。
     */
    public void setPushUserId(String PushUserId) {
        this.PushUserId = PushUserId;
    }

    /**
     * Get 与PushUserId对应的签名 
     * @return PushUserSig 与PushUserId对应的签名
     */
    public String getPushUserSig() {
        return this.PushUserSig;
    }

    /**
     * Set 与PushUserId对应的签名
     * @param PushUserSig 与PushUserId对应的签名
     */
    public void setPushUserSig(String PushUserSig) {
        this.PushUserSig = PushUserSig;
    }

    /**
     * Get 白板参数，例如白板宽高、背景颜色等 
     * @return Whiteboard 白板参数，例如白板宽高、背景颜色等
     */
    public Whiteboard getWhiteboard() {
        return this.Whiteboard;
    }

    /**
     * Set 白板参数，例如白板宽高、背景颜色等
     * @param Whiteboard 白板参数，例如白板宽高、背景颜色等
     */
    public void setWhiteboard(Whiteboard Whiteboard) {
        this.Whiteboard = Whiteboard;
    }

    /**
     * Get 自动停止推流超时时间，单位秒，取值范围[300, 259200], 默认值为1800秒。

当白板超过设定时间没有操作的时候，白板推流服务会自动停止白板推流。 
     * @return AutoStopTimeout 自动停止推流超时时间，单位秒，取值范围[300, 259200], 默认值为1800秒。

当白板超过设定时间没有操作的时候，白板推流服务会自动停止白板推流。
     */
    public Long getAutoStopTimeout() {
        return this.AutoStopTimeout;
    }

    /**
     * Set 自动停止推流超时时间，单位秒，取值范围[300, 259200], 默认值为1800秒。

当白板超过设定时间没有操作的时候，白板推流服务会自动停止白板推流。
     * @param AutoStopTimeout 自动停止推流超时时间，单位秒，取值范围[300, 259200], 默认值为1800秒。

当白板超过设定时间没有操作的时候，白板推流服务会自动停止白板推流。
     */
    public void setAutoStopTimeout(Long AutoStopTimeout) {
        this.AutoStopTimeout = AutoStopTimeout;
    }

    /**
     * Get 对主白板推流任务进行操作时，是否同时同步操作备份任务 
     * @return AutoManageBackup 对主白板推流任务进行操作时，是否同时同步操作备份任务
     */
    public Boolean getAutoManageBackup() {
        return this.AutoManageBackup;
    }

    /**
     * Set 对主白板推流任务进行操作时，是否同时同步操作备份任务
     * @param AutoManageBackup 对主白板推流任务进行操作时，是否同时同步操作备份任务
     */
    public void setAutoManageBackup(Boolean AutoManageBackup) {
        this.AutoManageBackup = AutoManageBackup;
    }

    /**
     * Get 备份白板推流相关参数。

指定了备份参数的情况下，白板推流服务会在房间内新增一路白板画面视频流，即同一个房间内会有两路白板画面推流。 
     * @return Backup 备份白板推流相关参数。

指定了备份参数的情况下，白板推流服务会在房间内新增一路白板画面视频流，即同一个房间内会有两路白板画面推流。
     */
    public WhiteboardPushBackupParam getBackup() {
        return this.Backup;
    }

    /**
     * Set 备份白板推流相关参数。

指定了备份参数的情况下，白板推流服务会在房间内新增一路白板画面视频流，即同一个房间内会有两路白板画面推流。
     * @param Backup 备份白板推流相关参数。

指定了备份参数的情况下，白板推流服务会在房间内新增一路白板画面视频流，即同一个房间内会有两路白板画面推流。
     */
    public void setBackup(WhiteboardPushBackupParam Backup) {
        this.Backup = Backup;
    }

    /**
     * Get 在实时音视频云端录制模式选择为 `指定用户录制` 模式的时候是否自动录制白板推流。

默认在实时音视频的云端录制模式选择为 `指定用户录制` 模式的情况下，不会自动进行白板推流录制，如果希望进行白板推流录制，请将此参数设置为true。

如果实时音视频的云端录制模式选择为 `全局自动录制` 模式，可忽略此参数。 
     * @return AutoRecord 在实时音视频云端录制模式选择为 `指定用户录制` 模式的时候是否自动录制白板推流。

默认在实时音视频的云端录制模式选择为 `指定用户录制` 模式的情况下，不会自动进行白板推流录制，如果希望进行白板推流录制，请将此参数设置为true。

如果实时音视频的云端录制模式选择为 `全局自动录制` 模式，可忽略此参数。
     */
    public Boolean getAutoRecord() {
        return this.AutoRecord;
    }

    /**
     * Set 在实时音视频云端录制模式选择为 `指定用户录制` 模式的时候是否自动录制白板推流。

默认在实时音视频的云端录制模式选择为 `指定用户录制` 模式的情况下，不会自动进行白板推流录制，如果希望进行白板推流录制，请将此参数设置为true。

如果实时音视频的云端录制模式选择为 `全局自动录制` 模式，可忽略此参数。
     * @param AutoRecord 在实时音视频云端录制模式选择为 `指定用户录制` 模式的时候是否自动录制白板推流。

默认在实时音视频的云端录制模式选择为 `指定用户录制` 模式的情况下，不会自动进行白板推流录制，如果希望进行白板推流录制，请将此参数设置为true。

如果实时音视频的云端录制模式选择为 `全局自动录制` 模式，可忽略此参数。
     */
    public void setAutoRecord(Boolean AutoRecord) {
        this.AutoRecord = AutoRecord;
    }

    /**
     * Get 内部参数，不需要关注此参数 
     * @return ExtraData 内部参数，不需要关注此参数
     */
    public String getExtraData() {
        return this.ExtraData;
    }

    /**
     * Set 内部参数，不需要关注此参数
     * @param ExtraData 内部参数，不需要关注此参数
     */
    public void setExtraData(String ExtraData) {
        this.ExtraData = ExtraData;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "PushUserId", this.PushUserId);
        this.setParamSimple(map, prefix + "PushUserSig", this.PushUserSig);
        this.setParamObj(map, prefix + "Whiteboard.", this.Whiteboard);
        this.setParamSimple(map, prefix + "AutoStopTimeout", this.AutoStopTimeout);
        this.setParamSimple(map, prefix + "AutoManageBackup", this.AutoManageBackup);
        this.setParamObj(map, prefix + "Backup.", this.Backup);
        this.setParamSimple(map, prefix + "AutoRecord", this.AutoRecord);
        this.setParamSimple(map, prefix + "ExtraData", this.ExtraData);

    }
}

