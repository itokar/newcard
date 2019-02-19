package com.example.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.MyViewHolde> {

    private Context context;
    private List<Card> mDate;

    public RecyclerviewAdapter(Context context, List<Card> mDate) {
        this.context = context;
        this.mDate = mDate;
    }

    @NonNull
    @Override
    public MyViewHolde onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        // List Item on the layout of the project
        view = LayoutInflater.from(context).inflate(R.layout.item_list,viewGroup,false);
        // New MyViewHolder
        return new MyViewHolde(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolde myViewHolde, int i) {

        myViewHolde.card_imge.setImageResource(mDate.get(i).getImge_card());

        myViewHolde.name.setText(mDate.get(i).getName());
        myViewHolde.price.setText(mDate.get(i).getPrice());
    }

    @Override
    public int getItemCount() {
        return mDate.size();
    }

    public static class MyViewHolde extends RecyclerView.ViewHolder {
         private ImageView card_imge;
         private TextView  name;
         private TextView  price;
        public MyViewHolde(@NonNull View itemView) {
            super(itemView);

            // The

            card_imge = itemView.findViewById(R.id.card_image);
            name      = itemView.findViewById(R.id.card_name);
            price     = itemView.findViewById(R.id.card_price);
        }
    }
}
