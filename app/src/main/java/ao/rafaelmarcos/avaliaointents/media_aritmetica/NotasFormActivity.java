package ao.rafaelmarcos.avaliaointents.media_aritmetica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;

import ao.rafaelmarcos.avaliaointents.R;

public class NotasFormActivity extends AppCompatActivity {
    public static final String NP1 = "NP1";
    public static final String NP2 = "NP2";

    private EditText np1, np2;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas_form);

        np1 = findViewById(R.id.np1);
        np2 = findViewById(R.id.np2);

        button = findViewById(R.id.button);
        button.setOnClickListener((v) -> {
            Intent i = new Intent(this, MediaAritmeticaActivity.class);
            i.putExtra(NotasFormActivity.NP1, Double.parseDouble(np1.getText().toString()));
            i.putExtra(NotasFormActivity.NP2, Double.parseDouble(np2.getText().toString()));

            startActivity(i);
        });
    }
}