package com.example.fp29499x.projectfebry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class ContactUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
    }
    public void Submit (View view) {
        Intent intent = new Intent(ContactUs.this, Thanks.class);
        startActivity(intent);
    }
}
