package com.calculadora.auditore.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button[] numeros;
    Button suma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numeros[0] = (Button) findViewById(R.id.cero);
        numeros[1] = (Button) findViewById(R.id.uno);
        numeros[2] = (Button) findViewById(R.id.dos);
        numeros[3] = (Button) findViewById(R.id.tres);
        numeros[4] = (Button) findViewById(R.id.cuatro);
        numeros[5] = (Button) findViewById(R.id.cinco);
        numeros[6] = (Button) findViewById(R.id.seis);
        numeros[7] = (Button) findViewById(R.id.siete);
        numeros[8] = (Button) findViewById(R.id.ocho);
        numeros[9] = (Button) findViewById(R.id.nueve);

        suma = (Button) findViewById(R.id.mas);

    }
}
