package com.example.dailygroceries;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dailygroceries.Adapter.AllCategoriesAdapter;
import com.example.dailygroceries.Model.ModelAllCategories;

import java.util.ArrayList;

public class AllCategories extends AppCompatActivity {

    RecyclerView rvAllCategories;
    ImageView back, cart;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_categories);
        rvAllCategories = findViewById(R.id.rvAllCategories);
        ArrayList<ModelAllCategories> list = new ArrayList<>();
        list.add(new ModelAllCategories(R.drawable.fruits1, "Fruits"));
        list.add(new ModelAllCategories(R.drawable.juice, "Juice"));
        list.add(new ModelAllCategories(R.drawable.cookie, "Cookies"));
        list.add(new ModelAllCategories(R.drawable.milk, "Milk"));
        list.add(new ModelAllCategories(R.drawable.bibimbap, "Vegan"));
        list.add(new ModelAllCategories(R.drawable.vegetables, "Vegetables"));
        list.add(new ModelAllCategories(R.drawable.egg, "Eggs"));
        list.add(new ModelAllCategories(R.drawable.meat, "Meat"));
        list.add(new ModelAllCategories(R.drawable.fruits1, "Fruits"));
        list.add(new ModelAllCategories(R.drawable.milk, "Milk"));
        list.add(new ModelAllCategories(R.drawable.bibimbap, "Vegan"));
        list.add(new ModelAllCategories(R.drawable.vegetables, "Vegetables"));
        list.add(new ModelAllCategories(R.drawable.egg, "Eggs"));
        list.add(new ModelAllCategories(R.drawable.meat, "Meat"));


        AllCategoriesAdapter allCategoriesAdapter = new AllCategoriesAdapter(list, this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        rvAllCategories.setAdapter(allCategoriesAdapter);
        rvAllCategories.setLayoutManager(gridLayoutManager);


        back = findViewById(R.id.backToHome);
        cart = findViewById(R.id.goToCart);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });


    }
}