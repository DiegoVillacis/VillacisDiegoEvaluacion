package fisei.uta.ec.villacisdiegoevaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText n;
    private EditText a;
    private EditText b;
    private EditText e;
    private EditText f;
    private EditText p;
    private Button mos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        n=(EditText)findViewById(R.id.editTextTextNombre);
        a=(EditText)findViewById(R.id.editTextTextApellido);
        b=(EditText)findViewById(R.id.editTextTextBase);
        e=(EditText)findViewById(R.id.editTextTextExponente);
        p=(EditText)findViewById(R.id.editTextTextPotencia);
        p=(EditText)findViewById(R.id.editTextTextFactorial);


        mos = (Button)findViewById(R.id.buttonMostrar);


        String nombr = getIntent().getStringExtra("nombre");
        n.setText(nombr);
        String ape = getIntent().getStringExtra("apellido");
        a.setText(ape);

        String bas = getIntent().getStringExtra("base");
        b.setText(bas);

        String exp = getIntent().getStringExtra("exponen");
        e.setText(exp);
        if (n.length()==0){
            mos.setEnabled(false);
        }else{
            mos.setEnabled(true);
        }
    }

    public void onClickSiguiente(View view){
        Intent siguiente = new Intent(this, SegundaPantalla.class );
        startActivity(siguiente);
    }

    public void onClickMostrar(View view){
        String pot = b.getText().toString();
        String exp = e.getText().toString();
        double pote = Double.parseDouble(pot);
        double expo = Double.parseDouble(exp);

        double poten = Math.pow(pote,expo);

        String res = String.valueOf(poten);
        p.setText(res);
    }
}