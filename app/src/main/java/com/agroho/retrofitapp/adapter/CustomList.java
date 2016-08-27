package com.agroho.retrofitapp.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.agroho.retrofitapp.R;
import com.agroho.retrofitapp.model.QuestionList;
import com.agroho.retrofitapp.model.Questions;

import java.util.List;

import retrofit2.Callback;

public class CustomList extends BaseAdapter {

    Context context;
    List<Questions> questionlist;
    LayoutInflater inflater;

    public CustomList(Context context, List<Questions> questionlist){

        this.context = context;
        this.questionlist = questionlist;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return questionlist.size();
    }

    @Override
    public Object getItem(int i) {
        return questionlist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return  Long.parseLong(questionlist.get(i).getQuestionId());
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView==null){
            holder = new ViewHolder();
            convertView = this.inflater.inflate(R.layout.questionlist,parent,false);

            holder.questionTitleTextView = (TextView)convertView.findViewById(R.id.questionTitle);
            holder.questionCategoryTextView = (TextView)convertView.findViewById(R.id.questionCategory);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder)convertView.getTag();
        }

        Questions question = questionlist.get(i);
        holder.questionTitleTextView.setText(question.getQuestionTitle());
        holder.questionCategoryTextView.setText(question.getQuestionCategory());

        return convertView;
    }

    private class ViewHolder{

        TextView questionTitleTextView;
        TextView questionCategoryTextView;


    }
}