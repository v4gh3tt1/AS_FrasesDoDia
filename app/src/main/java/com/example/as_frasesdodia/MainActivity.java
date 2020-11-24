package com.example.as_frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String [] frases = {
                "frase1",
                "frase2",
                "frase3",
                "frase4" // nao precisa virgula no ultimo item
        };

        int numero = new Random().nextInt(4); // gera numeros aleatorios de 0 a 4

        TextView texto = findViewById(R.id.textResultado); // atribui resultado ao TextView id 'textResultado'
        texto.setText(frases[numero]); // indice aleatorio do array 'frases[]' exibido no TextView

    }

}
