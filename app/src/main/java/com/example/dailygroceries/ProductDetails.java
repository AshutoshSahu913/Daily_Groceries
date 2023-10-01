package com.example.dailygroceries;

import static com.example.dailygroceries.R.color.appColor;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProductDetails extends AppCompatActivity {

    ImageView pImg, backToHome;
    TextView pName, pPrice, pDes, pQty, Name;
    Button cartBtn, buyBtn;

    String name, price, desc, qty, unit;
    int img;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        cartBtn = findViewById(R.id.cartBtn);
        buyBtn = findViewById(R.id.buyBtn);
        backToHome = findViewById(R.id.backToHome);
        Name = findViewById(R.id.Name);

        Intent i=getIntent();
        name=i.getStringExtra("name");
        img=i.getIntExtra("img",R.drawable.rectangle_orange);
        price=i.getStringExtra("price");
        desc=i.getStringExtra("des");
        qty=i.getStringExtra("qty");


        pImg = findViewById(R.id.product_img1);
        pName = findViewById(R.id.product_Name);
        pPrice = findViewById(R.id.product_Price);
        pDes = findViewById(R.id.product_Des);
        pQty = findViewById(R.id.product_qty);


        pImg.setImageResource(img);
        pName.setText(name);
        pPrice.setText(price);
        pDes.setText(desc);
        pQty.setText(qty);

        Name.setText(name);

        cartBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                cartBtn.setBackgroundResource(R.drawable.rectangle_empty);
                cartBtn.setTextColor(appColor);
            }
        });
        buyBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                buyBtn.setBackgroundResource(R.drawable.rectangle_empty);
                buyBtn.setTextColor(appColor);
            }
        });

        backToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }
}