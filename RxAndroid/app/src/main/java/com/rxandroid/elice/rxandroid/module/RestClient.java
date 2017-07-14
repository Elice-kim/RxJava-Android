package com.rxandroid.elice.rxandroid.module;

import com.rxandroid.elice.rxandroid.restapi.UserService;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by elice.kim on 2017. 7. 13..
 */

public class RestClient {

    public String baseUrl = "http://52.78.137.204:3000/";

    public UserService userServiceRetrofitClient(){
        return new Retrofit.Builder()
                .client(getOkHttpClient())
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build().create(UserService.class);
    }

    static OkHttpClient getOkHttpClient() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        return new OkHttpClient.Builder()
                .connectTimeout(59, TimeUnit.SECONDS)
                .writeTimeout(59, TimeUnit.SECONDS)
                .readTimeout(59, TimeUnit.SECONDS)
                .addInterceptor(loggingInterceptor)
                .build();

    }

}
