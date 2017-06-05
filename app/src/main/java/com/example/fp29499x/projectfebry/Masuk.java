package com.example.fp29499x.projectfebry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Masuk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masuk);
    }
    public void Food (View view) {
        Intent intent = new Intent(Masuk.this, Food.class);
        startActivity(intent);
    }
    public void Accesories (View view) {
        Intent intent = new Intent(Masuk.this, Accesories.class);
        startActivity(intent);
    }
    public void Clothing (View view) {
        Intent intent = new Intent(Masuk.this, Clothing.class);
        startActivity(intent);
    }
    public void Toys (View view) {
        Intent intent = new Intent(Masuk.this, Toy.class);
        startActivity(intent);
    }
    public void ContactUs (View view) {
        Intent intent = new Intent(Masuk.this, ContactUs.class);
        startActivity(intent);
    }
}
