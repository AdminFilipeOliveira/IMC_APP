package com.filipe.imc_app;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView idResultado;
    private EditText idPeso;
    private EditText idAltura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idResultado = findViewById(R.id.idResultado);
        idPeso = findViewById(R.id.idPeso);
        idAltura = findViewById(R.id.idAltura);

    }

    public void imc_app(View view) {

        double peso = Double.parseDouble(idPeso.getText().toString());
        double altura = Double.parseDouble(idAltura.getText().toString());
        double resultado = peso / (altura * altura);

        if (resultado < 18.5) {

            idResultado.setText("Abaixo do peso");

        } else if (resultado <= 18.6 || resultado < 24.9) {
            idResultado.setText("Peso Ideal(Parabéns)");

        } else if (resultado <= 25 || resultado < 29.9) {
            idResultado.setText("Sobrepeso,");

        } else if (resultado <= 30.0 || resultado < 34.9) {
            idResultado.setText("Obesidade tipo I");

        } else if (resultado <= 35.0 || resultado < 39.9) {
            idResultado.setText("Obesidade tipo II(severa)");

        } else if (resultado >= 40) {
            idResultado.setText("Obesidade tipo III(mórbida)");
        }
    }
}