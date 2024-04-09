package com.example.q2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TableLayout tb = findViewById(R.id.tb);

        String[][] students = {
                {"Ashish", "20", "A"},
                {"Pranita", "18", "B"},
                {"Riya", "18", "A"},
                {"Suraj", "23", "B"},
                {"Hardik", "19", "A"},
                {"Priti", "20", "B"},
                {"Rohit", "22", "A"},
                {"Omkar", "21", "B"},
                {"Jimit", "20", "A"},
                {"Sagnik", "22", "B"}
        };

        for(String[] student:students)
        {
            TableRow row = new TableRow(this);

            TextView tvname = new TextView(this);
            tvname.setText(student[0]);
            row.addView(tvname);

            TextView tvage = new TextView(this);
            tvage.setText(student[1]);
            row.addView(tvage);

            TextView tvgrade = new TextView(this);
            tvgrade.setText(student[2]);
            row.addView(tvgrade);

            tb.addView(row);
        }

    }
    }
