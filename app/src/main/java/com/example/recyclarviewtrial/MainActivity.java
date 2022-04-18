package com.example.recyclarviewtrial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;

import com.example.recyclarviewtrial.Adapters.RecipieAdapter;
import com.example.recyclarviewtrial.Models.RecipeModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        ArrayList <RecipeModel> list = new ArrayList<>();

        list.add(new RecipeModel(R.drawable.food1 , "Burger"));
        list.add(new RecipeModel(R.drawable.food2 , "Pizza"));
        list.add(new RecipeModel(R.drawable.food3 , "Sandwich  "));
        list.add(new RecipeModel(R.drawable.food4 , "French Fries"));
        list.add(new RecipeModel(R.drawable.food5 , "Vadapav"));
        list.add(new RecipeModel(R.drawable.food1 , "Pizza"));
        list.add(new RecipeModel(R.drawable.food2 , "Sandwich"));
        list.add(new RecipeModel(R.drawable.food3 , "Fries"));
        list.add(new RecipeModel(R.drawable.food4 , "Vadapav"));
        list.add(new RecipeModel(R.drawable.food5 , "Burger"));

        RecipieAdapter adapter = new RecipieAdapter(list , this);
        recyclerView.setAdapter(adapter);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);

//        StaggeredGridLayoutManager staggerd = new StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.HORIZONTAL);
//        recyclerView.setLayoutManager(staggerd);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this , LinearLayoutManager.VERTICAL , false);
//        recyclerView.setLayoutManager(layoutManager);


    }
}