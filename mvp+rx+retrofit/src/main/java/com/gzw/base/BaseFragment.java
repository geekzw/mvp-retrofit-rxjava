package com.gzw.base;

import android.app.Fragment;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gzw.R;
import com.gzw.databinding.BaseFragmentBinding;

/**
 * Created by gujian
 * Time is 2017/7/6
 * Email is gujian@maihaoche.com
 */

public class BaseFragment<T extends ViewDataBinding> extends Fragment {

    private ViewDataBinding dataBinding;
    private BaseFragmentBinding baseBinding;

    public T getDataBinding() {
        return (T)dataBinding;
    }

    protected int getLayoutResId(){
        return 0;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        baseBinding = DataBindingUtil.inflate(inflater, R.layout.base_fragment,container,false);
        dataBinding = DataBindingUtil.inflate(inflater, getLayoutResId(),baseBinding.content,false);
        afterCreateView(savedInstanceState);
        return dataBinding.getRoot();
    }

    protected void afterCreateView(Bundle savedInstanceState){

    }

    public final void showProgress(){
        baseBinding.progress.setVisibility(View.VISIBLE);
    }

    public final void hiddenProgress(){
        baseBinding.progress.setVisibility(View.GONE);
    }
}
