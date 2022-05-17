package fisei.uta.ec.villacisdiegoevaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TerceraPantalla extends AppCompatActivity {

    private EditText editNombreT;
    private EditText editApellidoT;
    private EditText editBaseT;
    private EditText editExponenteT;
    private EditText editNumeroT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera_pantalla);

        editNombreT = (EditText) findViewById(R.id.editTextTextNombreT);
        editApellidoT = (EditText) findViewById(R.id.editTextTextApellidoT);
        editBaseT = (EditText) findViewById(R.id.editTextTextBase);
        editExponenteT = (EditText) findViewById(R.id.editTextTextExponenteT);
        editNumeroT = (EditText) findViewById(R.id.editTextTextNumeroT);


        String nombre = getIntent().getStringExtra("nombre");
        editNombreT.setText(nombre);

        String base = getIntent().getStringExtra("base");
        editBaseT.setText(base);
    }




    public void onClickCerrarT(View view){

        Intent intent = new Intent(this, SegundaPantalla.class );

        String nombreT = editNombreT.getText().toString();
        String apellidoT = editApellidoT.getText().toString();
        String baseT = editBaseT.getText().toString();
        String exponenteT = editExponenteT.getText().toString();
        String numeroT = editNumeroT.getText().toString();

        intent.putExtra("variablenombre", nombreT);
        intent.putExtra("variableapellido", apellidoT);
        intent.putExtra("variablebase", baseT);
        intent.putExtra("variableexponente", exponenteT);
        intent.putExtra("variablenumero", numeroT);

        startActivity(intent);

    }
}
