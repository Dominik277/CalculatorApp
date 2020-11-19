package srd.slavonac.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonNula,buttonJedan,buttonDva,buttonTri,buttonCetiri,
            buttonPet,buttonSedam,buttonSest,buttonOsam,buttonDevet,
            buttonPlus,buttonPlusMinus,buttonPuta,buttonPodijeljeno,
            buttonMinus,buttonObrisi,buttonOdgovor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        buttonPlusMinus = findViewById(R.id.buttonPlusMinus);
        buttonPuta = findViewById(R.id.buttonPuta);
        buttonPodijeljeno = findViewById(R.id.buttonPodjeljeno);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonObrisi = findViewById(R.id.buttonObrisi);
        buttonOdgovor = findViewById(R.id.buttonOdgovor);

    }
}