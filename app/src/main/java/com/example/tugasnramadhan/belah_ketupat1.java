package com.example.tugasnramadhan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class belah_ketupat1 extends AppCompatActivity {

    private EditText editTextDiagonal1, editTextDiagonal2;
    private TextView textViewLuas, textViewKeliling;
    private Button buttonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belah_ketupat1);

        editTextDiagonal1 = findViewById(R.id.editTextDiagonal1);
        editTextDiagonal2 = findViewById(R.id.editTextDiagonal2);
        textViewLuas = findViewById(R.id.textViewLuas);
        textViewKeliling = findViewById(R.id.textViewKeliling);
        buttonHitung = findViewById(R.id.buttonHitung);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungBelahKetupat();
            }
        });
    }

    private void hitungBelahKetupat() {
        // Mendapatkan nilai diagonal 1 dan diagonal 2 dari EditText
        String diagonal1Str = editTextDiagonal1.getText().toString();
        String diagonal2Str = editTextDiagonal2.getText().toString();

        // Memeriksa apakah input diagonal 1 dan diagonal 2 tidak kosong
        if (!diagonal1Str.isEmpty() && !diagonal2Str.isEmpty()) {
            // Mengonversi nilai diagonal 1 dan diagonal 2 menjadi float
            float diagonal1 = Float.parseFloat(diagonal1Str);
            float diagonal2 = Float.parseFloat(diagonal2Str);

            // Menghitung luas belah ketupat
            float luas = (diagonal1 * diagonal2) / 2;
            // Menampilkan hasil luas ke dalam TextView
            textViewLuas.setText("Luas: " + luas);

            // Menghitung keliling belah ketupat (sama dengan 4 * sisi)
            float keliling = 4 * (float) Math.sqrt(((diagonal1 / 2) * (diagonal1 / 2)) + ((diagonal2 / 2) * (diagonal2 / 2)));
            // Menampilkan hasil keliling ke dalam TextView
            textViewKeliling.setText("Keliling: " + keliling);
        } else {
            // Jika input diagonal 1 atau diagonal 2 kosong, tampilkan pesan kesalahan
            Toast.makeText(this, "Masukkan nilai diagonal 1 dan diagonal 2!", Toast.LENGTH_SHORT).show();
        }
    }
}
