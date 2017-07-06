package com.gzw.base;

import android.app.Fragment;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by gujian
 * Time is 2017/7/6
 * Email is gujian@maihaoche.com
 */

public class BaseFragment<T extends ViewDataBinding> extends Fragment {

    private ViewDataBinding dataBinding;

    public T getDataBinding() {
        return (T)dataBinding;
    }

    protected int getLayoutResId(){
        return 0;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        dataBinding = DataBindingUtil.inflate(inflater,getLayoutResId(),container,true);
        afterCreateView(savedInstanceState);
        return dataBinding.getRoot();
    }

    protected void afterCreateView(Bundle savedInstanceState){

    }
}
