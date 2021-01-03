package com.example.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class helloAct extends AppCompatActivity {
    Button btnLogout ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello);
        TextView text1,text2;
        text1=findViewById(R.id.t1);
        text2=findViewById(R.id.t2);
        SharedPreferences sp =getApplicationContext().getSharedPreferences("myUsePrefs", Context.MODE_PRIVATE);
        String email=sp.getString("name","");
        String password=sp.getString("password","");
        text1.setText(email);
        text2.setText(password);

      }
}