package com.gzw.login.activity;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.gzw.R;
import com.gzw.base.BaseActivity;
import com.gzw.databinding.ActivityMainBinding;
import com.gzw.login.fragment.MainFragment;
import com.gzw.login.fragment.MainPresenter;

public class LoginActivity extends BaseActivity<ActivityMainBinding> {
    private FragmentManager manager;

    @Override
    protected void afterCreate(Bundle savedInstanceState) {
        manager = getFragmentManager();
        MainFragment mainFragment = new MainFragment();
        manager.beginTransaction().replace(R.id.main_content,mainFragment).commit();

    }
}
