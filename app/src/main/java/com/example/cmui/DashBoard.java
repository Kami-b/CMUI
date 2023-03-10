package com.example.cmui;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class DashBoard extends AppCompatActivity {

    private DatePickerDialog datePickerDialog;
    private Button dateButton;
    private DatePickerDialog toDatePickerDialog;
    private Button toDateButton;

    private Spinner dropDownMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //For Dashboard button reader
        setContentView(R.layout.dashboard);

        initDatePicker();
        toInitDatePicker();

        //Set the Current date in the From Button text
        dateButton = findViewById(R.id.datePickerButton);
        dateButton.setText(getTodaysDate());

        //Set the Current date in the To Button text
        toDateButton = findViewById(R.id.datePickerButtonto);
        toDateButton.setText(tgetTodaysDate());

        //Set the Dropdown Menu
        dropDownMenu =  findViewById(R.id.dropdown);
        String[] dashMenu = getResources().getStringArray(R.array.dropdown_container);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, dashMenu);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropDownMenu.setAdapter(adapter);


    }
    //Home button to get back to main menu
    public void openMenu(View view) {
        startActivity(new Intent(this, MenuActivity.class));
    }

    // Function to get the current date which call in the onCreate section
    private String getTodaysDate()
    {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        month = month + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        return makeDateString(day, month, year);
    }
//Get the date from the date picker and show as the text
    private void initDatePicker()
    {
        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener()
        {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day)
            {
                month = month + 1;
                String date = makeDateString(day, month, year);
                dateButton.setText(date);
            }
        };
        // to set the date
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        int style = AlertDialog.THEME_HOLO_LIGHT;

        datePickerDialog = new DatePickerDialog(this, style, dateSetListener, year, month, day);

    }

    private String makeDateString(int day, int month, int year)
    {
        return getMonthFormat(month) + " " + day + " " + year;
    }

    // Show the month format in abbreviation
    private String getMonthFormat(int month)
    {
        if(month == 1)
            return "JAN";
        if(month == 2)
            return "FEB";
        if(month == 3)
            return "MAR";
        if(month == 4)
            return "APR";
        if(month == 5)
            return "MAY";
        if(month == 6)
            return "JUN";
        if(month == 7)
            return "JUL";
        if(month == 8)
            return "AUG";
        if(month == 9)
            return "SEP";
        if(month == 10)
            return "OCT";
        if(month == 11)
            return "NOV";
        if(month == 12)
            return "DEC";

        //default should never happen
        return "JAN";
    }
    //Show the PickerData text in the "From" button
    public void openDatePicker(View view)
    {
        datePickerDialog.show();
    }


//Create the Data picker for to To Calendar

    private String tgetTodaysDate()
    {
        Calendar tcal = Calendar.getInstance();
        int tyear = tcal.get(Calendar.YEAR);
        int tmonth = tcal.get(Calendar.MONTH);
        tmonth = tmonth + 1;
        int tday = tcal.get(Calendar.DAY_OF_MONTH);
        return tmakeDateString(tday, tmonth, tyear);
    }
//Get the date from the listener and show in the To text button
    private void toInitDatePicker()
    {
        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener()
        {
            @Override
            public void onDateSet(DatePicker datapicker, int tyear, int tmonth, int tday)
            {
                tmonth = tmonth + 1;
                String tdate = tmakeDateString(tday, tmonth, tyear);
                toDateButton.setText(tdate);
            }
        };

        Calendar tcal = Calendar.getInstance();
        int tyear = tcal.get(Calendar.YEAR);
        int tmonth = tcal.get(Calendar.MONTH);
        int tday = tcal.get(Calendar.DAY_OF_MONTH);

        int style = AlertDialog.THEME_HOLO_LIGHT;

        toDatePickerDialog = new DatePickerDialog(this, style, dateSetListener, tyear, tmonth, tday);
        //datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());

    }
    //Set the format to show the date
    private String tmakeDateString(int tday, int tmonth, int tyear)
    {
        return getMonthFormat(tmonth) + " " + tday + " " + tyear;
    }

    // Show the month format in abbreviation
    private String tgetMonthFormat(int tmonth)
    {
        if(tmonth == 1)
            return "JAN";
        if(tmonth == 2)
            return "FEB";
        if(tmonth == 3)
            return "MAR";
        if(tmonth == 4)
            return "APR";
        if(tmonth == 5)
            return "MAY";
        if(tmonth == 6)
            return "JUN";
        if(tmonth == 7)
            return "JUL";
        if(tmonth == 8)
            return "AUG";
        if(tmonth == 9)
            return "SEP";
        if(tmonth == 10)
            return "OCT";
        if(tmonth == 11)
            return "NOV";
        if(tmonth == 12)
            return "DEC";

        //default should never happen
        return "JAN";
    }
    //Show the PickerData text in the "To" button
    public void toOpenDatePicker(View view)
    {
        toDatePickerDialog.show();
    }


}