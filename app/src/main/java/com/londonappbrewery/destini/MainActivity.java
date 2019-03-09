package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mTopButton;
    Button mBottomButton;
    Button mEndButton;

    List<Story> mStories;

    private Story currentStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStoryTextView = findViewById(R.id.storyTextView);
        mTopButton = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);

        mEndButton = findViewById(R.id.endButton);

        setup();

        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateStory(currentStory.getAnswer1());
            }
        });

        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateStory(currentStory.getAnswer2());
            }
        });

        mEndButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setup();
            }
        });
    }

    public void setup() {
        Story mStory6 = new Story(R.string.T6_End, 6);
        Story mStory5 = new Story(R.string.T5_End, 5);
        Story mStory4 = new Story(R.string.T4_End, 4);

        Story mStory3 = new Story(R.string.T3_Story, 3);
        mStory3.setAnswer1(new Answer(R.string.T3_Ans1, mStory6));
        mStory3.setAnswer2(new Answer(R.string.T3_Ans2, mStory5));

        Story mStory2 = new Story(R.string.T2_Story, 2);
        mStory2.setAnswer1(new Answer(R.string.T2_Ans1, mStory3));
        mStory2.setAnswer2(new Answer(R.string.T2_Ans2, mStory4));

        Story mStory1 = new Story(R.string.T1_Story, 1);
        mStory1.setAnswer1(new Answer(R.string.T1_Ans1, mStory3));
        mStory1.setAnswer2(new Answer(R.string.T1_Ans2, mStory2));

        mStories = new ArrayList<>();
        mStories.add(mStory6);
        mStories.add(mStory5);
        mStories.add(mStory4);
        mStories.add(mStory3);
        mStories.add(mStory2);
        mStories.add(mStory1);

        currentStory = mStory1;

        mStoryTextView.setText(currentStory.getStoryTextId());
        mTopButton.setText(currentStory.getAnswer1().getTextId());
        mBottomButton.setText(currentStory.getAnswer2().getTextId());

        mTopButton.setVisibility(View.VISIBLE);
        mBottomButton.setVisibility(View.VISIBLE);
        mEndButton.setVisibility(View.GONE);
    }

    public void updateStory(Answer answer) {
        currentStory = answer.getStory();
        mStoryTextView.setText(currentStory.getStoryTextId());

        if (currentStory.getAnswer1() != null) {
            mTopButton.setText(currentStory.getAnswer1().getTextId());
        } else {
            mTopButton.setVisibility(View.GONE);
        }

        if (currentStory.getAnswer2() != null) {
            mBottomButton.setText(currentStory.getAnswer2().getTextId());
        } else {
            mBottomButton.setVisibility(View.GONE);
        }

        if (currentStory.getAnswer1() == null && currentStory.getAnswer2() == null) {
            mEndButton.setVisibility(View.VISIBLE);
        }

    }

}
