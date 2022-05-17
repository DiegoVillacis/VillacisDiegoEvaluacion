package fisei.uta.ec.villacisdiegoevaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText editNombreP;
    private EditText editApellidoP;
    private EditText editBaseP;
    private EditText editExponenteP;
    private EditText editFactorialP;
    private EditText editPotenciaP;
    private Button buttonMostrarP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editNombreP = findViewById(R.id.editTextTextNombre);
        editApellidoP = findViewById(R.id.editTextTextApellido);
        editBaseP = findViewById(R.id.editTextTextBase);
        editExponenteP = findViewById(R.id.editTextTextExponente);
        editPotenciaP = findViewById(R.id.editTextTextPotencia);
        editFactorialP = findViewById(R.id.editTextTextFactorial);


        buttonMostrarP = findViewById(R.id.buttonMostrar);


        String nombr = getIntent().getStringExtra("variablenombre");
        editNombreP.setText(nombr);


        String ape = getIntent().getStringExtra("variableapellido");
        editApellidoP.setText(ape);

        String bas = getIntent().getStringExtra("variablebase");
        editBaseP.setText(bas);

        String exp = getIntent().getStringExtra("variableexponente");
        editExponenteP.setText(exp);


        if (editNombreP.length()==0){
            buttonMostrarP.setEnabled(false);
        }else{
            buttonMostrarP.setEnabled(true);
        }
    }

    public void onClickSiguiente(View view){
        Intent siguiente = new Intent(this, SegundaPantalla.class );
        startActivity(siguiente);
    }

    public void onClickMostrar(View view){
        String pot = editBaseP.getText().toString();
        String exp = editExponenteP.getText().toString();


    }
}