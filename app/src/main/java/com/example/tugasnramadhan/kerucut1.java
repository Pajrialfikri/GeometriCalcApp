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

public class kerucut1 extends AppCompatActivity {

    private EditText editTextJariJari, editTextTinggi;
    private Button buttonHitung;
    private TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerucut1);

        editTextJariJari = findViewById(R.id.editTextJariJari);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungKerucut();
            }
        });
    }

    private void hitungKerucut() {
        double jariJari = Double.parseDouble(editTextJariJari.getText().toString());
        double tinggi = Double.parseDouble(editTextTinggi.getText().toString());

        // Menghitung volume kerucut
        double volume = (1.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;

        // Menghitung luas permukaan kerucut
        double luasPermukaan = Math.PI * jariJari * (jariJari + Math.sqrt(Math.pow(tinggi, 2) + Math.pow(jariJari, 2)));

        // Menampilkan hasil volume dan luas permukaan kerucut di TextView
        textViewHasil.setText("Volume: " + volume + "\nLuas Permukaan: " + luasPermukaan);
    }
}