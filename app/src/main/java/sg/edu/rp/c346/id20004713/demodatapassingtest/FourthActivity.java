package sg.edu.rp.c346.id20004713.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    TextView tvAnswer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvAnswer4 = findViewById(R.id.tvAnswer4);
        Intent intentAnswer = getIntent();
        double answer3 = intentAnswer.getDoubleExtra("value3", 0.0);
        tvAnswer4.setText("Character value received is: " + answer3);
    }
}