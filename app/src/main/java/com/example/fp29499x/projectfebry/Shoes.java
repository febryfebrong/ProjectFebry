package com.example.fp29499x.projectfebry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class Shoes extends AppCompatActivity {
    int quantity = 0;
    int price = 13;
    int totalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoes);
    }
    public void plus(View view){
        quantity = quantity + 1;
        totalPrice = price * quantity;
        display(quantity);
        displayPrice(totalPrice);
    }

    public void minus(View view){
        quantity = quantity - 1;
        if(quantity < 0){
            quantity = 0;
        }
        totalPrice = price * quantity;
        display(quantity);
        displayPrice(totalPrice);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("Total" + " " + NumberFormat.getCurrencyInstance().format(number));
    }
    public void purchase (View view) {
        Intent intent = new Intent(Shoes.this, Shopping.class);
        startActivity(intent);
    }
}
