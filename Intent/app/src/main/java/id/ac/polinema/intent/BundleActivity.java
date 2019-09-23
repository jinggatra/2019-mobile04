package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BundleActivity extends AppCompatActivity {

    public static final String VALUE1_KEY = "value1";
    public static final String VALUE2_KEY = "value2";

    private EditText value1Input;
    private EditText value2Input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);
        value1Input = findViewById(R.id.input_value1);
        value2Input = findViewById(R.id.input_value2);
    }

    public void handleSubmit(View view) {
//        String value1 = value1Input.getText().toString();
//        String value2 = value2Input.getText().toString();
        int value1 = Integer.parseInt(value1Input.getText().toString());
        int value2 = Integer.parseInt(value2Input.getText().toString());

        Intent intent = new Intent(this, ProfileBundleActivity.class);

        intent.putExtra(VALUE1_KEY, value1);
        intent.putExtra(VALUE2_KEY, value2);

        startActivity(intent);
    }
}