package com.example.fp29499x.projectfebry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Toy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toy);
    }

    public void rope(View view) {
        Intent intent = new Intent(Toy.this, Rope.class);
        startActivity(intent);
    }

    public void doll(View view) {
        Intent intent = new Intent(Toy.this, Doll.class);
        startActivity(intent);
    }

    public void ball(View view) {
        Intent intent = new Intent(Toy.this, Ball.class);
        startActivity(intent);
    }
}
