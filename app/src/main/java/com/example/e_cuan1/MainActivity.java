package com.example.e_cuan1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button startButton;
    CheckBox agreementCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi views
        startButton = findViewById(R.id.start_button);
        agreementCheckbox = findViewById(R.id.agreement_text);

        // Disable button awalnya
        startButton.setEnabled(false);

        // Aktifkan tombol hanya jika checkbox dicentang
        agreementCheckbox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            startButton.setEnabled(isChecked);
        });

        // Set action tombol Mulai
        startButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, dashboard.class);
            startActivity(intent);
        });
    }
}
