package br.com.etecia.myplanets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declarar lista
    ListView lista_planetas;

    //criando vetores com as imagens e nomes

    String nome_planetas[] = {"Jupiter", "Lua", "Marte", "Mercurio", "Netuno", "Plutão", "Saturno", "Sol", "Terra", "Urano", "Venus"};
    int imagem_planetas[] = {R.drawable.jupiter, R.drawable.lua, R.drawable.marte, R.drawable.mercurio, R.drawable.netuno, R.drawable.plutao, R.drawable.saturno, R.drawable.sol, R.drawable.terra, R.drawable.urano, R.drawable.venus};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista_planetas = findViewById(R.id.lista_planetas);

        Adapter adapter = new Adapter();
        lista_planetas.setAdapter(adapter);


        //implementando o click quando clica em um item da lista
        lista_planetas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), ClickMandaPlanetaActivity.class);
                intent.putExtra("nome_planeta", nome_planetas[i]);  //nome da variável que será resgatada do outro lado + de onde ela veio
                intent.putExtra("img_planeta", imagem_planetas[i]);

                startActivity(intent);
            }
        });

    }

    //criando o adaptador como classe interna
    public class Adapter extends BaseAdapter {

        @Override
        public int getCount() {
            return imagem_planetas.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
           //itens que vão no modelo
            ImageView img_planeta;
            TextView txt_planeta;
            CardView card_planeta;
            View modelo = getLayoutInflater().inflate(R.layout.modelo_planetas, null);

            txt_planeta = modelo.findViewById(R.id.txt_modelo_planeta);
            img_planeta = modelo.findViewById(R.id.img_modelo_planeta);

            //preenchendo o modelo com valores do vetor
            txt_planeta.setText(nome_planetas[i]);
            img_planeta.setImageResource(imagem_planetas[i]);

            return modelo;
        }
    }
}