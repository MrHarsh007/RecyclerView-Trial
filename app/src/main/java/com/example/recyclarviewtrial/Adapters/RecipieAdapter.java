package com.example.recyclarviewtrial.Adapters;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclarviewtrial.Models.RecipeModel;
import com.example.recyclarviewtrial.R;

import java.util.ArrayList;

public class RecipieAdapter extends  RecyclerView.Adapter<RecipieAdapter.viewHolder> {

    ArrayList<RecipeModel> list;
    Context context;

    public RecipieAdapter(ArrayList<RecipeModel> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_recyclerview,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        RecipeModel model = list.get(position);
        holder.imageview.setImageResource(model.getPic());
        holder.textview.setText(model.getText());




//        Click Position Wise:

        switch (position){
            case 0:
                holder.imageview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "1st image Is clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.textview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "1st text Is clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                   break;
//
                case 1:
                holder.imageview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "2nd image Is clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.textview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "2nd text Is clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 2:
                holder.imageview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "3rd image Is clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.textview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "3rd text Is clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 3:
                holder.imageview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "4th image Is clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.textview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "4th text Is clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 4:
                holder.imageview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "5th image Is clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.textview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "5th text Is clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                break;






    }



    }

    @Override
    public int getItemCount() {
      return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView imageview;
        TextView textview;


        public  viewHolder(@NonNull View itemView){
            super(itemView);

            imageview = itemView.findViewById(R.id.imageView);
            textview = itemView.findViewById(R.id.textView);

        }
    }

}