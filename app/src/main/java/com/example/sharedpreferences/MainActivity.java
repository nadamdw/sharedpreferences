package com.example.sharedpreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText email,password;
    Button btnsave,btnlog ;
    SharedPreferences sp;
    String emailf,passwordf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=findViewById(R.id.edit_email);
        password=findViewById(R.id.editpassword);
        btnsave=findViewById(R.id.save);
        btnlog=findViewById(R.id.login);
        sp=getSharedPreferences("myUsePrefs", Context.MODE_PRIVATE);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                emailf=email.getText().toString();
                passwordf=password.getText().toString();
                SharedPreferences.Editor editor=sp.edit();
                editor.putString("email",emailf);
                editor.putString("password",passwordf);
                editor.commit();
                Toast.makeText(MainActivity.this, "information enregistrer", Toast.LENGTH_SHORT).show();

            }
        });
        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent intent=new Intent(MainActivity.this,helloAct.class);
              startActivity(intent);
                emailf=email.getText().toString();
                passwordf=password.getText().toString();
                SharedPreferences.Editor editor=sp.edit();
                editor.putString("email",emailf);
                editor.putString("password",passwordf);
                editor.commit();
                Toast.makeText(MainActivity.this, "information enregistrer", Toast.LENGTH_SHORT).show();

            }
        });

    }
}