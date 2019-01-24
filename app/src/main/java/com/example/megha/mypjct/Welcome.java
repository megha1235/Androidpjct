package com.example.megha.mypjct;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Welcome extends AppCompatActivity {
 String usr,pass,checkusername;
    Button b1;
    String getuser,getPass;
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


        //Toast.makeText(getApplicationContext(),pass,Toast.LENGTH_LONG).show();

        //Intent i=getIntent();
        //usr=i.getExtras().getString("username");
        //pass=i.getExtras().getString("password");
       // Toast.makeText(getApplicationContext(),usr,Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(),pass,Toast.LENGTH_LONG).show();
    }
}
