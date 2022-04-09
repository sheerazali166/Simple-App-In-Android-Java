package com.example.simple_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send_message(View view) {

        EditText editTextMssage = findViewById(R.id.user_message);

        String message = editTextMssage.getText().toString();

        Intent intent = new Intent(MainActivity.this, MessageActivity.class);

        intent.putExtra("message", message);

        startActivity(intent);
    }
}