package br.com.etecia.myplanets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{
    //Declarar lista
    ListView lista_planetas;

    //criando vetores com as imagens e nomes

    String nome_planetas [] = {"Jupiter", "Lua", "Marte", "Mercurio", "Netuno", "Plutão", "Saturno", "Sol", "Terra", "Urano", "Venus"};


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista_planetas = findViewById(R.id.lista_planetas);

        Adapter adapter = new Adapter();
        lista_planetas.setAdapter(adapter);
    }

    //criando o adaptador como classe interna
    public class Adapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return 0;
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
            return null;
        }
    }
}