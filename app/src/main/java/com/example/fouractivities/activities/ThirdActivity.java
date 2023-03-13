package com.example.fouractivities.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fouractivities.R;

public class ThirdActivity extends AppCompatActivity {
    private AppCompatButton buttonNavigation;
    private EditText editTextAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        buttonNavigation = findViewById(R.id.buttonView);
        editTextAge = (EditText) findViewById(R.id.editTextAge);


        buttonNavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!editTextAge.getText().toString().isEmpty()) {
                    String age = editTextAge.getText().toString();

                    Intent intent = new Intent(ThirdActivity.this, FourthActivity.class);

                    String nameSurnameAge = getIntent().getStringExtra("surname_key")+", " + age;

                    intent.putExtra("age_key", nameSurnameAge);

                    startActivity(intent);
                } else {
                    Toast.makeText(ThirdActivity.this, "Please Enter Your Age", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}