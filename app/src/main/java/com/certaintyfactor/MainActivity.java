package com.certaintyfactor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.ib_penyakit).setOnClickListener(v -> startActivity(
                new Intent(MainActivity.this, Penyakit.class)));

        findViewById(R.id.ib_gejala).setOnClickListener(v -> startActivity(
                new Intent(MainActivity.this, Gejala.class)));

        findViewById(R.id.ib_diagnosa).setOnClickListener(v -> startActivity(
                new Intent(MainActivity.this, Diagnosa.class)));

        findViewById(R.id.ib_informasi).setOnClickListener(v -> startActivity(
                new Intent(MainActivity.this, Informasi.class)));
    }
}