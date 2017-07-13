package com.rxandroid.elice.rxandroid.restapi;

import com.rxandroid.elice.rxandroid.data.LoginData;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by elice.kim on 2017. 7. 13..
 */

public interface LoginService {

    @POST("login")
    Observable<LoginData.Response> requestLogin(@Body LoginData.Request loginRequest);
}
