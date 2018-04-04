package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.visible;
import static com.example.android.quizapp.R.id.first;
import static com.example.android.quizapp.R.id.fourth;
import static com.example.android.quizapp.R.id.second;
import static com.example.android.quizapp.R.id.third;

import java.lang.*;

public class MainActivity extends AppCompatActivity {

    ArrayList<TextView> Questions;
    ArrayList<TextView> Answers;

    int score = 0;

    EditText answerFirst;
    EditText answerSecond;
    EditText answerThird;
    EditText answerFourth;
    String first;
    String second;
    String third;
    String fourth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);
    }

    public void login(View view) {
        setContentView(R.layout.activity_main);
        answerFirst = (EditText) findViewById(R.id.first);
        answerSecond = (EditText) findViewById(R.id.second);
        answerThird = (EditText) findViewById(R.id.third);
        answerFourth = (EditText) findViewById(R.id.fourth);

        first = answerFirst.getText().toString();
        second = answerSecond.getText().toString();
        third = answerThird.getText().toString();
        fourth = answerFourth.getText().toString();
    }


    public void finish(View view) {
        if(first.equalsIgnoreCase("c")){
            score++;
        }
        if(second.equalsIgnoreCase("b")){
            score++;
        }
        if(third.equalsIgnoreCase("b")){
            score++;
        }
        if(fourth.equalsIgnoreCase("d")){
            score++;
        }
        TextView textView = (TextView) findViewById(R.id.score);
        textView.setVisibility(View.VISIBLE);
        textView.setText("Score: "+ score + " / 4");
    }

}
