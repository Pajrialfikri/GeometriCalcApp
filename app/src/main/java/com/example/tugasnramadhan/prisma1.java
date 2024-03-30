package com.example.tugasnramadhan;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class prisma1 extends AppCompatActivity {

    private EditText editTextAlas, editTextTinggiSegitiga, editTextTinggiPrisma;
    private Button buttonHitung;
    private TextView textViewHasil;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prisma1);

        editTextAlas = findViewById(R.id.editTextAlas);
        editTextTinggiSegitiga = findViewById(R.id.editTextTinggiSegitiga);
        editTextTinggiPrisma = findViewById(R.id.editTextTinggiPrisma);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungPrisma();
            }
        });
    }

    private void hitungPrisma() {
        double alas = Double.parseDouble(editTextAlas.getText().toString());
        double tinggiSegitiga = Double.parseDouble(editTextTinggiSegitiga.getText().toString());
        double tinggiPrisma = Double.parseDouble(editTextTinggiPrisma.getText().toString());

        double luasAlasSegitiga = 0.5 * alas * tinggiSegitiga;
        double volume = luasAlasSegitiga * tinggiPrisma;
        double luasPermukaan = (2 * luasAlasSegitiga) + (3 * alas * tinggiPrisma);
        textViewHasil.setText("Volume: " + volume + "\nLuas Permukaan: " + luasPermukaan);
    }
}