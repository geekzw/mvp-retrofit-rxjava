package com.gzw.login.fragment;

import android.os.Bundle;
import android.view.View;

import com.gzw.base.BaseFragment;
import com.gzw.databinding.FragmentMainBinding;
import com.gzw.login.entry.response.GitHubUserInfo;

/**
 * Created by gzw on 2016/12/28.
 */

public class MainFragment extends BaseFragment<FragmentMainBinding> implements MainContract.View{

    private MainContract.Presenter presenter;
    private FragmentMainBinding binding;

    @Override
    protected void afterCreateView(Bundle savedInstanceState) {
        presenter.getData();
        binding = getDataBinding();
        presenter = new MainPresenter(this);
    }

    @Override
    public void showProgress() {
        binding.progress.setVisibility(View.VISIBLE);
    }

    @Override
    public void showMainView(GitHubUserInfo response) {
        binding.progress.setVisibility(View.GONE);
        binding.text.setText(response.toString());

    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
