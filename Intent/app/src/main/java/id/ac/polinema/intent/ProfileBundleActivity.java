package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProfileBundleActivity extends AppCompatActivity {

    private TextView valueText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);

        // TODO: bind here

        Bundle extras = getIntent().getExtras();

        int value1 = extras.getInt(BundleActivity.VALUE1_KEY);
        int value2 = extras.getInt(BundleActivity.VALUE2_KEY);

        int sum = value1 * value2;

        valueText = findViewById(R.id.text_value);

        if (extras != null) {
            // TODO: display value here
            valueText.setText(String.valueOf(sum));
        }
    }
}
