package com.example.e_cuan1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class UploadSuccess extends AppCompatActivity {
    Button completeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upload);

        completeButton = findViewById(R.id.btnSelesai);

        completeButton.setOnClickListener(view ->{
           Intent intent = new Intent(UploadSuccess.this, dashboard.class);
           startActivity(intent);
        });
    }
}
