package com.gzw.login.activity;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.gzw.R;
import com.gzw.login.fragment.MainFragment;
import com.gzw.login.fragment.MainPresenter;

public class LoginActivity extends AppCompatActivity {
    private LinearLayout mMainContent;
    private MainPresenter mPresenter;

    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMainContent = (LinearLayout) findViewById(R.id.main_content);
        manager = getFragmentManager();
        MainFragment mainFragment = new MainFragment();
        manager.beginTransaction().replace(R.id.main_content,mainFragment).commit();
        mPresenter = new MainPresenter(mainFragment);
    }
}
