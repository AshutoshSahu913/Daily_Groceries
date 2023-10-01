package com.example.dailygroceries;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dailygroceries.Adapter.CategoryAdapter;
import com.example.dailygroceries.Adapter.DiscountAdapter;
import com.example.dailygroceries.Adapter.RecentAdapter;
import com.example.dailygroceries.Model.ModelCategory;
import com.example.dailygroceries.Model.ModelDiscount;
import com.example.dailygroceries.Model.ModelRecentView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvDis, rvCat;

    ImageView allCategory;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        allCategory = findViewById(R.id.allCategories);
        /* For Discount */
        ArrayList<ModelDiscount> list = new ArrayList<>();

        rvDis = findViewById(R.id.rvDisItem);

        list.add(new ModelDiscount(R.drawable.rectangle_orange, R.drawable.img_1, "Orange", "14% off"));
        list.add(new ModelDiscount(R.drawable.rectangle_3, R.drawable.vegetables, "Vegetables", "20% off"));
        list.add(new ModelDiscount(R.drawable.rectangle_4, R.drawable.juice, "Juice", "13% off"));
        list.add(new ModelDiscount(R.drawable.rectangle_strawberry, R.drawable.cookie, "Cookies", "24% off"));
        list.add(new ModelDiscount(R.drawable.rectangle_5, R.drawable.fruits, "Fruits", "8% off"));
        list.add(new ModelDiscount(R.drawable.rectangle_4, R.drawable.egg, "Eggs", "17% off"));
        list.add(new ModelDiscount(R.drawable.rectangle_strawberry, R.drawable.image1, "StrawBerry", "24% off"));
        list.add(new ModelDiscount(R.drawable.rectangle_orange, R.drawable.img_1, "Orange", "14% off"));
        list.add(new ModelDiscount(R.drawable.rectangle_3, R.drawable.vegetables, "Vegetables", "20% off"));
        list.add(new ModelDiscount(R.drawable.rectangle_5, R.drawable.fruits, "Fruits", "8% off"));
        list.add(new ModelDiscount(R.drawable.rectangle_4, R.drawable.egg, "Eggs", "17% off"));
        list.add(new ModelDiscount(R.drawable.rectangle_strawberry, R.drawable.image1, "StrawBerry", "10% off"));

        DiscountAdapter discountAdapter = new DiscountAdapter(list, this);
        rvDis.setAdapter(discountAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rvDis.setLayoutManager(linearLayoutManager);


        /* For Category */
        rvCat = findViewById(R.id.rvCategory);
        ArrayList<ModelCategory> list1 = new ArrayList<>();
        list1.add(new ModelCategory(R.drawable.juice, "Juice"));
        list1.add(new ModelCategory(R.drawable.cookie, "Cookies"));
        list1.add(new ModelCategory(R.drawable.fruits1, "Fruits"));
        list1.add(new ModelCategory(R.drawable.milk, "Milk"));
        list1.add(new ModelCategory(R.drawable.bibimbap, "Vegan"));
        list1.add(new ModelCategory(R.drawable.vegetables, "Vegetables"));
        list1.add(new ModelCategory(R.drawable.egg, "Eggs"));
        list1.add(new ModelCategory(R.drawable.meat, "Meat"));
        list1.add(new ModelCategory(R.drawable.juice, "Juice"));
        list1.add(new ModelCategory(R.drawable.cookie, "Cookies"));
        list1.add(new ModelCategory(R.drawable.fruits1, "Fruits"));
        list1.add(new ModelCategory(R.drawable.milk, "Milk"));
        list1.add(new ModelCategory(R.drawable.bibimbap, "Vegan"));
        list1.add(new ModelCategory(R.drawable.vegetables, "Vegetables"));
        list1.add(new ModelCategory(R.drawable.egg, "Eggs"));
        list1.add(new ModelCategory(R.drawable.meat, "Meat"));

        CategoryAdapter categoryAdapter = new CategoryAdapter(list1, this);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rvCat.setLayoutManager(linearLayoutManager1);
        rvCat.setAdapter(categoryAdapter);

        allCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AllCategories.class));
            }
        });

        /* For Recents Viewed */
        RecyclerView rvRecent = findViewById(R.id.rvRecentViewed);
        ArrayList<ModelRecentView> list2 = new ArrayList<>();
        list2.add(new ModelRecentView(R.drawable.watermelon,
                R.color.green,
                "WaterMelon",
                "₹ 120",
                "Belladonna watermelon The Belladonna is a variety of Italian Tarocco Sweet watermelon. ...",
                "3 kg"));
        list2.add(new ModelRecentView(R.drawable.banana,
                R.color.yellow,
                "banana",
                "₹ 60",
                "Fresh full strong banana ",
                "2 kg"));


        list2.add(new ModelRecentView(R.drawable.vegetables,
                R.color.appColor,
                "Vegetables",
                "₹ 125",
                "Fresh Vegetables like patato,tamato",
                "1.5 kg"));

        list2.add(new ModelRecentView(R.drawable.food,
                R.color.red,
                "Apple",
                "₹ 110",
                "A Fresh Apple",
                "3 kg"));
        list2.add(new ModelRecentView(R.drawable.img_1,
                R.color.orange,
                "Orange",
                "₹ 75",
                "Orange Fresh ",
                "3kg"));
        list2.add(new ModelRecentView(R.drawable.grape,
                R.color.purple,
                "Juice",
                "₹ 89",
                "fresh fruit cocktail with fresh fruit slices ice cooling on white, drink juice cocktail fruit  ",
                "1 lit"));
        list2.add(new ModelRecentView(R.drawable.fresh_fruits,
                R.color.orange,
                "Fruits",
                "₹ 153",
                "Fruits are ripened ovaries of flowering plants that contain seeds.",
                "5 kg"));

        list2.add(new ModelRecentView(R.drawable.food,
                R.color.red,
                "Apple",
                "₹ 110",
                "A Fresh Apple",
                "3 kg"));
        list2.add(new ModelRecentView(R.drawable.img_1,
                R.color.orange,
                "Orange",
                "₹ 75",
                "Belladonna Orange The Belladonna is a variety of Italian Tarocco Sweet Orange. ... ",
                "3kg"));

        list2.add(new ModelRecentView(R.drawable.watermelon,
                R.color.green,
                "WaterMelon",
                "₹ 120",
                "Belladonna watermelon The Belladonna is a variety of Italian Tarocco Sweet watermelon. ...",
                "3 kg"));
        list2.add(new ModelRecentView(R.drawable.banana,
                R.color.yellow,
                "banana",
                "₹ 60",
                "Fresh full strong banana ",
                "2 kg"));


        list2.add(new ModelRecentView(R.drawable.vegetables,
                R.color.appColor,
                "Vegetables",
                "₹ 125",
                "Fresh Vegetables like patato,tamato",
                "1.5 kg"));

        list2.add(new ModelRecentView(R.drawable.food,
                R.color.red,
                "Apple",
                "₹ 110",
                "A Fresh Apple",
                "3 kg"));
        list2.add(new ModelRecentView(R.drawable.img_1,
                R.color.orange,
                "Orange",
                "₹ 75",
                "Orange Fresh ",
                "3kg"));
        list2.add(new ModelRecentView(R.drawable.grape,
                R.color.purple,
                "Juice",
                "₹ 89",
                "fresh fruit cocktail with fresh fruit slices ice cooling on white, drink juice cocktail fruit  ",
                "1 lit"));
        list2.add(new ModelRecentView(R.drawable.fresh_fruits,
                R.color.orange,
                "Fruits",
                "₹ 153",
                "Fruits are ripened ovaries of flowering plants that contain seeds.",
                "5 kg"));

        list2.add(new ModelRecentView(R.drawable.food,
                R.color.red,
                "Apple",
                "₹ 110",
                "A Fresh Apple",
                "3 kg"));
        list2.add(new ModelRecentView(R.drawable.img_1,
                R.color.orange,
                "Orange",
                "₹ 75",
                "Belladonna Orange The Belladonna is a variety of Italian Tarocco Sweet Orange. ... ",
                "3kg"));

        RecentAdapter recentAdapter = new RecentAdapter(list2, this);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rvRecent.setLayoutManager(linearLayoutManager2);
        rvRecent.setAdapter(recentAdapter);

    }
}