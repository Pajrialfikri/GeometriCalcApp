package com.example.tugasnramadhan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class persegi1 extends AppCompatActivity {

    private EditText editTextPanjangSisi;
    private TextView textViewLuas, textViewKeliling;
    private Button buttonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi1);

        editTextPanjangSisi = findViewById(R.id.editTextPanjangSisi);
        textViewLuas = findViewById(R.id.textViewLuas);
        textViewKeliling = findViewById(R.id.textViewKeliling);
        buttonHitung = findViewById(R.id.buttonHitung);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungPersegi();
            }
        });
    }

    private void hitungPersegi() {
        String panjangSisiStr = editTextPanjangSisi.getText().toString();

        if (!panjangSisiStr.isEmpty()) {
            float panjangSisi = Float.parseFloat(panjangSisiStr);
            float luas = panjangSisi * panjangSisi;
            textViewLuas.setText("Luas: " + luas);
            float keliling = 4 * panjangSisi;
            textViewKeliling.setText("Keliling: " + keliling);
        } else {
            Toast.makeText(this, "Masukkan panjang sisi!", Toast.LENGTH_SHORT).show();
        }
    }
}