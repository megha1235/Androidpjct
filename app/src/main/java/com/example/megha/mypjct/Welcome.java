package com.example.megha.mypjct;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Welcome extends AppCompatActivity {
 String usr,pass,checkusername;
    Button b1,v;
    String getuser,getPass;

    ImageView m1,m2,m3,m4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        //SharedPreferences pref=getPreferences("login",MODE_PRIVATE);
        //checkusername=pref.getString("username",null);
       // if (checkusername!=null)
        //{
           // Intent i=new Intent(getApplicationContext(),student.class);
            //startActivity(i);
        //}
        b1=(Button)findViewById(R.id.logout);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor=getSharedPreferences("login",MODE_PRIVATE).edit();
                editor.clear();
                editor.commit();
                Intent i=new Intent(getApplicationContext(),student.class);
                startActivity(i);

            }
        });
        m1=(ImageView)findViewById(R.id.ad);
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),add1.class);
                startActivity(i);


            }
        });
        m2=(ImageView)findViewById(R.id.subb);
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f= new Intent(getApplicationContext(),sub1.class);
                startActivity(f);

            }
        });

        m3=(ImageView)findViewById(R.id.multi);
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent g= new Intent(getApplicationContext(),mult1.class);
                startActivity(g);
            }
        });
        m4=(ImageView)findViewById(R.id.divi);
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h= new Intent(getApplicationContext(),div1.class);
                startActivity(h);
            }
        });

        //Toast.makeText(getApplicationContext(),pass,Toast.LENGTH_LONG).show();

        //Intent i=getIntent();
        //usr=i.getExtras().getString("username");
        //pass=i.getExtras().getString("password");
       // Toast.makeText(getApplicationContext(),usr,Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(),pass,Toast.LENGTH_LONG).show();
        v=(Button)findViewById(R.id.va);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s= new Intent(getApplicationContext(),empty.class);
                startActivity(s);
            }
        });
    }
}
