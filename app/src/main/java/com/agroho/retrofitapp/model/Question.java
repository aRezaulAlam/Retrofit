package com.agroho.retrofitapp.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rezau on 2016-08-27.
 */
public class Question {

    @SerializedName("qa_category")
    private String questionCategory;

    @SerializedName("qa-created")
    private String questionCreated;

    @SerializedName("qa_id")
    private String questionId;

    @SerializedName("qa_title")
    private String questionTitle;

    public Question(String questionCategory, String questionCreated, String questionId, String questionTitle) {
        this.questionCategory = questionCategory;
        this.questionCreated = questionCreated;
        this.questionId = questionId;
        this.questionTitle = questionTitle;
    }

    public String getQuestionCategory() {
        return questionCategory;
    }

    public void setQuestionCategory(String questionCategory) {
        this.questionCategory = questionCategory;
    }

    public String getQuestionCreated() {
        return questionCreated;
    }

    public void setQuestionCreated(String questionCreated) {
        this.questionCreated = questionCreated;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }
}
