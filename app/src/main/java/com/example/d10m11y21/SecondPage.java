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

public class SecondPage extends AppCompatActivity {
    LinearLayout background2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        background2 = (LinearLayout) findViewById(R.id.linearlayout);

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        menu.add(0,0,350,"yellow");
        return true;
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String st=item.getTitle().toString();
        if (st=="yellow") {
            background2.setBackgroundColor(Color.YELLOW);
        }

        int id = item.getItemId();

        if (id == R.id.first){
            background2.setBackgroundColor(Color.GREEN);
        }
        else if (id == R.id.second){
            background2.setBackgroundColor(Color.BLACK);
        }
        else if (id == R.id.third){
            background2.setBackgroundColor(Color.BLUE);
        }
        return true;
    }

    public void firstPage(View view) {
        Intent si = new Intent(this,MainActivity.class);
        startActivity(si);
    }
}