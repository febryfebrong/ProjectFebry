package com.example.fp29499x.projectfebry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import java.text.NumberFormat;


public class Food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
    }
    public void pedigree (View view) {
        Intent intent = new Intent(Food.this, Pedigree.class);
        startActivity(intent);
    }
    public void royal (View view) {
        Intent intent = new Intent(Food.this, Royal.class);
        startActivity(intent);
    }
    public void purina (View view) {
        Intent intent = new Intent(Food.this, Purina.class);
        startActivity(intent);
    }
    public void iams (View view) {
        Intent intent = new Intent(Food.this, Iams.class);
        startActivity(intent);
    }
    public void cesar (View view) {
        Intent intent = new Intent(Food.this, Cesar.class);
        startActivity(intent);
    }
    public void eukanoba (View view) {
        Intent intent = new Intent(Food.this, Eukanoba.class);
        startActivity(intent);
    }
}
