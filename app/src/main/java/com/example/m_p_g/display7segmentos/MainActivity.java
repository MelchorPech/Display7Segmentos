package com.example.m_p_g.display7segmentos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    TextView S12;
    TextView S14;
    TextView S15;
    TextView S16;
    TextView S17;
    TextView S18;
    TextView S19;

    TextView S22;
    TextView S24;
    TextView S25;
    TextView S26;
    TextView S27;
    TextView S28;
    TextView S29;

    TextView S32;
    TextView S34;
    TextView S35;
    TextView S36;
    TextView S37;
    TextView S38;
    TextView S39;

    TextView S42;
    TextView S44;
    TextView S45;
    TextView S46;
    TextView S47;
    TextView S48;
    TextView S49;
    EditText entrada;
    String cadena,cadenaAux;
    Button btnMostar, btnReset;
    int prueba = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entrada = (EditText) findViewById(R.id.edtEntrada);
        btnMostar = (Button) findViewById(R.id.btnListo);
        btnReset = (Button) findViewById(R.id.btnReset);

        //Primer display
        S12 = (TextView) findViewById(R.id.S12);
        S14 = (TextView) findViewById(R.id.S14);
        S15 = (TextView) findViewById(R.id.S15);
        S16 = (TextView) findViewById(R.id.S16);
        S17 = (TextView) findViewById(R.id.S17);
        S18 = (TextView) findViewById(R.id.S18);
        S19 = (TextView) findViewById(R.id.S19);
        //Segundo display
        S22 = (TextView) findViewById(R.id.S22);
        S24 = (TextView) findViewById(R.id.S24);
        S25 = (TextView) findViewById(R.id.S25);
        S26 = (TextView) findViewById(R.id.S26);
        S27 = (TextView) findViewById(R.id.S27);
        S28 = (TextView) findViewById(R.id.S28);
        S29 = (TextView) findViewById(R.id.S29);

        //Tercero display
        S32 = (TextView) findViewById(R.id.S32);
        S34 = (TextView) findViewById(R.id.S34);
        S35 = (TextView) findViewById(R.id.S35);
        S36 = (TextView) findViewById(R.id.S36);
        S37 = (TextView) findViewById(R.id.S37);
        S38 = (TextView) findViewById(R.id.S38);
        S39 = (TextView) findViewById(R.id.S39);
        //Cuarto display
        S42 = (TextView) findViewById(R.id.S42);
        S44 = (TextView) findViewById(R.id.S44);
        S45 = (TextView) findViewById(R.id.S45);
        S46 = (TextView) findViewById(R.id.S46);
        S47 = (TextView) findViewById(R.id.S47);
        S48 = (TextView) findViewById(R.id.S48);
        S49 = (TextView) findViewById(R.id.S49);

        cadena = entrada.getText().toString();
        entrada.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                cadena = entrada.getText().toString();

                    if (entrada.getText().length() == 7 || entrada.getText().length() == 15 || entrada.getText().length() == 23) {
                        cadenaAux = entrada.getText().toString();
                        entrada.setText(" " + cadenaAux);

                    }if(entrada.getText().length() == 31){
                    cadenaAux = entrada.getText().toString();
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        btnMostar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cadenaAux = entrada.getText().toString();
                if (entrada.getText().length() == 31) {

                    //
                    if (cadenaAux.charAt(24) == '1') {
                        S12.setText("_");
                    } else {
                        S12.setText("");
                    }
                    if (cadenaAux.charAt(25) == '1') {
                        S16.setText("|");
                    } else {
                        S16.setText("");
                    }
                    if (cadenaAux.charAt(26) == '1') {
                        S19.setText("|");
                    } else {
                        S19.setText("");
                    }
                    if (cadenaAux.charAt(27) == '1') {
                        S18.setText("_");
                    } else {
                        S18.setText("");
                    }
                    if (cadenaAux.charAt(28) == '1') {
                        S17.setText("|");
                    } else {
                        S17.setText("");
                    }
                    if (cadenaAux.charAt(29) == '1') {
                        S14.setText("|");
                    } else {
                        S14.setText("");
                    }
                    if (cadenaAux.charAt(30) == '1') {
                        S15.setText("_");
                    } else {
                        S15.setText("");
                    }


                    //
                    if (cadenaAux.charAt(16) == '1') {
                        S22.setText("_");
                    } else {
                        S22.setText("");
                    }
                    if (cadenaAux.charAt(17) == '1') {
                        S26.setText("|");
                    } else {
                        S26.setText("");
                    }
                    if (cadenaAux.charAt(18) == '1') {
                        S29.setText("|");
                    } else {
                        S29.setText("");
                    }
                    if (cadenaAux.charAt(19) == '1') {
                        S28.setText("_");
                    } else {
                        S28.setText("");
                    }
                    if (cadenaAux.charAt(20) == '1') {
                        S27.setText("|");
                    } else {
                        S27.setText("");
                    }
                    if (cadenaAux.charAt(21) == '1') {
                        S24.setText("|");
                    } else {
                        S24.setText("");
                    }
                    if (cadenaAux.charAt(22) == '1') {
                        S25.setText("_");

                    } else {
                        S25.setText("");
                    }
                    
                    //
                    if (cadenaAux.charAt(8) == '1') {
                        S32.setText("_");
                    } else {
                        S32.setText("");
                    }
                    if (cadenaAux.charAt(9) == '1') {
                        S36.setText("|");
                    } else {
                        S36.setText("");
                    }
                    if (cadenaAux.charAt(10) == '1') {
                        S39.setText("|");
                    } else {
                        S39.setText("");
                    }
                    if (cadenaAux.charAt(11) == '1') {
                        S38.setText("_");
                    } else {
                        S38.setText("");
                    }
                    if (cadenaAux.charAt(12) == '1') {
                        S37.setText("|");
                    } else {
                        S37.setText("");
                    }
                    if (cadenaAux.charAt(13) == '1') {
                        S34.setText("|");
                    } else {
                        S34.setText("");
                    }
                    if (cadenaAux.charAt(14) == '1') {
                        S35.setText("_");
                    } else {
                        S35.setText("");
                    }

                    //
                    if (cadenaAux.charAt(0) == '1') {
                        S42.setText("_");
                    } else {
                        S42.setText("");
                    }
                    if (cadenaAux.charAt(1) == '1') {
                        S46.setText("|");
                    } else {
                        S46.setText("");
                    }
                    if (cadenaAux.charAt(2) == '1') {
                        S49.setText("|");
                    } else {
                        S49.setText("");
                    }
                    if (cadenaAux.charAt(3) == '1') {
                        S48.setText("_");
                    } else {
                        S48.setText("");
                    }
                    if (cadenaAux.charAt(4) == '1') {
                        S47.setText("|");
                    } else {
                        S47.setText("");
                    }
                    if (cadenaAux.charAt(5) == '1') {
                        S44.setText("|");
                    } else {
                        S44.setText("");
                    }
                    if (cadenaAux.charAt(6) == '1') {
                        S45.setText("_");
                    } else {
                        S45.setText("");
                    }
                }else{
                Toast.makeText(MainActivity.this,"Ingrese "+ (31-entrada.getText().length()) +" digitos",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entrada.setText("");
            }
        });
    }

}
