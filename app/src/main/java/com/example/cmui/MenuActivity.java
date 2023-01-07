package com.example.cmui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //To open the Menu page
        setContentView(R.layout.menu);
    }
    //To open the Capacity page
    public void openCapacity(View view) {
        startActivity(new Intent(this, Capacity.class));}
    //To open the Temperature page
    public void openTemperature(View view) {
        startActivity(new Intent(this, Temperature.class));}
    //To open the Seats page
    public void openSeats(View view) {
        startActivity(new Intent(this, Seats.class));}
    //To open the Dashboard page
    public void openDashboard(View view) {
        startActivity(new Intent(this, DashBoard.class));}
}