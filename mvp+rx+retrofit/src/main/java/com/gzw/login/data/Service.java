package com.gzw.login.data;



import com.gzw.login.entry.request.UserRequest;
import com.gzw.login.entry.response.GitHubUserInfo;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by gzw on 2016/12/28.
 */

public interface Service {

    @POST("/users")
    Observable<GitHubUserInfo> getUserInfo1(@Body UserRequest request);

    @GET("/users/{user}")
    Observable<GitHubUserInfo> getUserInfo2(@Path("user") String user);

    @GET("/users")
    Observable<GitHubUserInfo> getUserInfo3(@Query("user") String user);

}
