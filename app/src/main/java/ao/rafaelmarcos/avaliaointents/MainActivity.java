package ao.rafaelmarcos.avaliaointents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity{
    private Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // exemplo 1
        button1 = findViewById(R.id.botao_1);
        button1.setOnClickListener((v) -> {
            Intent i = new Intent(this, ao.rafaelmarcos.avaliaointents.media_aritmetica.NotasFormActivity.class);
            startActivity(i);
        });

        // exemplo 2
        button2 = findViewById(R.id.botao_2);
        button2.setOnClickListener((v) -> {
            Intent i = new Intent(this, ao.rafaelmarcos.avaliaointents.login.FormActivity.class);
            startActivity(i);
        });

        // exemplo 3
        button3 = findViewById(R.id.botao_3);
        button3.setOnClickListener((v) -> {
            Intent i = new Intent(this, ao.rafaelmarcos.avaliaointents.message.MessageGetterActivity.class);
            startActivity(i);
        });
    }
}