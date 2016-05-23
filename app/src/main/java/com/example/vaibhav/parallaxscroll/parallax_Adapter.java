package com.example.vaibhav.parallaxscroll;

/**
 * Created by Vaibhav on 5/21/2016.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;



/**
 * Created by Vaibhav on 5/13/2016.
 */
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class parallax_Adapter  extends RecyclerView.Adapter<parallax_Adapter.MyViewHolder> {
    List<ItemObjects> itemList = Collections.emptyList();
    private LayoutInflater inflator;

    public parallax_Adapter(Context context,List<ItemObjects> itemList){
        this.itemList = itemList;
        inflator = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = inflator.inflate(R.layout.card_layout,parent ,false);
        MyViewHolder holder = new MyViewHolder(layoutView);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
     ItemObjects current = itemList.get(position);
        holder.listTitle.setText(current.name);
        holder.listDetail.setText(current.info);
        holder.listImage.setImageResource(current.photo);
        holder.listButton.setText("+");

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView listDetail;
        public TextView listTitle;
        public ImageView listImage;
        public Button listButton;

        public MyViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
             listTitle = (TextView) itemView.findViewById(R.id.item_title);
            listDetail = (TextView) itemView.findViewById(R.id.item_detail);
            listImage = (ImageView) itemView.findViewById(R.id.item_image);
            listButton = (Button) itemView.findViewById(R.id.item_button);
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "Clicked Position = " + getPosition(), Toast.LENGTH_LONG).show();
        }
    }
}
