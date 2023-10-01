package com.example.dailygroceries.Model;

public class ModelRecentView {
//    String productImgUrl;
    int productImgUrl;
    int productBack;

    String productName,productPrice,productDes,productQty;

    public int getProductImgUrl() {
        return productImgUrl;
    }

    public void setProductImgUrl(int productImgUrl) {
        this.productImgUrl = productImgUrl;
    }

    public int getProductBack() {
        return productBack;
    }

    public void setProductBack(int productBack) {
        this.productBack = productBack;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDes() {
        return productDes;
    }

    public void setProductDes(String productDes) {
        this.productDes = productDes;
    }

    public String getProductQty() {
        return productQty;
    }

    public void setProductQty(String productQty) {
        this.productQty = productQty;
    }

    public ModelRecentView(int productImgUrl, int productBack, String productName, String productPrice, String productDes, String productQty) {
        this.productImgUrl = productImgUrl;
        this.productBack = productBack;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDes = productDes;
        this.productQty = productQty;
    }
}
