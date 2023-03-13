package com.example.fouractivities.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fouractivities.R;

public class SecondActivity extends AppCompatActivity {
    private AppCompatButton buttonNavigation;
    private EditText editTextSurname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        buttonNavigation = findViewById(R.id.buttonView);
        editTextSurname = (EditText) findViewById(R.id.editTextSurname);

        buttonNavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!editTextSurname.getText().toString().isEmpty()) {
                    String surname = editTextSurname.getText().toString();

                    Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);

                    String nameSurname=getIntent().getStringExtra("name_key")+" "+surname;

                    intent.putExtra("surname_key", nameSurname);

                    startActivity(intent);
                } else {
                    Toast.makeText(SecondActivity.this, "Please Enter Your Surname", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}