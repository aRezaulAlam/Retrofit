package com.agroho.retrofitapp.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by rezau on 2016-08-27.
 */
public class QuestionCall {

    public static final String BASE_URL = "https://islmaicapp-mahad.firebaseio.com/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient(){
        if (retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}
