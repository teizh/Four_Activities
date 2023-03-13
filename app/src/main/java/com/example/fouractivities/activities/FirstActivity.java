package com.example.fouractivities.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fouractivities.MainActivity;
import com.example.fouractivities.R;

public class FirstActivity extends AppCompatActivity {

    private AppCompatButton buttonNavigation;
    private EditText editTextName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        buttonNavigation = findViewById(R.id.buttonView);
        editTextName = (EditText) findViewById(R.id.editTextName);

        buttonNavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!editTextName.getText().toString().isEmpty()) {
                    String name = editTextName.getText().toString();

                    Intent intent = new Intent(FirstActivity.this, SecondActivity.class);

                    intent.putExtra("name_key", name);

                    startActivity(intent);
                } else {
                    Toast.makeText(FirstActivity.this, "Please Enter Your Name", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}