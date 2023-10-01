package com.example.dailygroceries.Model;

public class ModelCategory {
    int catImg;
    String catName;

    public int getCatImg() {
        return catImg;
    }

    public void setCatImg(int catImg) {
        this.catImg = catImg;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public ModelCategory(int catImg, String catName) {
        this.catImg = catImg;
        this.catName = catName;
    }
}
