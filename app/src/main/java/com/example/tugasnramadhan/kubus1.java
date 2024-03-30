






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

public class kubus1 extends AppCompatActivity {


    private EditText editTextSisi;
    private Button buttonHitung;
    private TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus1);

        editTextSisi = findViewById(R.id.editTextSisi);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungKubus();
            }
        });
    }

    private void hitungKubus() {
        double sisi = Double.parseDouble(editTextSisi.getText().toString());

        double volume = sisi * sisi * sisi;

        double luasPermukaan = 6 * sisi * sisi;

        textViewHasil.setText("Volume: " + volume + "\nLuas Permukaan: " + luasPermukaan);
    }
}