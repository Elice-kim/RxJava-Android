package com.rxandroid.elice.rxandroid.presenter;

import com.rxandroid.elice.rxandroid.activity.LoginActivity;
import com.rxandroid.elice.rxandroid.data.LoginData;

import rx.Subscription;

/**
 * Created by elice.kim on 2017. 7. 13..
 */

public class LoginPresenter extends BasePresenter<LoginActivity> {

    private Subscription subscription;

    public void loginRequest(LoginData.Request request) {

    }
}
