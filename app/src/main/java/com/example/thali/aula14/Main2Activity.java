package com.example.thali.aula14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

public class Main2Activity extends AppCompatActivity implements Serializable {
    TextView txView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txView = (TextView) findViewById(R.id.txView);
        String imc =   this.getIntent().getSerializableExtra("key").toString();
        txView.setText("Seu imc é:"+imc);
    }
}
