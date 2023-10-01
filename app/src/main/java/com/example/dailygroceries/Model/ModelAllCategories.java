package com.example.dailygroceries.Model;

public class ModelAllCategories {
    int cateImg;
    String CateName;

    public int getCateImg() {
        return cateImg;
    }

    public void setCateImg(int cateImg) {
        this.cateImg = cateImg;
    }

    public String getCateName() {
        return CateName;
    }

    public void setCateName(String cateName) {
        CateName = cateName;
    }

    public ModelAllCategories(int cateImg, String cateName) {
        this.cateImg = cateImg;
        CateName = cateName;
    }
}
