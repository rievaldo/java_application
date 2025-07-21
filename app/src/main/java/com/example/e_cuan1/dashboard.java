package com.example.e_cuan1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class dashboard extends AppCompatActivity {
    Button reedemButton;
    Button mutasiButton;
    Button strukButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard);

        mutasiButton = findViewById(R.id.mutasi_button);
        strukButton = findViewById(R.id.tukar_poin_button);
        reedemButton = findViewById(R.id.redeem_button);

        reedemButton.setOnClickListener(v ->{
         Intent intent = new Intent(dashboard.this, Redeem.class);
         startActivity(intent);
        });

        mutasiButton.setOnClickListener(v ->{
            Intent intent = new Intent(dashboard.this, Mutasi.class);
            startActivity(intent);
        });

        strukButton.setOnClickListener(v ->{
            Intent intent = new Intent(dashboard.this, Struk.class);
            startActivity(intent);
        });


        // Pastikan root layout punya id "main"
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
