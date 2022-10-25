package com.example.kuku.ui.home;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kuku.R;
import com.example.kuku.models.Item;

import java.util.ArrayList;

public class ItemAdaptor extends RecyclerView.Adapter<ItemAdaptor.ViewHolder> {
    // Model items
    private ArrayList<Item> data;
    Context context;
    private View view;

    public ItemAdaptor(Context context){
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.card_item,parent,false
        );
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtBreed.setText(data.get(position).getBreed());
        holder.txtType.setText(data.get(position).getType());
        holder.txtPrice.setText(String.format("%s", data.get(position).getPrice()));
        holder.itemImage.setImageURI(Uri.parse(data.get(position).getImage()));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    // View lookup cache
    protected static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtBreed;
        TextView txtType;
        ImageView itemImage;
        TextView txtPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtBreed = itemView.findViewById(R.id.breed);
            txtType =itemView.findViewById(R.id.type);
            txtPrice=itemView.findViewById(R.id.price);
            itemImage = itemView.findViewById(R.id.image);

            // Button click handles
            Button button = itemView.findViewById(R.id.card_btn);
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), txtBreed.getText() +" added to your basket",Toast.LENGTH_LONG).show();
                }
            });

        }
    }

    public void setItems(ArrayList<Item> items) {
        this.data = items;
    }
}
