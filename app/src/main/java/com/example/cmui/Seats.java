package com.example.cmui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Seats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.seats);
    }

    public void openMenu(View view) {
        startActivity(new Intent(this, MenuActivity.class));
    }

   public void onToggleClick(View view) {
        Toast.makeText(this, "1 Seat Occupied", Toast.LENGTH_SHORT).show();
    }
}