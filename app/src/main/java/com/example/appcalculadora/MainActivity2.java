package com.example.appcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button sum, res, multi, divi, limp, igual;
    TextView resultado;
    String op, num , acum;
    double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = (Button) findViewById(R.id.cero);
        b1 = (Button) findViewById(R.id.uno);
        b2 = (Button) findViewById(R.id.dos);
        b3 = (Button) findViewById(R.id.tres);
        b4 = (Button) findViewById(R.id.cuatro);
        b5 = (Button) findViewById(R.id.cinco);
        b6 = (Button) findViewById(R.id.seis);
        b7 = (Button) findViewById(R.id.siete);
        b8 = (Button) findViewById(R.id.ocho);
        b9 = (Button) findViewById(R.id.nueve);
        sum = (Button) findViewById(R.id.suma);
        res = (Button) findViewById(R.id.resta);
        multi = (Button) findViewById(R.id.multiplicacion);
        divi = (Button) findViewById(R.id.divicion);
        limp = (Button) findViewById(R.id.limpiar);
        igual = (Button) findViewById(R.id.igual);
        resultado = (TextView) findViewById(R.id.valortxt);

        b0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num = resultado.getText().toString();
                num = num + "0";
                resultado.setText(num);
            }
        });

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num = resultado.getText().toString();
                num = num + "1";
                resultado.setText(num);
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num = resultado.getText().toString();
                num = num + "2";
                resultado.setText(num);
            }
        });

        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num = resultado.getText().toString();
                num = num + "3";
                resultado.setText(num);
            }
        });

        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num = resultado.getText().toString();
                num = num + "4";
                resultado.setText(num);
            }
        });

        b5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num = resultado.getText().toString();
                num = num + "5";
                resultado.setText(num);
            }
        });

        b6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num = resultado.getText().toString();
                num = num + "6";
                resultado.setText(num);
            }
        });

        b7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num = resultado.getText().toString();
                num = num + "7";
                resultado.setText(num);
            }
        });

        b8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num = resultado.getText().toString();
                num = num + "8";
                resultado.setText(num);
            }
        });

        b9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num = resultado.getText().toString();
                num = num + "9";
                resultado.setText(num);
            }
        });

        sum.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                acum = resultado.getText().toString();
                op = "+";
                resultado.setText("");
            }
        });

        res.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                acum = resultado.getText().toString();
                op = "-";
                resultado.setText("");
            }
        });

        multi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                acum = resultado.getText().toString();
                op = "*";
                resultado.setText("");
            }
        });

        divi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                acum = resultado.getText().toString();
                op = "/";
                resultado.setText("");
            }
        });

        limp.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num = "";
                resultado.setText(num);
                acum = "";
                op = "";
            }
        });

        igual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num = resultado.getText().toString();
                num = num + "1";
                if(op.equals("-")){
                    total = Double.parseDouble(acum) - Double.parseDouble(resultado.getText().toString());
                    resultado.setText(String.valueOf(total));
                }
                if(op.equals("+")){
                    total = Double.parseDouble(acum) + Double.parseDouble(resultado.getText().toString());
                    resultado.setText(String.valueOf(total));
                }
                if(op.equals("/")){
                    total = Double.parseDouble(acum) / Double.parseDouble(resultado.getText().toString());
                    resultado.setText(String.valueOf(total));
                }
                if(op.equals("*")){
                    total = Double.parseDouble(acum) * Double.parseDouble(resultado.getText().toString());
                    resultado.setText(String.valueOf(total));
                }
            }
        });

    }
}