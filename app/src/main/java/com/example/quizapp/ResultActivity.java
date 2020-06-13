package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ImageView passingImage = (ImageView) findViewById(R.id.passing_image);
        TextView congratsMessage = (TextView) findViewById(R.id.congrats_text_view);
        TextView passedMessage = (TextView) findViewById(R.id.passed_text_view);
        TextView percentageMessage = (TextView) findViewById(R.id.percentage_text_view);
        Intent mIntent = getIntent();
        int noOfCorrectAnswers = mIntent.getIntExtra("noOfCorrectAnswers", 0);

        if(noOfCorrectAnswers < 3)
        {
            passingImage.setImageResource(R.drawable.redcross);
            congratsMessage.setText(R.string.SorryMessage);
            passedMessage.setText(R.string.NotPassed);
        }

        String percentage = Integer.toString((int)((noOfCorrectAnswers/5.0) * 100)) + "%";
        percentageMessage.setText(percentage);

        Button retakeButton = (Button)findViewById(R.id.retake_button);

        retakeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainIntent = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(MainIntent);
                finish();
            }
        });
    }
}
