package com.agroho.retrofitapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rezau on 2016-08-27.
 */
public class QuestionList {

    @SerializedName("discussed")
    private List<Question> questionslist;

    public List<Question> getQuestionslist() {
        return questionslist;
    }

    public void setQuestionslist(List<Question> questionslist) {
        this.questionslist = questionslist;
    }
}
