package com.example.android.horoscopochino;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int posicionSigno = 0;
    int posicionElemento = 0;
    int anho_nacimiento_actual= 1992;
    Spinner listaAnhos;
    TextView mostrarSigno;
    String anhos[] = new String[200];
    String signos [] = {"RATON", "VACA", "TIGRE", "CONEJO", "DRAGON", "SERPIENTE", "CABALLO", "CABRA", "MONO", "GALLO", "PERRO", "CERDO"};
    String elementos []= {"METAL", "METAL", "AGUA", "AGUA", "MADERA", "MADERA", "FUEGO", "FUEGO", "TIERRA", "TIERRA"};
    int anhoIniciaSpinner = 1924;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

public void calculaSigno(View vista)
{
    EditText anhoNacimiento = (EditText) findViewById(R.id.editText_anho_nacimiento);
    anho_nacimiento_actual = Integer.parseInt(anhoNacimiento.getText().toString());
    int anhosDiferencia = anho_nacimiento_actual - anhoIniciaSpinner;
    int x = anhosDiferencia / 12;
    posicionSigno = anhosDiferencia - (x * 12);
    posicionElemento = (int)(anho_nacimiento_actual % 10);
    mostrarSigno = (TextView) findViewById(R.id.nombre_signo);
    mostrarSigno.setText((signos[posicionSigno] + " DE " + elementos[posicionElemento]));
}




    public void verSigno(View vista) {
        Intent intento = new Intent (MainActivity.this, SignoActivity.class);
        intento.putExtra("indice", posicionSigno);
        intento.putExtra("signo", signos[posicionSigno]);
        intento.putExtra("elemento", elementos[posicionElemento]);
        startActivity(intento);

    }
}