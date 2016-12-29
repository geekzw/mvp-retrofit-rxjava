package com.gzw.login.fragment;

import com.gzw.login.data.HttpUtil;
import com.gzw.login.entry.request.UserRequest;
import com.gzw.login.entry.response.GitHubUserInfo;

import rx.functions.Action1;

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
        UserRequest request = new UserRequest();
        request.user = "geekzw";
        HttpUtil.getClient().getUserInfo2("geekzw")
                .compose(HttpUtil.applySchedulers())
                .subscribe(new Action1<Object>() {
                    @Override
                    public void call(Object response) {
                        GitHubUserInfo response1 = (GitHubUserInfo) response;
                        view.showMainView(response1);
                    }
                });

    }

    @Override
    public void start() {
        getData();
    }
}
