package com.gzw.login.entry.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by gzw on 2016/12/28.
 */

public class BaseRequest {
    @SerializedName("session")
    @Expose
    public String session;
}
