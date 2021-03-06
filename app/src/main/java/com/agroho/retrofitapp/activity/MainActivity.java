package com.agroho.retrofitapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.agroho.retrofitapp.R;
import com.agroho.retrofitapp.adapter.CustomList;
import com.agroho.retrofitapp.model.QuestionList;
import com.agroho.retrofitapp.model.Question;
import com.agroho.retrofitapp.rest.QuestionCall;
import com.agroho.retrofitapp.rest.QuestionInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    CustomList questionAdapter;
    List<Question> questions;
    ListView questionListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionListView = (ListView)findViewById(R.id.questionListView);

        Log.d("Check","Online");

        QuestionInterface apiService =
                QuestionCall.getClient().create(QuestionInterface.class);

        Call<QuestionList> call = apiService.getQuestion();
        call.enqueue(new Callback<QuestionList>() {
            @Override
            public void onResponse(Call<QuestionList>call, Response<QuestionList> response) {
                questions = response.body().getQuestionslist();
                questionAdapter = new CustomList(MainActivity.this,questions);
                questionListView.setAdapter(questionAdapter);

                Log.d("Question List", "Number of question received: " + questions.size());
            }

            @Override
            public void onFailure(Call<QuestionList>call, Throwable t) {
                // Log error here since request failed
                Log.e("Error Question", t.toString());
            }
        });




    }
}
