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

public class balok1 extends AppCompatActivity {

    private EditText editTextPanjang, editTextLebar, editTextTinggi;
    private Button buttonHitung;
    private TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok2);

        editTextPanjang = findViewById(R.id.editTextPanjang);
        editTextLebar = findViewById(R.id.editTextLebar);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungBalok();
            }
        });
    }

    private void hitungBalok() {
        double panjang = Double.parseDouble(editTextPanjang.getText().toString());
        double lebar = Double.parseDouble(editTextLebar.getText().toString());
        double tinggi = Double.parseDouble(editTextTinggi.getText().toString());

        // Menghitung volume balok
        double volume = panjang * lebar * tinggi;

        // Menghitung luas permukaan balok
        double luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));

        // Menampilkan hasil volume dan luas permukaan balok di TextView
        textViewHasil.setText("Volume: " + volume + "\nLuas Permukaan: " + luasPermukaan);
    }
}