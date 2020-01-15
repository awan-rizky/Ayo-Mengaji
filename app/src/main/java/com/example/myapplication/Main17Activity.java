package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main17Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);
    }
    public void kamu(View view) {
        Intent intent = new Intent(Main17Activity.this, Main18Activity.class);
        startActivity(intent);
    }
    public void lali(View view) {
        Intent intent = new Intent(Main17Activity.this, Main19Activity.class);
        startActivity(intent);
    }
    public void ba(View view) {
        Intent intent = new Intent(Main17Activity.this, Main20Activity.class);
        startActivity(intent);
    }
    public void er(View view) {
        Intent intent = new Intent(Main17Activity.this, Main21Activity.class);
        startActivity(intent);
    }
    public void ty(View view) {
        Intent intent = new Intent(Main17Activity.this, Main22Activity.class);
        startActivity(intent);
    }
    public void ui(View view) {
        Intent intent = new Intent(Main17Activity.this, Main23Activity.class);
        startActivity(intent);
    }
    public void op(View view) {
        Intent intent = new Intent(Main17Activity.this, Main24Activity.class);
        startActivity(intent);
    }
    public void as(View view) {
        Intent intent = new Intent(Main17Activity.this, Main25Activity.class);
        startActivity(intent);
    }
    public void culun(View view) {
        Intent intent = new Intent(Main17Activity.this, MainActivity.class);
        startActivity(intent);
    }
}