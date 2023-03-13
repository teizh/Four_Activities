package com.example.fouractivities.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.fouractivities.MainActivity;
import com.example.fouractivities.R;
public class FourthActivity extends AppCompatActivity {
    private View textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        TextView textview = findViewById(R.id.TextView);
        textview.setText(getIntent().getStringExtra("age_key"));


        findViewById(R.id.ClearAll).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FourthActivity.this, MainActivity.class);
                finishAffinity();
                System.exit(0);
                startActivity(intent);
            }
        });
    }

}