package com.example.dell.babycare.Activities.developmentActivities.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.dell.babycare.Activities.developmentActivities.adapters.Physical_Bad_adapter;
import com.example.dell.babycare.Activities.developmentActivities.model.Question_Model;
import com.example.dell.babycare.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Physical_Bad extends AppCompatActivity {

    RecyclerView recyclerView;
    Toolbar toolbar;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical__bad);

        recyclerView= (RecyclerView) findViewById(R.id.activity_physical_bad_recycler);
        toolbar= (Toolbar) findViewById(R.id.activity_physical_bad_toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.question_physical_title);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        try {
            JSONArray jsonArray=new JSONArray(LoadJSONFrom());
            ArrayList<Question_Model> question_list=new ArrayList<Question_Model>();
            for (int i=0;i<jsonArray.length();i++){
                JSONObject jObject=jsonArray.getJSONObject(i);
                Question_Model question=new Question_Model();
                question.setQuestion(jObject.getString("question"));
                question.setAnswer(jObject.getString("answer"));
                question_list.add(question);
                Collections.shuffle(question_list);
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            adapter=new Physical_Bad_adapter(Physical_Bad.this,question_list);
            recyclerView.setAdapter(adapter);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    private String LoadJSONFrom() {
        StringBuilder builder=new StringBuilder();
        try {
            InputStream inputStream=getAssets().open("beginning.json");
            BufferedReader br=new BufferedReader(new InputStreamReader(inputStream));
            String str="";
            while ((str=br.readLine())!=null){
                builder.append(str);
            }
            return builder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}
