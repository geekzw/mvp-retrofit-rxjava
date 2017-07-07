package com.gzw.login.fragment;

import android.os.Bundle;
import android.view.View;

import com.gzw.R;
import com.gzw.base.BaseFragment;
import com.gzw.databinding.FragmentMainBinding;
import com.gzw.login.entry.LoginModel;
import com.gzw.login.entry.response.GitHubUserInfo;

/**
 * Created by gzw on 2016/12/28.
 */

public class MainFragment extends BaseFragment<FragmentMainBinding> implements MainContract.View<LoginModel>{

    private MainContract.Presenter presenter;
    private FragmentMainBinding binding;
    private LoginModel loginModel;

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_main;
    }

    @Override
    protected void afterCreateView(Bundle savedInstanceState) {
        binding = getDataBinding();
        loginModel = new LoginModel();
        binding.setViewModel(loginModel);
        presenter = new MainPresenter(this);
        presenter.getData();
    }


    @Override
    public LoginModel getModel() {
        return loginModel;
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
