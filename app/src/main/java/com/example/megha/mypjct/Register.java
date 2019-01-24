package com.example.megha.mypjct;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
EditText n,a,co,pl,s,p,c;
    Button r,A;
    String passw,conpass,name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        n=(EditText)findViewById(R.id.name);
        a=(EditText)findViewById(R.id.ano);
        co=(EditText)findViewById(R.id.clg);
        pl=(EditText)findViewById(R.id.pls);
        s=(EditText)findViewById(R.id.sid);
        p=(EditText)findViewById(R.id.pass);
        c=(EditText)findViewById(R.id.cpass);
        r=(Button)findViewById(R.id.regs);
        A=(Button)findViewById(R.id.ald);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n.getText().toString();
                a.getText().toString();
                co.getText().toString();
                p.getText().toString();
                s.getText().toString();
               passw= p.getText().toString();
                name= n.getText().toString();
                conpass=c.getText().toString();
                if (passw.equals(conpass))
                {
                    SharedPreferences.Editor editor=getSharedPreferences("login",MODE_PRIVATE).edit();
                    editor.putString("username",name);
                    editor.putString("password",passw);
                    editor.apply();
                    Intent a= new Intent(getApplicationContext(),Welcome.class);
                    startActivity(a);
                    Toast.makeText(getApplicationContext(),"Welcome",Toast.LENGTH_LONG).show();
                }
               else
                {
                    Toast.makeText(getApplicationContext(),"password And conform password does't match",Toast.LENGTH_LONG).show();
                }


            }
        });
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),student.class);
               i.putExtra("username",name);
                i.putExtra("password",passw);
                startActivity(i);
            }
        });
    }
}
