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

public class segitiga1 extends AppCompatActivity {

    private EditText editTextAlas, editTextTinggi;
    private Button buttonHitungLuas, buttonHitungKeliling;
    private TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga1);

        editTextAlas = findViewById(R.id.editTextAlas);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        buttonHitungLuas = findViewById(R.id.buttonHitungLuas);
        buttonHitungKeliling = findViewById(R.id.buttonHitungKeliling);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitungLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasSegitiga();
            }
        });

        buttonHitungKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungKelilingSegitiga();
            }
        });
    }

    private void hitungLuasSegitiga() {
        double alas = Double.parseDouble(editTextAlas.getText().toString());
        double tinggi = Double.parseDouble(editTextTinggi.getText().toString());
        double luas = 0.5 * alas * tinggi;
        textViewHasil.setText("Luas: " + luas);
    }

    private void hitungKelilingSegitiga() {
        double alas = Double.parseDouble(editTextAlas.getText().toString());
        double tinggi = Double.parseDouble(editTextTinggi.getText().toString());
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        double keliling = alas + tinggi + sisiMiring;
        textViewHasil.setText("Keliling: " + keliling);
    }
}