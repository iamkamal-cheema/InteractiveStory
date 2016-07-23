package com.kamalcheema.interactivestory.model;

/**
 * Created by kamal on 2016-07-21.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public Choice(String text,int nextPage){
        mText=text;
        mNextPage=nextPage;

    }

    public String getText() {
        return mText;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setText(String text) {
        mText = text;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
