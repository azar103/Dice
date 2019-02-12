package com.zarrouk.anis.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class NextActivity extends AppCompatActivity {
    String diceValue;
    TextView mTitleText;
    TextView mValueText;
    Button mPlayBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        diceValue = getIntent().getStringExtra(MainActivity.VALUE_EXTRA);
        mTitleText = (TextView)findViewById(R.id.activity_next_title_text);
        mTitleText.setText("Dé à "+diceValue+" faces");
        mValueText = (TextView)findViewById(R.id.activity_next_randomValue_text);
        //obtenir un nombre par hasard
        this.generateValue();
        //generer le nombre
        this.randomNumberLaunched();

        mValueText.setText("");
    }

    private void randomNumberLaunched() {
        mPlayBtn = (Button)findViewById(R.id.activity_next_generate_btn);
        mPlayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateValue();
            }
        });

    }

    private void generateValue() {
        Random rand = new Random();
        int number = rand.nextInt(Integer.parseInt(diceValue));
        mValueText.setText(Integer.toString(number));
    }





}
