package com.kamalcheema.interactivestory.model;

/**
 * Created by kamal on 2016-07-21.
 */
public class page {

    private int mImageId;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean mIsFinal=false;

    public page(int imageId, String text, Choice choice1,Choice choice2){
        mImageId=imageId;
        mText=text;
        mChoice1=choice1;
        mChoice2=choice2;

    }

    public page(int imageId, String text){
        mImageId=imageId;
        mText=text;
        mChoice1=null;
        mChoice2=null;
        mIsFinal=true;

    }


    public int getImageId() {
        return mImageId;
    }

    public String getText() {
        return mText;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }



    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public void setText(String text) {
        mText = text;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setFinal(boolean aFinal) {
        mIsFinal = aFinal;
    }
}
