package com.example.dell.babycare.Activities.developmentActivities.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.dell.babycare.Activities.developmentActivities.model.Answer_Model;
import com.example.dell.babycare.R;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static com.example.dell.babycare.R.id.repiyButton;

public class Reply extends AppCompatActivity implements View.OnClickListener {
    EditText replyText;
    Button replyButton;
    String questionArray="",profile="",name="",date="",time="",accountKey="",answerKey="";
    int positionn=0;
    TextView repiyQuestion;
    static String stime,sday;
    Firebase firebase;
    String realAnswer="";
    RelativeLayout visibleAnswer,visibleReply;
    TextView answerText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reply);
        Toolbar toolbar;
        toolbar= (Toolbar) findViewById(R.id.tool3);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("ေျဖၾကားရန္");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        replyText= (EditText) findViewById(R.id.reply_text);
        replyButton= (Button) findViewById(repiyButton);
        visibleAnswer= (RelativeLayout) findViewById(R.id.visibleanswer);
        answerText= (TextView) findViewById(R.id.answertexttt);
        visibleReply= (RelativeLayout) findViewById(R.id.visibleEdit);
        // repiyProfile= (ImageView) findViewById(R.id.doctorprofileimage);
       // repiyname= (TextView) findViewById(R.id.doctorusername);
        repiyQuestion= (TextView) findViewById(R.id.doctorquestion_text);
        positionn=getIntent().getIntExtra("position",0);
        questionArray=getIntent().getStringExtra("question");
        profile=getIntent().getStringExtra("profile");
        name=getIntent().getStringExtra("name");
        answerKey=getIntent().getStringExtra("answerkey");
        date=getIntent().getStringExtra("date");
        time=getIntent().getStringExtra("time");
        accountKey=getIntent().getStringExtra("key");
      //  repiyname.setText(name);
        repiyQuestion.setText(questionArray);
        Firebase.setAndroidContext(Reply.this);
        firebase = new Firebase("https://myschoolserver-dcae9.firebaseio.com/");
        firebase.child("DoctorQuestion").child(answerKey).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                realAnswer=dataSnapshot.getValue(Answer_Model.class).getAnswer();
                if (realAnswer.equals(""))
                {
                    visibleAnswer.setVisibility(View.INVISIBLE);
                    visibleReply.setVisibility(View.VISIBLE);
                }
                else
                {
                    visibleAnswer.setVisibility(View.VISIBLE);
                    visibleReply.setVisibility(View.INVISIBLE);
                    answerText.setText(realAnswer);
                }
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        replyButton.setOnClickListener(this);
    }
    public static String Time(){
        DateFormat time = new SimpleDateFormat(" HH:mm:ss");
        time.setLenient(false);
        Date todaytime = new Date();
        stime = time.format(todaytime);
        return stime;
    }
    public static String Date(){
        DateFormat date = new SimpleDateFormat("yyyy:MM:dd ");
        date.setLenient(false);
        Date todaydate = new Date();
        sday = date.format(todaydate);
        return sday;
    }

    @Override
    public void onClick(View view) {
        String replystring=replyText.getText().toString();
        Answer_Model aaModel=new Answer_Model();
        aaModel.setQuestion(repiyQuestion.getText().toString());
        aaModel.setaDate(Date());
        aaModel.setaTime(Time());
        aaModel.setAnswer(replystring);
        aaModel.setAnswerkey(answerKey);
        aaModel.setQdate(date);
        aaModel.setQtime(time);
        aaModel.setKey(accountKey);
       firebase.child("DoctorQuestion").child(answerKey).setValue(aaModel);
        visibleAnswer.setVisibility(View.VISIBLE);
        answerText.setText(replystring);
        visibleReply.setVisibility(View.INVISIBLE);




    }
}
