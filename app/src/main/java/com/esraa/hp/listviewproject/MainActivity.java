package com.esraa.hp.listviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<String> langs;
ArrayAdapter<String> adapter;
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.list);

        langs=new ArrayList<>();
        langs.add("Android");
        langs.add("PHP");
        langs.add("C++");
        langs.add("Python");
        langs.add("Java");
        langs.add("JavaScript");
        langs.add("Ajax");
        langs.add("Asp.NET");

        adapter=new ArrayAdapter<String>(this,R.layout.custom_row,R.id.txt,langs);
        listView.setAdapter(adapter);

    }
}
