package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.Citacao;
import com.example.CitationProvider;
import com.example.flaviayeshua.libexibecitacao.CitacaoActivity;

//import com.udacity.gradle.imageactivity.ImageActivity;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view){
        Toast.makeText(this, "derp", Toast.LENGTH_SHORT).show();
    }

    public void chamarCitacao(View view){

        CitationProvider provider = new CitationProvider();

        provider.addCitation("Há três tipos de pessoas: Aqueles que vêem, aqueles que vêem somente o que se mostra e aqueles que não vêem.", "Leonardo da Vinci");
        provider.addCitation("A justiça é a vingança do homem em sociedade, como a vingança é a justiça do homem em estado selvagem.", "Epicuro");
        provider.addCitation("Os filhos dos homens, dentre todos os animais jovens, são os mais difíceis de serem tratados.", "Platão");
        provider.addCitation("Quem mais possui, mais medo tem de perder.", "Leonardo da Vinci");
        provider.addCitation("Quando vires um homem bom, tenta imitá-lo; quando vires um homem mau, examina-te a ti mesmo.", "Confúcio");
        provider.addCitation("Homens geniais começam as obras, os homens trabalhadores as terminam.", "Leonardo da Vinci");
        provider.addCitation("O homem superior atribui a culpa a si próprio; o homem comum aos outros.", "Confúcio");
        provider.addCitation("Homens geniais começam as obras, os homens trabalhadores as terminam.", "Leonardo da Vinci");
        provider.addCitation("Queres ser rico? Pois não te preocupes em aumentar os teus bens, mas sim em diminuir a tua cobiça.", "Epicuro");

        Citacao citacao = provider.obterCitation();

        Intent myIntent = new Intent(this, CitacaoActivity.class);
        myIntent.putExtra("citacaoConteudo",citacao.getConteudo());
        myIntent.putExtra("citacaoAutor", citacao.getAutor());
        startActivity(myIntent);
    }

}
