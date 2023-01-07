package com.example.cmui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Capacity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //To open the Capacity page
        setContentView(R.layout.capacity);
    }
    //To open the Menu page
    public void openMenu(View view) {
        startActivity(new Intent(this, MenuActivity.class));
    }
}