package com.example.megha.mypjct;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class student extends AppCompatActivity {
    EditText ed1,ed2;
    Button b1,b2;
    String sid,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        ed1=(EditText)findViewById(R.id.sd);
        ed2=(EditText)findViewById(R.id.psw);
        b1=(Button)findViewById(R.id.loginb);
        b2=(Button)findViewById(R.id.regb);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                sid=ed1.getText().toString();
                pass=ed2.getText().toString();
                if(sid.equals("mzc")&&pass.equals("college"))
                {
                    SharedPreferences.Editor editor=getSharedPreferences("login",MODE_PRIVATE).edit();
                    editor.putString("username",sid);
                    editor.putString("pass",pass);
                    editor.apply();

                    Intent i=new Intent(getApplicationContext(),Welcome.class);
                    startActivity(i);

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"invalid login detail",Toast.LENGTH_LONG).show();
                }


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),Register.class);
                startActivity(i);
            }
        });

    }
}
