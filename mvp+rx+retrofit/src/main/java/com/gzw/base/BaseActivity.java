package com.gzw.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by gujian
 * Time is 2017/7/6
 * Email is gujian@maihaoche.com
 */

public class BaseActivity<T extends ViewDataBinding> extends AppCompatActivity {

    private ViewDataBinding dataBinding;

    public T getDataBinding() {
        return (T)dataBinding;
    }

    protected int getLayoutResId(){
        return 0;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dataBinding = DataBindingUtil.setContentView(this,getLayoutResId());
        afterCreate(savedInstanceState);
    }

    protected void afterCreate(Bundle savedInstanceState){

    }
}
