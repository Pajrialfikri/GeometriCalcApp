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

import com.example.tugasnramadhan.R;

public class PersegiPanjang extends AppCompatActivity {

    private EditText editTextLength;
    private EditText editTextWidth;
    private Button buttonCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_persegi_panjang);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editTextLength = findViewById(R.id.editTextLength);
        editTextWidth = findViewById(R.id.editTextWidth);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateArea();
            }
        });
    }

    private void calculateArea() {
        String lengthStr = editTextLength.getText().toString();
        String widthStr = editTextWidth.getText().toString();

        if (!lengthStr.isEmpty() && !widthStr.isEmpty()) {
            double length = Double.parseDouble(lengthStr);
            double width = Double.parseDouble(widthStr);
            double area = length * width;
            textViewResult.setText("Luas: " + area);
        } else {
            textViewResult.setText("Mohon masukkan panjang dan lebar yang valid.");
        }
    }
}