package fisei.uta.ec.villacisdiegoevaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TerceraPantalla extends AppCompatActivity {

    private EditText nom;
    private EditText editApellidoT;
    private EditText bas;
    private EditText exp;
    private EditText num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera_pantalla);

        editApellidoT = findViewById(R.id.editTextTextApellidoT);
        bas = findViewById(R.id.editTextTextBase);
        exp = findViewById(R.id.editTextTextExponenteT);
        num = findViewById(R.id.editTextTextNumeroT);

        String nombre = getIntent().getStringExtra("nombre");
        nom.setText(nombre);

        String base = getIntent().getStringExtra("base");
        bas.setText(base);


    }











    public void Cerrar(View view){
        Intent siguiente = new Intent(this, SegundaPantalla.class );
        String nomb = nom.getText().toString();
        String apell = editApellidoT.getText().toString();
        String base = bas.getText().toString();
        String exponen = exp.getText().toString();
        String numer = num.getText().toString();
        siguiente.putExtra("nombre", nomb);
        siguiente.putExtra("apellido", apell);
        siguiente.putExtra("base", base);
        siguiente.putExtra("exponen", exponen);
        siguiente.putExtra("numero", numer);

        startActivity(siguiente);

    }
}
