package com.gzw.login.fragment;

import com.gzw.login.data.HttpUtil;
import com.gzw.login.entry.request.LogoRequest;

/**
 * Created by gzw on 2016/12/28.
 */

public class MainPresenter implements MainContract.Presenter {
    private MainFragment view;

    public MainPresenter(MainFragment view){
        this.view = view;
    }
    @Override
    public void getData() {
        view.showProgress();
        LogoRequest request = new LogoRequest();
        request.pix = "1080*1776";
        HttpUtil.getClient().getLogo(request)
                .compose(HttpUtil.applySchedulers())
                .subscribe(response->{
                  view.showMainView();
        });

    }

    @Override
    public void start() {
        getData();
    }
}
