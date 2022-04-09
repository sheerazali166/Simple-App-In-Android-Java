package com.example.simple_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        Intent intent = getIntent();

        String message = intent.getStringExtra("message");

        TextView textViewDisplay = findViewById(R.id.message);

        textViewDisplay.setText(message);
    }

    public void go_to_final_activity(View view) {

        startActivity(new Intent(this, FinalActivity.class));
    }
}