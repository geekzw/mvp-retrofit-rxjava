package com.gzw.login.fragment;

import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gzw.R;
import com.gzw.login.entry.response.GitHubUserInfo;

/**
 * Created by gzw on 2016/12/28.
 */

public class MainFragment extends Fragment implements MainContract.View{

    private TextView mText;
    private TextView mProgress;

    private MainContract.Presenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,container,false);
        bindView(view);
        return view;
    }

    private void bindView(View view) {
        mText = (TextView) view.findViewById(R.id.text);
        mProgress = (TextView) view.findViewById(R.id.progress);
        presenter.getData();
    }

    @Override
    public void showProgress() {
        mProgress.setVisibility(View.VISIBLE);
    }

    @Override
    public void showMainView(GitHubUserInfo response) {
        mProgress.setVisibility(View.GONE);
        mText.setText(response.toString());


    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
