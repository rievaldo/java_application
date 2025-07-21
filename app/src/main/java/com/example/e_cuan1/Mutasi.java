package com.example.e_cuan1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class Mutasi extends AppCompatActivity {

    Button mutasiButton;
    Button redeemButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mutasi_activity);

        // Inisialisasi tombol
        mutasiButton = findViewById(R.id.mutasi_button);
        redeemButton = findViewById(R.id.redeem_button);

        // Tambahkan listener tombol Mutasi
        mutasiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi saat tombol Mutasi ditekan
                // Contoh: Pindah ke halaman MutasiDetail
                Intent intent = new Intent(Mutasi.this, Mutasi.class);
                startActivity(intent);
            }
        });

        // Tambahkan listener tombol Redeem
        redeemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi saat tombol Redeem ditekan
                Intent intent = new Intent(Mutasi.this, Redeem.class);
                startActivity(intent);
            }
        });
    }
}
