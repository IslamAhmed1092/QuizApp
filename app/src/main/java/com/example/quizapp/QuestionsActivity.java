package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class QuestionsActivity extends AppCompatActivity{

    protected CustomViewPager viewPager;
    private boolean answeredCorrect[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        answeredCorrect = new boolean[5];
        viewPager = findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == 0) {
                    setTitle(R.string.Q1Label);
                } else if (position == 1){
                    setTitle(R.string.Q2Label);
                } else if (position == 2) {
                    setTitle(R.string.Q3Label);
                } else if (position == 3) {
                    setTitle(R.string.Q4Label);
                } else if (position == 4) {
                    setTitle(R.string.Q5Label);
                } else{
                    setTitle(R.string.Submit);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    void setAnswer(boolean answer, int position){
        answeredCorrect[position] = answer;
    }
    void showResult()
    {
        int noOfCorrectAnswers = 0;
        for (int i = 0; i < 5; i++)
            if(answeredCorrect[i] == true) noOfCorrectAnswers++;

        Toast toast = Toast.makeText(this, "Correct Answers " + noOfCorrectAnswers + "/5", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 500);
        toast.show();

        Intent resultIntent = new Intent(QuestionsActivity.this, ResultActivity.class);
        resultIntent.putExtra("noOfCorrectAnswers", noOfCorrectAnswers);
        startActivity(resultIntent);
        finish();
    }
}
