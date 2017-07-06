package com.gzw.data;



import com.gzw.login.entry.request.UserRequest;
import com.gzw.login.entry.response.GitHubUserInfo;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by gzw on 2016/12/28.
 */

public interface Service {

    @POST("/users")
    Observable<GitHubUserInfo> getUserInfo1(@Body UserRequest request);//post方式通过gson的conver把request对象转换成RequestBody，通过gson把ResponseBody转换成GitHubUserInfo

    @GET("/users/{user}")
    Observable<GitHubUserInfo> getUserInfo2(@Path("user") String user);//Path注解的意思是替换路径中的参数，例如调用getUserInfo2("gzw");/users/gzw

    @GET("/users")
    Observable<GitHubUserInfo> getUserInfo3(@Query("user") String user);//Query注解是在路径后面添加参数，例如调用getUserInfo3("gzw");/users?user=gzw

}
