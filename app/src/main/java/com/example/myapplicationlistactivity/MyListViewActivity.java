package com.example.myapplicationlistactivity;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Gravity;
import android.view.View;

public class MyListViewActivity extends ListActivity {
    private final String[] studentIDList = {"CT000001", "CT000002", "CT000003"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        displayListView();

    }

    private void displayListView() {

        List<String> studentList = new ArrayList<String>(Arrays.asList(studentIDList));

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                R.layout.student_list, studentList);
        setListAdapter(dataAdapter);

        ListView listView = getListView();

        listView.setTextFilterEnabled(true);

        listView.setOnItemClickListener((parent, view, position, id) -> {

            Toast toast = Toast.makeText(getApplicationContext(),
                    ((TextView) view).getText(), Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP, 25, 300);
            toast.show();
        });

    }
}