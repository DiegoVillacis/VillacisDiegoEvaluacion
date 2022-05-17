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

        editNombreS = findViewById(R.id.editTextTextIngresoNombre);
        editBaseS = findViewById(R.id.editTextTextIngresoNombre);

        String obtenerNombre = getIntent().getStringExtra("variablenombre");
        editNombreS.setText(obtenerNombre);

        String obtenerBase = getIntent().getStringExtra("variablebase");
        editBaseS.setText(obtenerBase);
    }

    public void onClickSiguienteS(View view){
        Intent intent = new Intent(this, TerceraPantalla.class );
        String mandarNombre = editNombreS.getText().toString();
        String mandarBase = editBaseS.getText().toString();

        intent.putExtra("variablenombre", mandarNombre);
        intent.putExtra("variablebase",mandarBase);
        startActivity(intent);
    }

    public void onClickCerrarS(View view){
        Intent intent = new Intent(this, MainActivity.class );
        String apellido = getIntent().getStringExtra("variableapellido");
        String exponente = getIntent().getStringExtra("variableexponente");

        String mandaNombre = editNombreS.getText().toString();
        String mandaBase = editBaseS.getText().toString();

        intent.putExtra("variableapellido", apellido);
        intent.putExtra("variablenombre", mandaNombre);
        intent.putExtra("variablebase",mandaBase);
        intent.putExtra("variableexponente",exponente);

        startActivity(intent);
    }
}