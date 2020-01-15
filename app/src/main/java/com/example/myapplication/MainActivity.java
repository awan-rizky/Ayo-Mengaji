package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindah(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }
    public void sayang(View view) {
        Intent intent = new Intent(MainActivity.this, Main8Activity.class);
        startActivity(intent);
    }
    public void fikri(View view) {
        Intent intent = new Intent(MainActivity.this, Main17Activity.class);
        startActivity(intent);
    }

}
