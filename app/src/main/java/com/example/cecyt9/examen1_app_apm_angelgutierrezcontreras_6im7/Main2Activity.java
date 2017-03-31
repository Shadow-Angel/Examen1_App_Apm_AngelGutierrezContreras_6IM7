package com.example.cecyt9.examen1_app_apm_angelgutierrezcontreras_6im7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView resultado;
    String res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    try{
        Intent recibir = getIntent();
        Bundle datos;
        datos = recibir.getExtras();
        res = datos.getString("Resultado");
        resultado = (TextView) findViewById(R.id.textView);
        resultado.setText("Gutierrez Contreras Angel, " + res);
    }catch(Exception e) {
        Toast.makeText(getApplicationContext(),"Hay un error"+e.getMessage(), Toast.LENGTH_LONG).show();
    }

    }

    public void onClickEnviar(View correo)
    {
        Intent intento = new Intent(Intent.ACTION_SEND);
        intento.setType("text/plain");
        intento.putExtra(Intent.EXTRA_SUBJECT, "Asunto: Resultado");
        intento.putExtra(Intent.EXTRA_TEXT, "examen 1er parcial" + resultado.getText().toString());
        intento.putExtra(Intent.EXTRA_EMAIL, new String[] { "mineangel11@gmail.com"});
        startActivity(intento);
    }

}
