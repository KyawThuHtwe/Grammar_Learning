package com.cu.grammarlearning;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.cu.grammarlearning.Model.QuizDataPump;
import com.cu.grammarlearning.Model.QuizItem;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity extends AppCompatActivity {

    //ေမးခြန္း ျပဖို႔
    TextView tv,tv_count;
    RadioGroup rg;

    Button next;
    //ေရြးစရာ အေျဖ၃ခု ျပဖို႔
    RadioButton rb1,rb2,rb3,rb4;
    //ေမးခြန္းေတြ သိမ္းဖို႔ array
    ArrayList<QuizItem> quizItems;
    String correctAnswer;
    int trials=0,count=1,currentQuizIndex;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        String type=getIntent().getStringExtra("Type");
        if(type.equals("Exercise")){
            getSupportActionBar().setTitle("Exercise Questions");
            getSupportActionBar().setSubtitle(getIntent().getStringExtra("Q"));
        }else{
            getSupportActionBar().setTitle("Quiz Questions");
        }

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        tv=findViewById(R.id.tv);
        tv_count=findViewById(R.id.count);
        rg=findViewById(R.id.rg);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        rb3=findViewById(R.id.rb3);
        rb4=findViewById(R.id.rb4);
        next=findViewById(R.id.next);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb1:
                        rb1.setTextColor(getResources().getColor(R.color.colorAccent));
                        rb2.setTextColor(getResources().getColor(R.color.colorTextSecondary));
                        rb3.setTextColor(getResources().getColor(R.color.colorTextSecondary));
                        rb4.setTextColor(getResources().getColor(R.color.colorTextSecondary));
                        break;
                    case R.id.rb2:
                        rb1.setTextColor(getResources().getColor(R.color.colorTextSecondary));
                        rb2.setTextColor(getResources().getColor(R.color.colorAccent));
                        rb3.setTextColor(getResources().getColor(R.color.colorTextSecondary));
                        rb4.setTextColor(getResources().getColor(R.color.colorTextSecondary));
                        break;
                    case R.id.rb3:
                        rb1.setTextColor(getResources().getColor(R.color.colorTextSecondary));
                        rb2.setTextColor(getResources().getColor(R.color.colorTextSecondary));
                        rb3.setTextColor(getResources().getColor(R.color.colorAccent));
                        rb4.setTextColor(getResources().getColor(R.color.colorTextSecondary));
                        break;
                    case R.id.rb4:
                        rb1.setTextColor(getResources().getColor(R.color.colorTextSecondary));
                        rb2.setTextColor(getResources().getColor(R.color.colorTextSecondary));
                        rb3.setTextColor(getResources().getColor(R.color.colorTextSecondary));
                        rb4.setTextColor(getResources().getColor(R.color.colorAccent));
                        break;
                }
            }
        });

        showQuiz();

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    action();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

    }

    //လက္ရွိ ေမးခြန္း index အရ ေမးခြန္း ျပျခင္း
    @SuppressLint("SetTextI18n")
    public void showQuiz(){

        quizItems=new ArrayList<>();
        String Q=getIntent().getStringExtra("Q");
        quizItems= QuizDataPump.getData(Q);
        int i=quizItems.size();
        int max=i;
        int min=0;
        int range=max-min+1;
        int random=(int)(Math.random()*range)+min;
        if(random!=currentQuizIndex){
            currentQuizIndex=random;
        }else {
            showQuiz();
        }

        tv_count.setText("("+count+")");
        tv.setText(quizItems.get(currentQuizIndex).getStem());
        rb1.setText(quizItems.get(currentQuizIndex).getChoice1());
        rb2.setText(quizItems.get(currentQuizIndex).getChoice2());
        rb3.setText(quizItems.get(currentQuizIndex).getChoice3());
        rb4.setText(quizItems.get(currentQuizIndex).getChoice4());
        rb1.setVisibility(View.GONE);
        rb2.setVisibility(View.GONE);
        rb3.setVisibility(View.GONE);
        rb4.setVisibility(View.GONE);

        if(!quizItems.get(currentQuizIndex).getChoice1().equals("")){
            rb1.setVisibility(View.VISIBLE);
        }
        if(!quizItems.get(currentQuizIndex).getChoice2().equals("")){
            rb2.setVisibility(View.VISIBLE);
        }
        if(!quizItems.get(currentQuizIndex).getChoice3().equals("")){
            rb3.setVisibility(View.VISIBLE);
        }
        if(!quizItems.get(currentQuizIndex).getChoice4().equals("")){
            rb4.setVisibility(View.VISIBLE);
        }

        correctAnswer=quizItems.get(currentQuizIndex).getAnswer();

        if(getIntent().getStringExtra("Type").equals("Exercise")){
            if(count==5){
                next.setText("Finish");
            }else{
                next.setText("Next");
            }
        }else{
            if(count==10){
                next.setText("Finish");
            }else{
                next.setText("Next");
            }
        }

    }
    //Button click ဖမ္းဖို႔
    @SuppressLint("ResourceType")
    public void action(){
        //RadioButton တခုကိုေရြးထားရင္
        if(rg.getCheckedRadioButtonId()>0) {
            //ေရြးထားတဲ့ RadioButton
            RadioButton rb = findViewById(
                    rg.getCheckedRadioButtonId());
            //ေရြးထားတဲ့ RadioButton ရဲ့ စာသား
            String triedAnswer = rb.getText().toString();
            if (correctAnswer.equals(triedAnswer)) {
                trials++;
            }
            if(getIntent().getStringExtra("Type").equals("Exercise")){
                if (count <5) {
                    //ေနာက္ဆံုးေမးခြန္း မဟုတ္ေသးရင္
                    //လက္ရွိေမးခြန္း index နံပတ္ကို ၁ တိုးမယ္။
                    //ေနာက္ေမးခြန္းကို ျပမယ္။
                    count++;
                    showQuiz();
                    //ေစာေစာက ေရြးထားတာကို ျပန္ေဖ်ာက္မယ္။
                    rg.clearCheck();
                    rb1.setTextColor(getResources().getColor(R.color.colorTextSecondary));
                    rb2.setTextColor(getResources().getColor(R.color.colorTextSecondary));
                    rb3.setTextColor(getResources().getColor(R.color.colorTextSecondary));
                    rb4.setTextColor(getResources().getColor(R.color.colorTextSecondary));
                } else {
                    int answer =trials;
                    Intent intent=new Intent(getApplicationContext(),
                            ResultActivity.class);
                    intent.putExtra("Type",getIntent().getStringExtra("Type"));
                    intent.putExtra("Q",getIntent().getStringExtra("Q"));
                    intent.putExtra("answer",answer);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);

                }
            }else{
                if (count <10) {
                    //ေနာက္ဆံုးေမးခြန္း မဟုတ္ေသးရင္
                    //လက္ရွိေမးခြန္း index နံပတ္ကို ၁ တိုးမယ္။
                    //ေနာက္ေမးခြန္းကို ျပမယ္။
                    count++;
                    showQuiz();
                    //ေစာေစာက ေရြးထားတာကို ျပန္ေဖ်ာက္မယ္။
                    rg.clearCheck();
                    rb1.setTextColor(getResources().getColor(R.color.colorTextSecondary));
                    rb2.setTextColor(getResources().getColor(R.color.colorTextSecondary));
                    rb3.setTextColor(getResources().getColor(R.color.colorTextSecondary));
                    rb4.setTextColor(getResources().getColor(R.color.colorTextSecondary));
                } else {
                    int answer =trials;
                    Intent intent=new Intent(getApplicationContext(),
                            ResultActivity.class);
                    intent.putExtra("Type",getIntent().getStringExtra("Type"));
                    intent.putExtra("Q",getIntent().getStringExtra("Q"));
                    intent.putExtra("answer",answer);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);

                }
            }

        }else{
            Toast.makeText(getApplicationContext(),"Please choose answer, Try Again!",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            String Retry=getIntent().getStringExtra("Retry");
            if(!TextUtils.isEmpty(Retry)){
                startActivity(new Intent(getApplicationContext(),
                        MainActivity.class));
            }
            finish();

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        String Retry=getIntent().getStringExtra("Retry");
        if(!TextUtils.isEmpty(Retry)){
            startActivity(new Intent(getApplicationContext(),
                    MainActivity.class));
        }
        finish();
    }
}