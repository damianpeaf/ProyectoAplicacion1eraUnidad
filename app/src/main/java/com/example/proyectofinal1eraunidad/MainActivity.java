package com.example.proyectofinal1eraunidad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
/*prueba git git git git*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button lineales = (Button) findViewById(R.id.lineales);
        Button parabola = (Button) findViewById(R.id.parabola);
        Button cuadratica = (Button) findViewById(R.id.cuadratica);
        Button hiperbola = (Button) findViewById(R.id.hiperbola);
        Button cubica = (Button) findViewById(R.id.cubica);
        Button exponencial = (Button) findViewById(R.id.exponencial);
        Button circunferencia = (Button) findViewById(R.id.circunferencia);
        Button logaritmica = (Button) findViewById(R.id.logaritmica);
        Button elipse = (Button) findViewById(R.id.elipse);
        Button area = (Button) findViewById(R.id.area);
        Button creditos = (Button) findViewById(R.id.creditos);

        lineales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(getApplication(), Lineales.class);
                startActivity(inte);
            }
        });

        parabola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(getApplication(), parabola.class);
                startActivity(inte);
            }
        });

        cuadratica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(getApplication(), cuadratica.class);
                startActivity(inte);
            }
        });

        hiperbola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(getApplication(), hiperbola.class);
                startActivity(inte);
            }
        });

        cubica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(getApplication(), cubica.class);
                startActivity(inte);
            }
        });

        exponencial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(getApplication(), exponencial.class);
                startActivity(inte);
            }
        });

        circunferencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(getApplication(), circunferencia.class);
                startActivity(inte);
            }
        });

        logaritmica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(getApplication(), logaritmica.class);
                startActivity(inte);
            }
        });

        elipse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(getApplication(), elipse.class);
                startActivity(inte);
            }
        });

        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(getApplication(), area.class);
                startActivity(inte);
            }
        });

        creditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(getApplication(), creditos.class);
                startActivity(inte);
            }
        });
    }
}
