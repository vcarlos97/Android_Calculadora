package edu.upc.dsa.primeraapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double operacion1;
    double operacion2;
    double result;
    int ig=0;
    int suma=0;
    int resta=0;
    int multiplicacion=0;
    int division=0;
    boolean inicio;
    String operacion="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        final TextView pantalla = findViewById((R.id.pantalla));
        final Button button1 = findViewById(R.id.button1);
        final Button button2 = findViewById(R.id.button2);
        final Button button3 = findViewById(R.id.button3);
        final Button button4 = findViewById(R.id.button4);
        final Button button5 = findViewById(R.id.button5);
        final Button button6 = findViewById(R.id.button6);
        final Button button7 = findViewById(R.id.button7);
        final Button button8 = findViewById(R.id.button8);
        final Button button9 = findViewById(R.id.button9);
        final Button button0 = findViewById(R.id.button0);
        final Button igual = findViewById(R.id.igual);
        final Button suma = findViewById(R.id.suma);
        final Button resta = findViewById(R.id.resta);
        final Button multiplicacion = findViewById(R.id.multiplicacion);
        final Button delete = findViewById(R.id.delete);
        final Button division = findViewById(R.id.division);
        final Button punto = findViewById(R.id.punto);
        final Button seno = findViewById(R.id.seno);
        final Button coseno = findViewById(R.id.coseno);
        final Button tangente = findViewById(R.id.tangente);
        final Button grados= findViewById(R.id.grados);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inicio) {
                    pantalla.setText(pantalla.getText().toString() + button0.getText().toString());
                } else {
                    pantalla.setText(button0.getText().toString());
                    inicio = true;
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button bt = (Button)v;
                if(inicio)
                {
                    pantalla.setText(pantalla.getText().toString() + button1.getText().toString());
                }
                else
                {
                    pantalla.setText(button1.getText().toString());
                    inicio=true;
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inicio)
                {
                    pantalla.setText(pantalla.getText().toString() + button2.getText().toString());
                }
                else
                {
                    pantalla.setText(button2.getText().toString());
                    inicio=true;
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(inicio)
                {
                    pantalla.setText(pantalla.getText().toString() + button3.getText().toString());
                }
                else
                {
                    pantalla.setText(button3.getText().toString());
                    inicio=true;
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(inicio)
                {
                    pantalla.setText(pantalla.getText().toString() + button4.getText().toString());
                }
                else
                {
                    pantalla.setText(button4.getText().toString());
                    inicio=true;
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(inicio)
                {
                    pantalla.setText(pantalla.getText().toString() + button5.getText().toString());
                }
                else
                {
                    pantalla.setText(button5.getText().toString());
                    inicio=true;
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inicio)
                {
                    pantalla.setText(pantalla.getText().toString() + button6.getText().toString());
                }
                else
                {
                    pantalla.setText(button6.getText().toString());
                    inicio=true;
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inicio)
                {
                    pantalla.setText(pantalla.getText().toString() + button7.getText().toString());
                }
                else
                {
                    pantalla.setText(button7.getText().toString());
                    inicio=true;
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inicio)
                {
                    pantalla.setText(pantalla.getText().toString() + button8.getText().toString());
                }
                else
                {
                    pantalla.setText(button8.getText().toString());
                    inicio=true;
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inicio)
                {
                    pantalla.setText(pantalla.getText().toString() + button9.getText().toString());
                }
                else
                {
                    pantalla.setText(button9.getText().toString());
                    inicio=true;
                }
            }
        });
        suma.setOnClickListener(new View.OnClickListener()                    {
            @Override
            public void onClick (View v) {
                ig=0;
                if (operacion.equals("")) {
                    operacion1 = Double.parseDouble(pantalla.getText().toString());
                    inicio = false;
                    operacion = "suma";
                } else {
                    if (operacion.equals("suma")) {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 + operacion2;
                        pantalla.setText(String.valueOf(result));
                        operacion1 = result;
                        inicio=false;
                    }
                    if (operacion.equals("multi")) {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 * operacion2;
                        pantalla.setText(String.valueOf(result));
                        operacion1 = result;
                        inicio=false;
                    }
                    if (operacion.equals("resta")) {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 - operacion2;
                        pantalla.setText(String.valueOf(result));
                        operacion1 = result;
                        inicio=false;
                    }
                    if (operacion.equals("division")) {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 / operacion2;
                        pantalla.setText(String.valueOf(result));
                        operacion1 = result;
                        inicio=false;
                    }
                    operacion="suma";
                }
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                ig=0;
                if (operacion == "") {
                    operacion1 = Double.parseDouble(pantalla.getText().toString());
                    inicio = false;
                    operacion = "resta";
                } else {
                    if (operacion.equals("suma")) {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 + operacion2;
                        pantalla.setText(String.valueOf(result));
                        operacion1 = result;
                        inicio=false;
                    }
                    if (operacion.equals("multi")) {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 * operacion2;
                        pantalla.setText(String.valueOf(result));
                        operacion1 = result;
                        inicio=false;
                    }
                    if (operacion.equals("resta")) {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 - operacion2;
                        pantalla.setText(String.valueOf(result));
                        operacion1 = result;
                        inicio=false;
                    }
                    if (operacion.equals("division")) {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 / operacion2;
                        pantalla.setText(String.valueOf(result));
                        operacion1 = result;
                        inicio=false;
                    }
                    operacion="resta";

                }
            }
        });
        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                ig=0;
                if (operacion.equals("")) {
                    operacion1 = Double.parseDouble(pantalla.getText().toString());
                    inicio = false;
                    operacion = "multi";
                } else {
                    if (operacion.equals("suma")) {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 + operacion2;
                        pantalla.setText(String.valueOf(result));
                        operacion1 = result;
                        inicio=false;
                    }
                    if (operacion.equals("multi")) {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 * operacion2;
                        pantalla.setText(String.valueOf(result));
                        operacion1 = result;
                        inicio=false;
                    }
                    if (operacion.equals("resta")) {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 - operacion2;
                        pantalla.setText(String.valueOf(result));
                        operacion1 = result;
                        inicio=false;
                    }
                    if (operacion.equals("division")) {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 / operacion2;
                        pantalla.setText(String.valueOf(result));
                        operacion1 = result;
                        inicio=false;
                    }
                    operacion="multi";
                }
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                ig=0;
                if (operacion.equals("")) {
                    operacion1 = Double.parseDouble(pantalla.getText().toString());
                    inicio = false;
                    operacion = "division";
                } else {
                    if (operacion.equals("suma")) {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 + operacion2;
                        pantalla.setText(String.valueOf(result));
                        operacion1 = result;
                        inicio=false;
                    }
                    if (operacion.equals("multi")) {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 * operacion2;
                        pantalla.setText(String.valueOf(result));
                        operacion1 = result;
                        inicio=false;
                    }
                    if (operacion.equals("resta")) {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 - operacion2;
                        pantalla.setText(String.valueOf(result));
                        operacion1 = result;
                        inicio=false;
                    }
                    if (operacion.equals("division")) {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 / operacion2;
                        pantalla.setText(String.valueOf(result));
                        operacion1 = result;
                        inicio=false;
                    }
                    operacion="division";
                }
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                result = 0;
                operacion="";
                operacion1=0;
                operacion2=0;
                ig=0;
                pantalla.setText(String.valueOf(0));
                inicio=false;
            }
        });
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                if(ig==0) {
                    if (operacion == "suma") {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 + Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText(String.valueOf(result));
                        operacion1 = result;
                        operacion = "";
                        ig=1;
                        inicio=false;
                    }
                    if (operacion == "multi") {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 * Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText(String.valueOf(result));
                        operacion1 = result;
                        operacion = "";
                        ig=1;
                        inicio=false;

                    }
                    if (operacion == "resta") {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 - Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText(String.valueOf(result));
                        operacion1 = result;
                        operacion = "";
                        ig=1;
                        inicio=false;

                    }
                    if (operacion == "division") {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 / Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText(String.valueOf(result));
                        operacion1 = result;
                        operacion = "";
                        ig=1;
                        inicio=false;

                    }
                }
                else
                {
                    Toast toast1 = Toast.makeText(getApplicationContext(),"Ya has pulsado este boton.",Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_VERTICAL,0,0);
                    toast1.show();
                }
            }
        });
        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Toast toast1 = Toast.makeText(getApplicationContext(),"Este es el boton prohibido.",Toast.LENGTH_SHORT);
                toast1.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast1.show();
            }
        });
        coseno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast1 = Toast.makeText(getApplicationContext(),"Este boton no te interesa.",Toast.LENGTH_SHORT);
                toast1.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast1.show();
            }
        });
        seno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        tangente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        grados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}