package com.gzw.login.entry;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;

/**
 * Created by gujian
 * Time is 2017/7/7
 * Email is gujian@maihaoche.com
 */

public class LoginModel {

    public ObservableField<String> text = new ObservableField<>();

    public ObservableBoolean isShowProgress = new ObservableBoolean();

}
