package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }
    public void kamu(View view) {
        Intent intent = new Intent(Main8Activity.this, Main9Activity.class);
        startActivity(intent);
    }
    public void lali(View view) {
        Intent intent = new Intent(Main8Activity.this, Main10Activity.class);
        startActivity(intent);
    }
    public void ba(View view) {
        Intent intent = new Intent(Main8Activity.this, Main11Activity.class);
        startActivity(intent);
    }
    public void er(View view) {
        Intent intent = new Intent(Main8Activity.this, Main12Activity.class);
        startActivity(intent);
    }
    public void ty(View view) {
        Intent intent = new Intent(Main8Activity.this, Main13Activity.class);
        startActivity(intent);
    }
    public void ui(View view) {
        Intent intent = new Intent(Main8Activity.this, Main14Activity.class);
        startActivity(intent);
    }
    public void op(View view) {
        Intent intent = new Intent(Main8Activity.this, Main15Activity.class);
        startActivity(intent);
    }
    public void as(View view) {
        Intent intent = new Intent(Main8Activity.this, Main16Activity.class);
        startActivity(intent);
    }
    public void culun(View view) {
        Intent intent = new Intent(Main8Activity.this, MainActivity.class);
        startActivity(intent);
    }
}
