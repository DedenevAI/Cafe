package com.example.cafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class OrderDetailActivity extends AppCompatActivity {
    public static final String EXTRA_USER_USERNAME = "userName";
    public static final String EXTRA_USER_DRINK = "drink";
    public static final String EXTRA_USER_ADDITIVES = "additives";
    public static final String EXTRA_USER_DRINK_TYPE = "drinkType";
    private TextView textViewName;
    private TextView textViewDrink;
    private TextView textViewDrinkType;
    private TextView textViewAdditives;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_detail);
        initViews();

        setUpValues();
    }

    public static Intent newIntent(Context context,
                                   String userName,
                                   String drink,
                                   String additives,
                                   String drinkType) {
        Intent intent = new Intent(context, OrderDetailActivity.class);
        intent.putExtra(EXTRA_USER_USERNAME, userName);
        intent.putExtra(EXTRA_USER_DRINK, drink);
        intent.putExtra(EXTRA_USER_ADDITIVES, additives);
        intent.putExtra(EXTRA_USER_DRINK_TYPE, drinkType);
        return intent;
    }

    private void initViews() {
        textViewName = findViewById(R.id.textViewName);
        textViewDrink = findViewById(R.id.textViewDrink);
        textViewDrinkType = findViewById(R.id.textViewDrinkType);
        textViewAdditives = findViewById(R.id.textViewAdditives);
    }

    private void setUpValues() {
        Intent intent = getIntent();
        textViewName.setText(intent.getStringExtra(EXTRA_USER_USERNAME));
        textViewDrink.setText(intent.getStringExtra(EXTRA_USER_DRINK));
        textViewDrinkType.setText(intent.getStringExtra(EXTRA_USER_DRINK_TYPE));
        textViewAdditives.setText(intent.getStringExtra(EXTRA_USER_ADDITIVES));
    }
}
