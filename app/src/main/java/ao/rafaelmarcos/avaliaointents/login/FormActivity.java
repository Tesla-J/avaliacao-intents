package ao.rafaelmarcos.avaliaointents.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import android.content.Intent;

import ao.rafaelmarcos.avaliaointents.R;

public class FormActivity extends AppCompatActivity {
    public static final String USERNAME = "username";
    private final String DEFAULT_PASSWORD = "Durdenatch$";

    private EditText username, password;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        button = findViewById(R.id.login_button);

        // onclick listener
        button.setOnClickListener((v) -> {
            Intent i = new Intent(this, WelcomeActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString(FormActivity.USERNAME, username.getText().toString());

            String pass = password.getText().toString();
            if(pass.equals(DEFAULT_PASSWORD)){
                i.putExtras(bundle);
                startActivity(i);
            }
            else{
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage(R.string.wrong_password_message);
                builder.setTitle(R.string.wrond_password_title);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
}