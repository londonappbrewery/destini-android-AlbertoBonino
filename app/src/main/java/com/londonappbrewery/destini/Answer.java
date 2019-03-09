package com.londonappbrewery.destini;

public class Answer {

    int mTextId;
    Story mStory;

    public Answer(int textId, Story story) {
        mTextId = textId;
        mStory = story;
    }

    public int getTextId() {
        return mTextId;
    }

    public void setTextId(int textId) {
        mTextId = textId;
    }

    public Story getStory() {
        return mStory;
    }

    public void setStory(Story story) {
        mStory = story;
    }
}
