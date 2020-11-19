package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String[] nameList = {"c", "cpp", "intellij", "java", "python", "vscode"};
    String[] desList = {"c description", "cpp description", "intellij description", "java description", "python description", "vscode description"};
    int[] iconList = {R.drawable.c, R.drawable.cplusplus, R.drawable.intellij, R.drawable.java, R.drawable.python, R.drawable.vscode};

    RecyclerView recyclerView;
    MyAdapter myAdapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.RV_recyclerview);

        recyclerView.setHasFixedSize(true);//사이즈 고정

        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        myAdapter = new MyAdapter(this, nameList, desList, iconList);

        recyclerView.setAdapter(myAdapter);
    }
}