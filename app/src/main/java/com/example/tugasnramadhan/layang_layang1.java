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

public class layang_layang1 extends AppCompatActivity {


    private EditText editTextDiagonal1, editTextDiagonal2;
    private TextView textViewLuas, textViewKeliling;
    private Button buttonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layang_layang1);

        editTextDiagonal1 = findViewById(R.id.editTextDiagonal1);
        editTextDiagonal2 = findViewById(R.id.editTextDiagonal2);
        textViewLuas = findViewById(R.id.textViewLuas);
        textViewKeliling = findViewById(R.id.textViewKeliling);
        buttonHitung = findViewById(R.id.buttonHitung);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLayangLayang();
            }
        });
    }

    private void hitungLayangLayang() {
        String diagonal1Str = editTextDiagonal1.getText().toString();
        String diagonal2Str = editTextDiagonal2.getText().toString();

        if (!diagonal1Str.isEmpty() && !diagonal2Str.isEmpty()) {
            float diagonal1 = Float.parseFloat(diagonal1Str);
            float diagonal2 = Float.parseFloat(diagonal2Str);

            float luas = (diagonal1 * diagonal2) / 2;
            textViewLuas.setText("Luas: " + luas);

            float keliling = 2 * (diagonal1 + diagonal2);
            textViewKeliling.setText("Keliling: " + keliling);
        } else {
            Toast.makeText(this, "Masukkan nilai diagonal 1 dan diagonal 2!", Toast.LENGTH_SHORT).show();
        }
    }
}