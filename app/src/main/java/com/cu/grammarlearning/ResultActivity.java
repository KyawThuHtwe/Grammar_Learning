package com.cu.grammarlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        int answer=getIntent().getIntExtra("answer",0);
        String type=getIntent().getStringExtra("Type");
        TextView tvResult=(TextView)findViewById(R.id.tvResult);
        if(type.equals("Quiz")){

            //double score=answer*(100.0/10.0);

            tvResult.setText("Your Answer is : "+answer+"/"+10);
            getSupportActionBar().setTitle("Quiz");
        }else{

            //double score=answer*(100.0/5.0);

            tvResult.setText("Your Answer is : "+answer+"/"+5);
            getSupportActionBar().setTitle("Exercise");
            getSupportActionBar().setSubtitle(getIntent().getStringExtra("Q"));
        }
    }
    public void retryClick(View v){
        String timer=getIntent().getStringExtra("Timer");
        Intent intent=new Intent(getApplicationContext(),QuizActivity.class);
        if(!TextUtils.isEmpty(timer)){
            intent.putExtra("Timer",getIntent().getStringExtra("Timer"));
        }
        intent.putExtra("Type",getIntent().getStringExtra("Type"));
        intent.putExtra("Q",getIntent().getStringExtra("Q"));
        intent.putExtra("Retry","Retry");
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }
    public void exitClick(View v){
        startActivity(new Intent(getApplicationContext(),
                MainActivity.class));
        finish();
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),
                MainActivity.class));
        finish();
    }
}