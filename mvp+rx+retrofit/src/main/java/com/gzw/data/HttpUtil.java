package com.gzw.data;


import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/**
 * Created by gzw on 2016/12/28.
 */

public class HttpUtil {
    private static Retrofit retrofit;
    private static OkHttpClient okHttpClient;

    private static ObservableTransformer observableTransformer = upstream -> upstream.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread());

    public static Service getClient(){
            if (retrofit == null) {
                retrofit = new Retrofit.Builder()
                        .baseUrl("https://api.github.com")
                        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                        .addConverterFactory(GsonConvertFactory.create())
                        .client(getInstense())
                        .build();
            }
        return retrofit.create(Service.class);
    }

    public static<T> ObservableTransformer<T,T> applyShedulers(){
        return ( ObservableTransformer<T,T>)observableTransformer;
    }

    public static OkHttpClient getInstense(){
        if(okHttpClient == null){
            LoggingInterceptor httpLoggingInterceptor = new LoggingInterceptor();
            httpLoggingInterceptor.setLevel(LoggingInterceptor.Level.BODY);
            okHttpClient = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();
        }
        return okHttpClient;
    }


}
