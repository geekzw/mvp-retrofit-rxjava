package com.gzw.login.entry.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by gzw on 2016/12/28.
 */

public class GitHubUserInfo {

    @SerializedName("organizations_url")
    @Expose
    public String mOrganizationsUrl;

    @SerializedName("avatar_url")
    @Expose
    public String mAvatarUrl;

    @SerializedName("gravatar_id")
    @Expose
    public String mGravatarId;

    @SerializedName("public_gists")
    @Expose
    public String mPublicGists;

    @SerializedName("site_admin")
    @Expose
    public String mSiteAdmin;

    @SerializedName("type")
    @Expose
    public String mType;

    @SerializedName("id")
    @Expose
    public String mId;

    @Override
    public String toString() {
        return "GitHubUserInfo{" +
                "mOrganizationsUrl='" + mOrganizationsUrl + '\'' +
                ", mAvatarUrl='" + mAvatarUrl + '\'' +
                ", mGravatarId='" + mGravatarId + '\'' +
                ", mPublicGists='" + mPublicGists + '\'' +
                ", mSiteAdmin='" + mSiteAdmin + '\'' +
                ", mType='" + mType + '\'' +
                ", mId='" + mId + '\'' +
                '}';
    }
}
