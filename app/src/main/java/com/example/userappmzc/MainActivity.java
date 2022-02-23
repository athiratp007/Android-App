package com.example.userappmzc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText ed1,ed2;
AppCompatButton b1,b2;
String getUserName,getPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//linking of activity_main.xml

        ed1=(EditText) findViewById(R.id.uname);
        ed2=(EditText) findViewById(R.id.pword);

        b1=(AppCompatButton) findViewById(R.id.log);
        b2=(AppCompatButton) findViewById(R.id.reg);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUserName=ed1.getText().toString();
                getPassword=ed2.getText().toString();
                Toast.makeText(getApplicationContext(), getUserName, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getPassword, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), "login successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}