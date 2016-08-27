package com.agroho.retrofitapp.rest;

import com.agroho.retrofitapp.model.QuestionList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by rezau on 2016-08-27.
 */
public interface QuestionInterface {

    @GET(".json")
    Call<QuestionList> getQuestion();
}
