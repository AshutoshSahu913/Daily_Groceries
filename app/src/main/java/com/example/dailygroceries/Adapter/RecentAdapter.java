package com.example.dailygroceries.Adapter;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dailygroceries.Model.ModelRecentView;
import com.example.dailygroceries.ProductDetails;
import com.example.dailygroceries.R;

import java.util.ArrayList;

public class RecentAdapter extends RecyclerView.Adapter<RecentAdapter.viewHolder> {
    ArrayList<ModelRecentView> list;
    Context context;

    public RecentAdapter(ArrayList<ModelRecentView> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecentAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recent_view_item_list, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentAdapter.viewHolder holder, int position) {
        ModelRecentView modelRecentView = list.get(position);
        // Load and display the image using Glide
//        Glide.with(context)
//                .load(modelRecentView.getProductImgUrl())
//                .placeholder(R.drawable.ic_launcher_foreground)  // Placeholder image while loading
//                .error(R.drawable.juice)  // Image to display in case of an error
//                .into(holder.img);
        holder.img.setImageResource(modelRecentView.getProductImgUrl());
        holder.back.setImageResource(modelRecentView.getProductBack());
        holder.name.setText(modelRecentView.getProductName());
        holder.price.setText(modelRecentView.getProductPrice());
        holder.des.setText(modelRecentView.getProductDes());
        holder.qty.setText(modelRecentView.getProductQty());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, ProductDetails.class);
                intent.putExtra("img",modelRecentView.getProductName());
                intent.putExtra("name",modelRecentView.getProductName());
                intent.putExtra("price", modelRecentView.getProductPrice());
                intent.putExtra("des",modelRecentView.getProductDes());
                intent.putExtra("qty",modelRecentView.getProductQty());
//
//                Pair[] pairs = new Pair[1];
//                pairs[0] = new Pair<View, String>(holder.img, "image");
//                ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
//                context.startActivity(intent, activityOptions.toBundle());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        ImageView back, img;
        TextView name, price, des, qty;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.product_img);
            back = itemView.findViewById(R.id.productBack);
            name = itemView.findViewById(R.id.productName);
            price = itemView.findViewById(R.id.productPrice);
            des = itemView.findViewById(R.id.productDes);
            qty = itemView.findViewById(R.id.productQty);
        }
    }
}
