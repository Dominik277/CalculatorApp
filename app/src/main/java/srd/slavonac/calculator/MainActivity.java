package srd.slavonac.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button buttonNula,buttonJedan,buttonDva,buttonTri,buttonCetiri,
            buttonPet,buttonSedam,buttonSest,buttonOsam,buttonDevet,
            buttonPlus,buttonOcisti,buttonPuta,buttonPodijeljeno,
            buttonMinus,buttonObrisi,buttonOdgovor,buttonTocka;
    EditText editTextOdgovor,editTextZadatak;
    public final char ZBRAJANJE = '+';
    public final char ODUZIMANJE = '-';
    public final char MNOZENJE = '*';
    public final char DJELJENJE = '/';
    public final char JEDNAKI = '0';
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpViews();
        gumbNula();
        gumbJedan();
        gumbDva();
        gumbTri();
        gumbCetiri();
        gumbPet();
        gumbSest();
        gumbSedam();
        gumbOsam();
        gumbDevet();
    }

    public void setUpViews(){
        buttonNula = findViewById(R.id.buttonNula);
        buttonJedan = findViewById(R.id.buttonJedan);
        buttonDva = findViewById(R.id.buttonDva);
        buttonTri = findViewById(R.id.buttonTri);
        buttonCetiri = findViewById(R.id.buttonCetiri);
        buttonPet = findViewById(R.id.buttonPet);
        buttonSest = findViewById(R.id.buttonSest);
        buttonSedam = findViewById(R.id.buttonSedam);
        buttonOsam = findViewById(R.id.buttonOsam);
        buttonDevet = findViewById(R.id.buttonDevet);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonOcisti = findViewById(R.id.buttonOcisti);
        buttonPuta = findViewById(R.id.buttonPuta);
        buttonPodijeljeno = findViewById(R.id.buttonPodjeljeno);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonObrisi = findViewById(R.id.buttonObrisi);
        buttonOdgovor = findViewById(R.id.buttonOdgovor);
        buttonTocka = findViewById(R.id.buttonTocka);
        editTextZadatak = findViewById(R.id.editTextZadatak);
        editTextOdgovor = findViewById(R.id.editTextOdgovor);
    }

    public void gumbNula(){
        buttonNula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextZadatak.setText(editTextZadatak.getText().toString() + "0");
            }
        });
    }

    public void gumbJedan(){
        buttonNula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextZadatak.setText(editTextZadatak.getText().toString() + "1");
            }
        });
    }

    public void gumbDva(){
        buttonNula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextZadatak.setText(editTextZadatak.getText().toString() + "2");
            }
        });
    }

    public void gumbTri(){
        buttonNula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextZadatak.setText(editTextZadatak.getText().toString() + "3");
            }
        });
    }

    public void gumbCetiri(){
        buttonNula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextZadatak.setText(editTextZadatak.getText().toString() + "4");
            }
        });
    }

    public void gumbPet(){
        buttonNula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextZadatak.setText(editTextZadatak.getText().toString() + "5");
            }
        });
    }

    public void gumbSest(){
        buttonNula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextZadatak.setText(editTextZadatak.getText().toString() + "6");
            }
        });
    }

    public void gumbSedam(){
        buttonNula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextZadatak.setText(editTextZadatak.getText().toString() + "7");
            }
        });
    }

    public void gumbOsam(){
        buttonNula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextZadatak.setText(editTextZadatak.getText().toString() + "8");
            }
        });
    }

    public void gumbDevet(){
        buttonNula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextZadatak.setText(editTextZadatak.getText().toString() + "9");
            }
        });
    }

    public void gumbPlus(){
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rjesavanje();
                ACTION = ZBRAJANJE;
                editTextOdgovor.setText(String.valueOf(val1) + "+");
                editTextZadatak.setText(null);
            }
        });
    }

    public void gumbMinus(){
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rjesavanje();
                ACTION = ODUZIMANJE;
                editTextOdgovor.setText(String.valueOf(val1) + "-");
                editTextZadatak.setText(null);
            }
        });
    }

    public void gumbPuta(){
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rjesavanje();
                ACTION = MNOZENJE;
                editTextOdgovor.setText(String.valueOf(val1) + "*");
                editTextZadatak.setText(null);
            }
        });
    }

    public void gumbPodjeljeno(){
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rjesavanje();
                ACTION = DJELJENJE;
                editTextOdgovor.setText(String.valueOf(val1) + "/");
                editTextZadatak.setText(null);
            }
        });
    }

    public void rjesavanje(){
        if (!Double.isNaN(val1)){
            val2 = Double.parseDouble(editTextZadatak.getText().toString());

            switch (ACTION){
                case ZBRAJANJE:
                    val1 = val1 + val2;
                    break;
                case ODUZIMANJE:
                    val1 = val1 - val2;
                    break;
                case MNOZENJE:
                    val1 = val1 * val2;
                    break;
                case DJELJENJE:
                    val1 = val1 / val2;
                    break;
                case JEDNAKI:
                    break;
            }
        }else {
            val1 = Double.parseDouble(editTextZadatak.getText().toString());
        }
    }
}
