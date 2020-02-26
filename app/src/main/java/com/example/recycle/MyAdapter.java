package com.example.recycle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<ViewHolder> implements Filterable {
    Context context;
    String[] names;
    int []flags;



    public MyAdapter(Context context,String[] names, int[] flags) {
        this.context=context;
        this.names = names;
        this.flags = flags;


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view= LayoutInflater.from(context).inflate(R.layout.sample,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(names[position]);
        holder.imageView.setImageResource(flags[position]);
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    @Override
    public Filter getFilter() {
        return filter;
    }
    Filter filter=new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {
            return null;
        }

        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {

        }
    };
}


 class ViewHolder extends RecyclerView.ViewHolder {
    TextView textView;
    ImageView imageView;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.textViewId);
        imageView=itemView.findViewById(R.id.imageViewId);

    }
}