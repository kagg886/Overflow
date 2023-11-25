package cn.evole.onebot.sdk.response.group;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * Created on 2022/9/6.
 *
 * @author cnlimiter
 */
@Data
public class GetMsgResp {

    /**
     * 消息id
     */
    @SerializedName("message_id")
    public int messageId;

    /**
     * 消息真实id
     */
    @SerializedName("real_id")
    public int realId;

    /**
     * 发送者
     */
    @SerializedName("sender")
    public Sender sender;

    /**
     * 发送时间
     */
    @SerializedName("time")
    public int time;

    /**
     * 消息内容
     */
    @SerializedName("message")
    public String message;

    /**
     * 原始消息内容
     */
    @SerializedName("raw_message")
    public String rawMessage;

    /**
     * sender信息
     */
    @Data
    public static class Sender {

        @SerializedName("user_id")
        public String userId;

        @SerializedName("nickname")
        public String nickname;

        @SerializedName("card")
        public String card;

        @SerializedName("sex")
        public String sex;

        @SerializedName("age")
        public int age;

        @SerializedName("area")
        public String area;

        @SerializedName("level")
        public String level;

        @SerializedName("role")
        public String role;

        @SerializedName("title")
        public String title;

    }

}