package com.example.cafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText;
    private EditText passwordEditText;
    private Button buttonSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = nameEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();
                if (userName.isEmpty() || password.isEmpty()) {
                    Toast.makeText(
                            MainActivity.this,
                            getString(R.string.error_field_is_empty),
                            Toast.LENGTH_SHORT
                    ).show();
                } else {
                    launchScreen(userName);
                }

            }
        });
    }

    private void initViews() {
        nameEditText = findViewById(R.id.nameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        buttonSignIn = findViewById(R.id.enterButton);

    }

    private void launchScreen(String userName) {
        Intent intent = new Intent(MainActivity.this, MakeOrderActivity.class);
        intent.putExtra("userName", userName);
        startActivity(intent);
    }
}