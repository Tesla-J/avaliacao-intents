package ao.rafaelmarcos.avaliaointents.message;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import ao.rafaelmarcos.avaliaointents.R;

public class MessageSetterActivity extends AppCompatActivity {
    public final static String MESSAGE = "message";

    private EditText messageInput;
    private Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_setter);

        messageInput = findViewById(R.id.message_input);

        sendButton = findViewById(R.id.send_button);
        sendButton.setOnClickListener((v)->{
            Intent i = new Intent();
            i.putExtra(MessageSetterActivity.MESSAGE, messageInput.getText().toString());
            setResult(AppCompatActivity.RESULT_OK, i);
            finish();
        });
    }
}