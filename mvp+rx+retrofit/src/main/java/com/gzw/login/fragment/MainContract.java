package com.gzw.login.fragment;

import com.gzw.BasePresenter;
import com.gzw.BaseView;
import com.gzw.login.entry.response.LogoResponse;

/**
 * Created by gzw on 2016/12/28.
 */

public interface MainContract {

    interface Presenter extends BasePresenter{

        void getData();

    }

    interface View extends BaseView<Presenter>{

        void showProgress();
        void showMainView(LogoResponse response);

    }
}
