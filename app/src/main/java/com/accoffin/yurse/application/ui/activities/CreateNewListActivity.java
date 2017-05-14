package com.accoffin.yurse.application.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.accoffin.yurse.application.R;
import com.accoffin.yurse.application.ui.adapters.CategoriesAdapter;

import java.util.ArrayList;
import java.util.List;

public class CreateNewListActivity extends AppCompatActivity {

    private List<String> ListCategories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_list);
        ListCategories = new ArrayList<>();
        ListCategories.add("Card");
        ListCategories.add("Food & Drink");
        ListCategories.add("House");
        ListCategories.add("Car");
        ListCategories.add("Others");
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.create_new_list_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        CategoriesAdapter adapter = new CategoriesAdapter(this, ListCategories);
        adapter.setOnCategoriesClickListener(new CategoriesAdapter.OnCategoriesClickListener() {
            @Override
            public void onClick(String text) {
                Intent intent = new Intent(CreateNewListActivity.this, InformationListActivity.class);
                startActivity(intent);
                  Toast.makeText(CreateNewListActivity.this, text, Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setAdapter(adapter);

    }
}
