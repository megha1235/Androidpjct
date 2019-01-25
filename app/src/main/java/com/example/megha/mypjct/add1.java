package com.example.megha.mypjct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class add1 extends AppCompatActivity {
EditText e1,e2;
    Button b;
    String s1,s2,s3;
    Integer n1,n2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add1);
        e1=(EditText)findViewById(R.id.an1);
        e2=(EditText)findViewById(R.id.an2);
        b=(Button)findViewById(R.id.ad1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                n1=Integer.parseInt(s1);
                n2=Integer.parseInt(s2);
                sum=n1+n2;
                s3=String.valueOf(sum);
                Toast.makeText(getApplicationContext(),s3,Toast.LENGTH_LONG).show();
            }
        });
    }
}
