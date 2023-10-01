package com.example.dailygroceries.Model;

public class ModelDiscount {
    int backImg,itemImg;
    String itemName,itemDis;

    public int getBackImg() {
        return backImg;
    }

    public void setBackImg(int backImg) {
        this.backImg = backImg;
    }

    public int getItemImg() {
        return itemImg;
    }

    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDis() {
        return itemDis;
    }

    public void setItemDis(String itemDis) {
        this.itemDis = itemDis;
    }

    public ModelDiscount(int backImg, int itemImg, String itemName, String itemDis) {
        this.backImg = backImg;
        this.itemImg = itemImg;
        this.itemName = itemName;
        this.itemDis = itemDis;
    }
}
