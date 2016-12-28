package com.gzw.login.entry.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by gzw on 2016/12/28.
 */

public class LogoResponse {

    @SerializedName("text")
    @Expose
    public String info;

    @SerializedName("img")
    @Expose
    public String img_url;
}
