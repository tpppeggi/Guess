package com.example.number2;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button resetbtn;
    private TextView noticeboard, displaybox, border;
    FloatingActionButton fab;
    int counter = 0;
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        border = findViewById(R.id.border);
        resetbtn = findViewById(R.id.resetbtn);
        noticeboard = findViewById(R.id.noticeboard);
        displaybox = findViewById(R.id.displaybox);
        fab = findViewById(R.id.fab);

        fab.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                text = Integer.toString(counter);
                displaybox.setText(text);
            }
        });
        resetbtn.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                counter = 0;
                text = Integer.toString(counter);
                displaybox.setText(text);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
