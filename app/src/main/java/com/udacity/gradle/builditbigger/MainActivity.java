package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

//import com.udacity.gradle.imageactivity.ImageActivity;
import com.example.Citacao;
import com.example.CitationProvider;
import com.example.flaviayeshua.libexibecitacao.CitacaoActivity;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView)findViewById(R.id.tvText)).setText(PhraseGenerator.get());
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

        provider.addCitation("123 aqui mora um portugues", "Flávia Yeshua");
        provider.addCitation("Ouviram do Ipiranga", "Marco Yeshua");
        provider.addCitation("Uma vez Flamengo, sempre Flamengo", "Priscila Costa");

        Citacao citacao = provider.obterCitation();

        Intent myIntent = new Intent(this, CitacaoActivity.class);
        myIntent.putExtra("citacaoConteudo",citacao.getConteudo());
        myIntent.putExtra("citacaoAutor", citacao.getAutor());
        startActivity(myIntent);
    }

}
