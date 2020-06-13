package com.example.quizapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;


/**
 * A simple {@link Fragment} subclass.
 */
public class Q4Fragment extends Fragment {


    public Q4Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_q4, container, false);

        final QuestionsActivity questionsActivityObject = (QuestionsActivity)getActivity();
        Button nextButton = (Button) rootView.findViewById(R.id.next_button);
        Button prevButton = (Button) rootView.findViewById(R.id.prev_button);



        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean answer = ((CheckBox)rootView.findViewById(R.id.A41)).isChecked()
                        && ((CheckBox)rootView.findViewById(R.id.A43)).isChecked()
                        && (((CheckBox)rootView.findViewById(R.id.A44)).isChecked())
                        && !(((CheckBox)rootView.findViewById(R.id.A42)).isChecked());
                questionsActivityObject.setAnswer(answer, 3);
                questionsActivityObject.viewPager.arrowScroll(View.FOCUS_RIGHT);
            }
        });

        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean answer = ((CheckBox)rootView.findViewById(R.id.A41)).isChecked()
                        && ((CheckBox)rootView.findViewById(R.id.A43)).isChecked()
                        && (((CheckBox)rootView.findViewById(R.id.A44)).isChecked())
                        && !(((CheckBox)rootView.findViewById(R.id.A42)).isChecked());
                questionsActivityObject.setAnswer(answer, 3);
                questionsActivityObject.viewPager.arrowScroll(View.FOCUS_LEFT);
            }
        });

        return rootView;
    }

}
