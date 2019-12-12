package com.example.tablelayaut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnuno, btndos, btntres, btncuatro,btncinco,btnseis,btnsiete,btnocho,btnnueve,btncero,btnsum,btnres,btnmul,btndiv,btnigu;
    TextView btnresul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btncero = (Button)findViewById(R.id.btn0);
        btnuno= (Button)findViewById(R.id.btn1);
        btndos  = (Button)findViewById(R.id.btn2);
        btntres = (Button)findViewById(R.id.btn3);
        btncuatro = (Button)findViewById(R.id.btn4);
        btncinco = (Button)findViewById(R.id.btn5);
        btnseis = (Button)findViewById(R.id.btn6);
        btnsiete = (Button)findViewById(R.id.btn7);
        btnocho = (Button)findViewById(R.id.btn8);
        btnnueve = (Button)findViewById(R.id.btn8);
        btnsum = (Button)findViewById(R.id.btnsuma);
        btnres = (Button)findViewById(R.id.btnresta);
        btnmul = (Button)findViewById(R.id.btnmulti);
        btndiv = (Button)findViewById(R.id.btndiv);
        btnigu = (Button)findViewById(R.id.btnigual);

    }
}
