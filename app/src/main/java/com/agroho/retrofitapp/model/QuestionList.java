package com.agroho.retrofitapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rezau on 2016-08-27.
 */
public class QuestionList {

    @SerializedName("discussed")
    private List<Questions> questionslist;

    public List<Questions> getQuestionslist() {
        return questionslist;
    }

    public void setQuestionslist(List<Questions> questionslist) {
        this.questionslist = questionslist;
    }
}
