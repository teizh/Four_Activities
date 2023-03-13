package com.example.fouractivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fouractivities.activities.FirstActivity;

public class MainActivity extends AppCompatActivity {
    private AppCompatButton buttonNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNavigation = findViewById(R.id.buttonView);


        buttonNavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, FirstActivity.class);
                finishAffinity();
                startActivity(intent);

            }
        });
    }
}