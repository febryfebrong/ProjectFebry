package com.example.fp29499x.projectfebry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }
    public void Masuk (View view) {
        Intent intent = new Intent(Welcome.this, Masuk.class);
        startActivity(intent);
    }

}

