package com.example.fp29499x.projectfebry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

public class Accesories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accesories);
    }

    public void collar(View view) {
        Intent intent = new Intent(Accesories.this, Collar.class);
        startActivity(intent);
    }

    public void shoes(View view) {
        Intent intent = new Intent(Accesories.this, Shoes.class);
        startActivity(intent);
    }

    public void dogbed(View view) {
        Intent intent = new Intent(Accesories.this, Dogbed.class);
        startActivity(intent);

    }
}