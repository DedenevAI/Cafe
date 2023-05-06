package com.example.cafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private final EditText nameEditText = findViewById(R.id.nameEditText);
    private final EditText passwordEditText = findViewById(R.id.passwordEditText);
    private final String userName = nameEditText.getText().toString();
    private final Button buttonSignIn = findViewById(R.id.enterButton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchScreen(userName);
            }
        });
    }
    private void launchScreen(String userName){
        Intent intent = new Intent(MainActivity.this, MakeOrderActivity.class);
        intent.putExtra("userName",userName);
        startActivity(intent);
    }
}