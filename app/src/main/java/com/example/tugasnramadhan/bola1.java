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

public class bola1 extends AppCompatActivity {

    private EditText editTextJariJari;
    private Button buttonHitung;
    private TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola1);

        editTextJariJari = findViewById(R.id.editTextJariJari);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungBola();
            }
        });
    }

    private void hitungBola() {
        double jariJari = Double.parseDouble(editTextJariJari.getText().toString());

        // Menghitung volume bola
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);

        // Menghitung luas permukaan bola
        double luasPermukaan = 4 * Math.PI * Math.pow(jariJari, 2);

        // Menampilkan hasil volume dan luas permukaan bola di TextView
        textViewHasil.setText("Volume: " + volume + "\nLuas Permukaan: " + luasPermukaan);
    }
}