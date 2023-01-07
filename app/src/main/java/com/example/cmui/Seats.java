package com.example.cmui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class Seats extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //To open the Seats page
        setContentView(R.layout.seats);

        //Show the long click text in the A3 Seat
        ToggleButton toggleButton = findViewById(R.id.toggleButton21);
        toggleButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(Seats.this, "Seat A3", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }
    //To open the Menu page
    public void openMenu(View view) {
        startActivity(new Intent(this, MenuActivity.class));
    }

   //Show the text that Seats occupied when the seat deactivate
    public void onToggleClick(View view) {
        Toast.makeText(this, "1 Seat Occupied", Toast.LENGTH_SHORT).show();
    }
}