package com.example.dailygroceries.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dailygroceries.Model.ModelAllCategories;

import com.example.dailygroceries.R;

import java.util.ArrayList;

public class AllCategoriesAdapter extends RecyclerView.Adapter<AllCategoriesAdapter.viewHolder> {
    ArrayList<ModelAllCategories>list;

    public AllCategoriesAdapter(ArrayList<ModelAllCategories> list, Context context) {
        this.list = list;
        this.context = context;
    }

    Context context;
    @NonNull
    @Override
    public AllCategoriesAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item_list,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllCategoriesAdapter.viewHolder holder, int position) {

        ModelAllCategories modelAll = list.get(position);
        holder.cateImg.setImageResource(modelAll.getCateImg());
        holder.cateName.setText(modelAll.getCateName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class viewHolder extends RecyclerView.ViewHolder{
        ImageView cateImg;
        TextView cateName;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            cateImg=itemView.findViewById(R.id.catImg);
            cateName=itemView.findViewById(R.id.catName);
        }
    }
}
