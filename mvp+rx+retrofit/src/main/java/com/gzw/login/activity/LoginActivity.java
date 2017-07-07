package com.gzw.login.activity;

import android.app.FragmentManager;
import android.os.Bundle;

import com.gzw.R;
import com.gzw.base.BaseActivity;
import com.gzw.databinding.ActivityMainBinding;
import com.gzw.login.fragment.MainFragment;

public class LoginActivity extends BaseActivity<ActivityMainBinding> {
    private FragmentManager manager;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void afterCreate(Bundle savedInstanceState) {
        manager = getFragmentManager();
        MainFragment mainFragment = new MainFragment();
        manager.beginTransaction().replace(R.id.main_content,mainFragment).commit();

    }
}
