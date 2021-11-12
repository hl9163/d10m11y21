package com.example.d10m11y21;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {
    LinearLayout background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        background = (LinearLayout) findViewById(R.id.linearlayout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.first){
            background.setBackgroundColor(Color.GREEN);
        }
        else if (id == R.id.second){
            background.setBackgroundColor(Color.BLACK);
        }
        else{
            background.setBackgroundColor(Color.BLUE);
        }
        return true;
    }

    public void secondPage(View view) {
        Intent si = new Intent(this,SecondPage.class);
        startActivity(si);
    }
}