package com.example.cecyt9.examen1_app_apm_angelgutierrezcontreras_6im7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    float res = 0;
    EditText Dinero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Dinero = (EditText) findViewById(R.id.conventir);
    }



    public void onClickConvertir(View v){
        int dato = Integer.parseInt(Dinero.getText().toString());
        res = dato / 15;
        Intent intencion = new Intent(this,Main2Activity.class);
        Bundle Resultado = new Bundle();
        Resultado.putFloat("Resultados",res);
        intencion.putExtras(Resultado);
        finish();
        startActivity(intencion);
    }


}
