package com.gzw.login.data;



import com.gzw.login.entry.request.LogoRequest;
import com.gzw.login.entry.response.LogoResponse;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by gzw on 2016/12/28.
 */

public interface Service {

    @POST("/api/4/start-image/1080*1776")
    Observable<LogoResponse> getLogo(@Body LogoRequest request);
}
