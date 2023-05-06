package com.example.cafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class OrderDetailActivity extends AppCompatActivity {
    public static final String EXTRA_USER_USERNAME = "userName";
    public static final String EXTRA_USER_DRINK = "drink";
    public static final String EXTRA_USER_ADDITIVES = "additives";
    public static final String EXTRA_USER_DRINK_TYPE = "userName";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_detail);
    }

    public static Intent newIntent(Context context,
                                   String userName,
                                   String drink,
                                   String additives,
                                   String drinkType) {
        Intent intent = new Intent(context, OrderDetailActivity.class);
        intent.putExtra(EXTRA_USER_USERNAME, userName);
        intent.putExtra(EXTRA_USER_DRINK, drink);
        intent.putExtra(EXTRA_USER_DRINK, additives);
        intent.putExtra(EXTRA_USER_DRINK_TYPE, drinkType);
        return intent;
    }
}
