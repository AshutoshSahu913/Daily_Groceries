package com.example.dailygroceries.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dailygroceries.Model.ModelDiscount;
import com.example.dailygroceries.R;

import java.util.ArrayList;

public class DiscountAdapter extends RecyclerView.Adapter<DiscountAdapter.viewHolder> {
    ArrayList<ModelDiscount>list;
    Context context;

    public DiscountAdapter(ArrayList<ModelDiscount> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public DiscountAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.discount_item_list,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DiscountAdapter.viewHolder holder, int position) {

        ModelDiscount modelDiscount = list.get(position);
        holder.itemBack.setImageResource(modelDiscount.getBackImg());
        holder.itemImg.setImageResource(modelDiscount.getItemImg());
        holder.itemName.setText(modelDiscount.getItemName());
        holder.itemDis.setText(modelDiscount.getItemDis());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class viewHolder extends RecyclerView.ViewHolder{
        ImageView itemBack,itemImg;
        TextView itemName,itemDis;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            itemImg=itemView.findViewById(R.id.imgItem);
            itemBack=itemView.findViewById(R.id.backItem);
            itemName=itemView.findViewById(R.id.nameItem);
            itemDis=itemView.findViewById(R.id.disItem);
        }
    }
}
