package com.example.menudemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return  true;

       // return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemID=item.getItemId();
        if (itemID==R.id.action_home)
        {
            Toast.makeText(this,"HOME is used",Toast.LENGTH_SHORT).show();
        } else if (itemID==R.id.action_search)
        {
            Toast.makeText(this,"SEARCH is used",Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);
    }
}