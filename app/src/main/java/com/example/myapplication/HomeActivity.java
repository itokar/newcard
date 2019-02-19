package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
  private RecyclerView recyclerView;
  private RecyclerviewAdapter Adapte;
  private List<Card> cards;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        cards = new ArrayList<>();
        cards.add(new Card(R.drawable.ic_launcher_background,"Widing","10"));
        recyclerView = findViewById(R.id.recyclerview);
        Adapte       =  new RecyclerviewAdapter(this,cards);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(Adapte);


    }
}
