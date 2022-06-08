package br.com.etecia.myplanets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ClickMandaPlanetaActivity extends AppCompatActivity {

    ImageView img_mostra_planeta;
    TextView txt_mostra_planeta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.click_manda_planeta_layout);

        img_mostra_planeta = findViewById(R.id.img_mostra_planeta);
        txt_mostra_planeta = findViewById(R.id.txt_mostra_planeta);

        Intent intent = getIntent();

        //nova variável que pega a variável do outro lado
        String nomeplaneta = intent.getStringExtra("nome_planeta");
        int imagemplaneta = intent.getIntExtra("img_planeta", 0);

        txt_mostra_planeta.setText(nomeplaneta);
        img_mostra_planeta.setImageResource(imagemplaneta);


    }
}