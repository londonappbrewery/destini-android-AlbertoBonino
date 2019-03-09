package com.londonappbrewery.destini;

public class Story {

    Answer mAnswer1;
    Answer mAnswer2;

    int mStoryTextId;
    int mStoryId;

    public Story(int storyTextId, int storyId) {
        mStoryTextId = storyTextId;
        mStoryId = storyId;
    }

    public Story(int storyTextId, Answer answer1, Answer answer2) {
        mAnswer1 = answer1;
        mAnswer2 = answer2;
        mStoryTextId = storyTextId;
    }

    public int getStoryId() {
        return mStoryId;
    }

    public void setStoryId(int storyId) {
        mStoryId = storyId;
    }

    public Answer getAnswer1() {
        return mAnswer1;
    }

    public void setAnswer1(Answer answer1) {
        mAnswer1 = answer1;
    }

    public Answer getAnswer2() {
        return mAnswer2;
    }

    public void setAnswer2(Answer answer2) {
        mAnswer2 = answer2;
    }

    public int getStoryTextId() {
        return mStoryTextId;
    }

    public void setStoryTextId(int storyTextId) {
        mStoryTextId = storyTextId;
    }

}
