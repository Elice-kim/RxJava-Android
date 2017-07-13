package com.rxandroid.elice.rxandroid.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by elice.kim on 2017. 7. 13..
 */

public class LoginData {

    public static class Request {

        @SerializedName("user_email")
        @Expose
        public String userEmail;
        @SerializedName("user_password")
        @Expose
        public String userPassword;
        @SerializedName("user_token")
        @Expose
        public String userToken;
    }

    public static class Response{

        @SerializedName("status")
        @Expose
        public Integer status;
        @SerializedName("msg")
        @Expose
        public String msg;
        @SerializedName("data")
        @Expose
        public List<Datum> data = null;
        @SerializedName("total")
        @Expose
        public Integer total;

        public class Datum {

            @SerializedName("user_id")
            @Expose
            public Integer userId;
            @SerializedName("user_email")
            @Expose
            public String userEmail;
            @SerializedName("user_password")
            @Expose
            public String userPassword;
            @SerializedName("user_name")
            @Expose
            public String userName;
            @SerializedName("user_image_url")
            @Expose
            public Object userImageUrl;
            @SerializedName("user_gender")
            @Expose
            public String userGender;
            @SerializedName("user_birthday")
            @Expose
            public String userBirthday;
            @SerializedName("user_lunar")
            @Expose
            public Object userLunar;
            @SerializedName("user_token")
            @Expose
            public String userToken;
            @SerializedName("createdAt")
            @Expose
            public Object createdAt;
            @SerializedName("updatedAt")
            @Expose
            public Object updatedAt;

        }

    }
}
