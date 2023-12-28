package ao.rafaelmarcos.avaliaointents.message;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;

import ao.rafaelmarcos.avaliaointents.R;

public class MessageGetterActivity extends AppCompatActivity {
    public final static int REQUEST_CODE = 42;

    private TextView message;
    private Button getButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_getter);

        message = findViewById(R.id.message);

        getButton = findViewById(R.id.get_button);
        getButton.setOnClickListener((v)->{
            Intent i = new Intent(this, MessageSetterActivity.class);
            //Deprecated
            startActivityForResult(i, MessageGetterActivity.REQUEST_CODE);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == MessageGetterActivity.REQUEST_CODE &&
                resultCode == AppCompatActivity.RESULT_OK){
            message.setText(data.getStringExtra(MessageSetterActivity.MESSAGE));
        }
    }
}