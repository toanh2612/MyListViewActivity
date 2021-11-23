package com.example.myapplicationlistactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_list);
        Intent myIntent = new Intent(this, MyListViewActivity.class);
        startActivity(myIntent);
    }
}