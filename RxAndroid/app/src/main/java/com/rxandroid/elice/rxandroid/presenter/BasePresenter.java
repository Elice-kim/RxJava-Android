package com.rxandroid.elice.rxandroid.presenter;

/**
 * Created by elice.kim on 2017. 7. 13..
 */

public class BasePresenter<T> {

    public T view;

    public void setView(T view){
        this.view = view;
    }
}
