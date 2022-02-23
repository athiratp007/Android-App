package com.example.userappmzc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
EditText e1,e2,e3,e4,e5,e6;
AppCompatButton bt1,bt2;
String getUserName,getPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        e1=(EditText) findViewById(R.id.nam);
        e2=(EditText) findViewById(R.id.mob);
        e3=(EditText) findViewById(R.id.email);
        e4=(EditText) findViewById(R.id.unam);
        e5=(EditText) findViewById(R.id.pass);
        e6=(EditText) findViewById(R.id.conpass);
        bt1=(AppCompatButton) findViewById(R.id.reg);
        bt2=(AppCompatButton) findViewById(R.id.btlog);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), getUserName, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getPassword, Toast.LENGTH_SHORT).show();
              //  getUserName=e4.getText().toString();
               // getPassword=e5.getText().toString();

            }
        });
    }
}