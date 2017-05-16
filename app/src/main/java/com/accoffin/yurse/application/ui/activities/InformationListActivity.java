package com.accoffin.yurse.application.ui.activities;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.accoffin.yurse.application.R;
import com.accoffin.yurse.application.ui.Constants;

public class InformationListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_list);
        Intent intent = getIntent();
        String title = intent.getStringExtra(Constants.TITLE);
        TextView viewById = (TextView) findViewById(R.id.information_list_outputTextView);
        viewById.setText(viewById.getText() + title);

        //Toast.makeText(this, title, Toast.LENGTH_SHORT).show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.input_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.input_menu_adddata) {
            Intent intent = new Intent(InformationListActivity.this, InputDataActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);

    }
}
