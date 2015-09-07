package com.example.flaviayeshua.libexibecitacao;

import java.lang.String;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class CitacaoActivity extends AppCompatActivity {

    private TextView textViewCitacaoConteudo;
    private TextView textViewCitacaoAutor;
    private String citacaoConteudo = "";
    private String citacaoAutor = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citacao);

        textViewCitacaoConteudo = (TextView)findViewById(R.id.citacaoConteudo);
        textViewCitacaoAutor = (TextView)findViewById(R.id.citacaoAutor);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            citacaoConteudo = bundle.getString("citacaoConteudo");
            citacaoAutor = bundle.getString("citacaoAutor");
        }

        textViewCitacaoConteudo.setText(citacaoConteudo);
        textViewCitacaoAutor.setText(citacaoAutor);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_citacao, menu);
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
}
