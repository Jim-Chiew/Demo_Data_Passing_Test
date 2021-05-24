package sg.edu.rp.c346.id20004713.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvAnswer;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswer = findViewById(R.id.tvAnswer2);
        Intent intentAnswer = getIntent();
        int answer = intentAnswer.getIntExtra("value", 0);
        tvAnswer.setText("Integer value received is: " + answer);
    }
}