package ao.rafaelmarcos.avaliaointents.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import ao.rafaelmarcos.avaliaointents.R;

public class WelcomeActivity extends AppCompatActivity {
    private TextView welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        welcome = findViewById(R.id.welcome);
        String name = getIntent().getExtras().getString(FormActivity.USERNAME);
        welcome.setText(String.format(getResources().getString(R.string.welcome),name));

        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}