package com.accoffin.yurse.application.ui.activities;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.accoffin.yurse.application.R;

public class InformationListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_list);


        FloatingActionButton informationfab = (FloatingActionButton) findViewById(R.id.information_list_fab);
        informationfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FloatingActionButton informationfab = (FloatingActionButton) findViewById(R.id.information_list_fab);
                informationfab.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(InformationListActivity.this, InputDataActivity.class);
                        startActivity(intent);
                       /* Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();*/
                    }
                });
            }
        });
    }
}
