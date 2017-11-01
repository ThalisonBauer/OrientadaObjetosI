package com.example.thali.aula14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    EditText editAltura;
    EditText editPeso;
    TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button);
        editPeso = (EditText) findViewById(R.id.editPeso);
        editAltura = (EditText) findViewById(R.id.editAltura);
        textResultado = (TextView) findViewById(R.id.textView7);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double peso;
                double altura;
                double imc;
                peso = Double.parseDouble(editPeso.getText().toString());
                altura = Double.parseDouble(editAltura.getText().toString());
                imc = peso /(altura * altura);
                textResultado.setText("O resultado é :"+imc);
            }
        });
    }
        @Override
        protected void onStart(){
            super.onStart();
            Log.i("AULA14","START");
        }
        @Override
        protected void onDestroy(){
            super.onDestroy();
            Log.i("AULA14","DESTROY");
        }
        @Override
        protected void onPause(){
            super.onPause();
            Log.i("AULA14","PAUSE");
        }

}
