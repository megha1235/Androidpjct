package com.example.megha.mypjct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class empty extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);
        lv=(ListView)findViewById(R.id.ls);
        String[] students={"Rani","Manu","mahesh"};
        ArrayAdapter adapter=new ArrayAdapter(getApplicationContext(),R.layout.listview,students);
        lv.setAdapter(adapter);

    }
}
