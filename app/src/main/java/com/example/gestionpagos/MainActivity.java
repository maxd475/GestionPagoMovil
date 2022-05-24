package com.example.gestionpagos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.gestionpagos.entity.pago;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    EditText nombre, horas, costo;
    Button btnEnviar;
    TextView importe, datos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          nombre=findViewById(R.id.idEmpleado);
          horas=findViewById(R.id.idHoras);
          costo=findViewById(R.id.idCosto);
          importe=findViewById(R.id.idImporte);
          btnEnviar=findViewById(R.id.idEnviar);
          datos=findViewById(R.id.iddatos);


          btnEnviar.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                  pago pagar= new pago();

                  pagar.setNombreEmpleado(nombre.getText().toString());
                  pagar.setHoras(Integer.parseInt(horas.getText().toString()));
                  pagar.setCosto(Double.parseDouble(costo.getText().toString()));


                       double importeTotal= pagar.calcularImporte();



                       importe.setText(String.format("%.2f",importeTotal));
                        datos.setText(String.format(nombre.getText().toString()));

              }
          });




    }






}