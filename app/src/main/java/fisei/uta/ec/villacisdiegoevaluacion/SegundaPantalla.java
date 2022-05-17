package fisei.uta.ec.villacisdiegoevaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SegundaPantalla extends AppCompatActivity {

    private EditText editNombreS;
    private EditText editBaseS;
    private EditText apellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);

        editNombreS = (EditText) findViewById(R.id.editTextTextIngresoNombre);
        editBaseS = (EditText) findViewById(R.id.editTextIngreseBase);

        String obtenerNombre = getIntent().getStringExtra("variablenombre");
        editNombreS.setText(obtenerNombre);

        String obtenerBase = getIntent().getStringExtra("variableapellido");
        editBaseS.setText(obtenerBase);
    }

    public void onClickSiguienteS(View view){
        Intent intent = new Intent(this, TerceraPantalla.class );
        startActivity(intent);
    }

    public void onClickCerrarS(View view){

        Intent intent = new Intent(this, MainActivity.class );

        String nombre = getIntent().getStringExtra("variablenombre");
        String apellido = getIntent().getStringExtra("variableapellido");
        String base = getIntent().getStringExtra("variablebase");
        String exponente = getIntent().getStringExtra("variableexponente");
        String numero = getIntent().getStringExtra("variablenumero");


        intent.putExtra("variablenombre", nombre);
        intent.putExtra("variableapellido", apellido);
        intent.putExtra("variablebase", base);
        intent.putExtra("variableexponente", exponente);
        intent.putExtra("variablenumero", numero);


        startActivity(intent);
    }
}