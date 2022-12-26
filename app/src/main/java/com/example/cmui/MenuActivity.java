package com.example.cmui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void openCapacity(View view) {
        startActivity(new Intent(this, Capacity.class));}

    public void openTemperature(View view) {
        startActivity(new Intent(this, Temperature.class));}

    public void openSeats(View view) {
        startActivity(new Intent(this, Seats.class));}

    public void openDashboard(View view) {
        startActivity(new Intent(this, DashBoard.class));}
}