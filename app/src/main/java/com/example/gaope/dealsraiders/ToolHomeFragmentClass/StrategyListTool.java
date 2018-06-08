package com.example.gaope.dealsraiders.ToolHomeFragmentClass;

/**
 * Created by gaope on 2018/6/8.
 */

public class StrategyListTool  {
    public String textOne;
    public String textTwo;
    public int image;

    public StrategyListTool(String textOne, String textTwo, int image){
        this.textOne = textOne;
        this.textTwo = textTwo;
        this.image = image;
    }

    public void setTextOne(String textOne) {
        this.textOne = textOne;
    }

    public String getTextOne() {
        return textOne;
    }

    public void setTextTwo(String textTwo) {
        this.textTwo = textTwo;
    }

    public String getTextTwo() {
        return textTwo;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }
}
