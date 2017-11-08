package com.example.thali.aula14;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements Serializable  {

    Button btn1;
    EditText editAltura;
    EditText editPeso;
    TextView textResultado;
    RadioButton rdM;
    RadioButton rdF;
    RadioGroup radioG;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button);
        editPeso = (EditText) findViewById(R.id.editPeso);
        editAltura = (EditText) findViewById(R.id.editAltura);
        textResultado = (TextView) findViewById(R.id.textView7);
        rdF = (RadioButton) findViewById(R.id.rdF);
        rdM = (RadioButton) findViewById(R.id.rdM);
        radioG = (RadioGroup) findViewById(R.id.radioGroup);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double peso;
                double altura;
                double imc;
                if(rdF.isChecked() || rdM.isChecked()){
                    peso = Double.parseDouble(editPeso.getText().toString());
                    altura = Double.parseDouble(editAltura.getText().toString());
                    imc = peso /(altura * altura);
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    Bundle  bundle = new Bundle();
                    bundle.putDouble("key",imc);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this,"Clica na merda do Radion",Toast.LENGTH_LONG).show();
                }

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
