package com.gzw.login.data;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by gzw on 2016/12/28.
 */

public class HttpUtil {
    private static Retrofit retrofit;
    public static Service getClient(){
            if (retrofit == null) {
                retrofit = new Retrofit.Builder()
                        .baseUrl("http://news-at.zhihu.com")
                        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                        .addConverterFactory(GsonConvertFactory.create())
                        .build();
            }
        return retrofit.create(Service.class);
    }

    public static <T> Observable.Transformer<T, T> applySchedulers(){

        return new Observable.Transformer<T, T>() {
            @Override
            public Observable<T> call(Observable<T> tObservable) {
                return tObservable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            }
        };
    }
}
