package com.example.dell.babycare.Activities.developmentActivities.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dell.babycare.Activities.developmentActivities.activities.Detail_Question;
import com.example.dell.babycare.Activities.developmentActivities.model.Question_Model;
import com.example.dell.babycare.R;

import java.util.ArrayList;

/**
 * Created by Aspire on 1/12/2018.
 */

public class About_Mother_adapter extends RecyclerView.Adapter<About_Mother_adapter.MyHolder> {
    Context context;
    ArrayList<Question_Model> question_list=new ArrayList<>();
    public About_Mother_adapter(Context about_mother, ArrayList<Question_Model> question_list) {
        this.context=about_mother;
        this.question_list=question_list;
    }

    @Override
    public About_Mother_adapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.about_mother_recycler,parent,false);
        MyHolder h=new MyHolder(v);
        return h;
    }

    @Override
    public void onBindViewHolder(About_Mother_adapter.MyHolder holder, final int position) {
        holder.textView.setText(question_list.get(position).getQuestion());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go=new Intent(context,Detail_Question.class);
                go.putExtra("question",question_list.get(position).getQuestion());
                go.putExtra("answer",question_list.get(position).getAnswer());
                context.startActivity(go);

            }
        });
    }

    @Override
    public int getItemCount() {
        return question_list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public MyHolder(View itemView) {
            super(itemView);
            textView= (TextView) itemView.findViewById(R.id.about_mother_recycler_question);
        }
    }
}
