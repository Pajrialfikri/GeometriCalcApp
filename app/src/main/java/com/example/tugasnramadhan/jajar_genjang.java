package com.example.tugasnramadhan;

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

public class jajar_genjang extends AppCompatActivity {

    private EditText editTextAlas, editTextTinggi, editTextSisi;
    private Button buttonHitung;
    private TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajar_genjang);

        editTextAlas = findViewById(R.id.editTextAlas);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        editTextSisi = findViewById(R.id.editTextSisi);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungJajarGenjang();
            }
        });
    }

    private void hitungJajarGenjang() {
        double alas = Double.parseDouble(editTextAlas.getText().toString());
        double tinggi = Double.parseDouble(editTextTinggi.getText().toString());
        double sisi = Double.parseDouble(editTextSisi.getText().toString());

        double luas = alas * tinggi;
        double keliling = 2 * (alas + sisi);

        textViewHasil.setText("Luas: " + luas + "\nKeliling: " + keliling);
    }
}