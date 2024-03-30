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

public class silinder1 extends AppCompatActivity {

    private EditText editTextJariJari, editTextTinggi;
    private Button buttonHitung;
    private TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silinder1);

        editTextJariJari = findViewById(R.id.editTextJariJari);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungSilinder();
            }
        });
    }

    private void hitungSilinder() {
        double jariJari = Double.parseDouble(editTextJariJari.getText().toString());
        double tinggi = Double.parseDouble(editTextTinggi.getText().toString());

        double volume = Math.PI * Math.pow(jariJari, 2) * tinggi;

        double luasPermukaan = (2 * Math.PI * jariJari * tinggi) + (2 * Math.PI * Math.pow(jariJari, 2));

        textViewHasil.setText("Volume: " + volume + "\nLuas Permukaan: " + luasPermukaan);
    }
}