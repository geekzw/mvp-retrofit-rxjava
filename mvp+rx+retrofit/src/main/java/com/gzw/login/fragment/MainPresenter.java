package com.gzw.login.fragment;

import com.gzw.data.HttpUtil;
import com.gzw.login.entry.request.UserRequest;

/**
 * Created by gzw on 2016/12/28.
 */

public class MainPresenter implements MainContract.Presenter {
    private MainFragment view;

    public MainPresenter(MainFragment view){
        this.view = view;
        view.setPresenter(this);
    }
    @Override
    public void getData() {
        view.showProgress();
        UserRequest request = new UserRequest();
        request.user = "geekzw";
        HttpUtil.getClient().getUserInfo2("geekzw")
                .compose(HttpUtil.applyShedulers())
                .subscribe(response->view.showMainView(response));

    }

    @Override
    public void start() {
        getData();
    }
}
