package com.rxandroid.elice.rxandroid.presenter;

import com.rxandroid.elice.rxandroid.activity.LoginActivity;
import com.rxandroid.elice.rxandroid.data.LoginData;
import com.rxandroid.elice.rxandroid.module.RestClient;

import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by elice.kim on 2017. 7. 13..
 */

public class LoginPresenter extends BasePresenter<LoginActivity> {

    private Subscription subscription;

    public void loginRequest(LoginData.Request request) {

        subscription = new RestClient().userServiceRetrofitClient()
                .requestLogin(request)
                //requestLogin(request)의 콜백이 Observable로 되어있어야 subscribeOn 메서드가 적용됨
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(response -> {
                    view.onRequestComplete();

                }, e -> {
                    //해당 액티비티에서 BasePresenter의 view가 set되어지지 않은 상태에서
                    //view를 참조하게 되므로 에러가 나게됨
                    //여기서 view는 null이 되기때문에 앱이 죽게됨

                    view.onRequestFail();
                });
    }
}
