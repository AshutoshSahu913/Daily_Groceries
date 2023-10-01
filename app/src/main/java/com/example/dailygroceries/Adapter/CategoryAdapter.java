package com.example.dailygroceries.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dailygroceries.Model.ModelCategory;
import com.example.dailygroceries.R;

import java.util.ArrayList;

public class CategoryAdapter  extends RecyclerView.Adapter<CategoryAdapter.viewHolder> {

    ArrayList<ModelCategory>list;
    Context context;

    public CategoryAdapter(ArrayList<ModelCategory> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item_list,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.viewHolder holder, int position) {
        ModelCategory model = list.get(position);
        holder.catImg.setImageResource(model.getCatImg());
        holder.catName.setText(model.getCatName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class viewHolder extends RecyclerView.ViewHolder{
        ImageView catImg;
        TextView catName;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            catImg=itemView.findViewById(R.id.catImg);
            catName=itemView.findViewById(R.id.catName);
        }
    }
}
