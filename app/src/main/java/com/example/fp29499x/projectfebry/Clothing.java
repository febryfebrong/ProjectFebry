package com.example.fp29499x.projectfebry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Clothing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothing);
    }
    public void disney (View view) {
        Intent intent = new Intent(Clothing.this, Disney.class);
        startActivity(intent);
    }
    public void superhero (View view) {
        Intent intent = new Intent(Clothing.this, Superhero.class);
        startActivity(intent);
    }
    public void animal (View view) {
        Intent intent = new Intent(Clothing.this, Animal.class);
        startActivity(intent);
    }
    public void singer (View view) {
        Intent intent = new Intent(Clothing.this, Singer.class);
        startActivity(intent);
    }
    public void sleeping (View view) {
        Intent intent = new Intent(Clothing.this, Sleeping.class);
        startActivity(intent);
    }
    public void party (View view) {
        Intent intent = new Intent(Clothing.this, Party.class);
        startActivity(intent);
    }
}
