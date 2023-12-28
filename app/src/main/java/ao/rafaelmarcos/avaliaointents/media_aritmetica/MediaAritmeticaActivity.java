package ao.rafaelmarcos.avaliaointents.media_aritmetica;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.widget.TextView;

import java.text.DecimalFormat;

import ao.rafaelmarcos.avaliaointents.R;

public class MediaAritmeticaActivity extends AppCompatActivity {
    private TextView media, veredito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_aritmetica);

        Intent i = getIntent();
        // vai dar merda se for null
        double np1 = i.getDoubleExtra(NotasFormActivity.NP1, 0);
        double np2 = i.getDoubleExtra(NotasFormActivity.NP2, 0);

        // calculando a media
        double mediaFinal = (np1+np2)/2;
        //formato a ser apresentado
        DecimalFormat format = new DecimalFormat("0.00");

        // mostrando o valor da media
        media = findViewById(R.id.media);
        StringBuilder texto = new StringBuilder();
        texto.append(getResources().getString(R.string.media_final));
        texto.append(format.format(mediaFinal));
        media.setText(texto.toString());

        // mostrando o veredito
        veredito = findViewById(R.id.veredito);
        if(mediaFinal < 10){
            veredito.setText(R.string.veredito_reprovado);
            veredito.setTextColor(Color.RED);
        }
        else{
            veredito.setText(R.string.veredito_aprovado);
            veredito.setTextColor(Color.GREEN);
        }
    }
}