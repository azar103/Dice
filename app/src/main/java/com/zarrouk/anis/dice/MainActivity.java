package com.zarrouk.anis.dice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mButtonSixDice ;
    private  Button mButtonTwentyDice;
    String valueButton1;
    String valueButton2;
    public static final String VALUE_EXTRA = "value";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonSixDice = (Button)findViewById(R.id.activity_main_six_btn);
        mButtonTwentyDice = (Button)findViewById(R.id.activity_main_twenty_btn);
        mButtonSixDice.setOnClickListener(this);
        mButtonTwentyDice.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.activity_main_six_btn:
                Intent SixIntent = new Intent(MainActivity.this, NextActivity.class);
                SixIntent.putExtra(VALUE_EXTRA, "6");
                startActivity(SixIntent);
                break;
            case R.id.activity_main_twenty_btn:
                Intent TwentyIntent = new Intent(MainActivity.this, NextActivity.class);
                TwentyIntent.putExtra(VALUE_EXTRA, "20");
                startActivity(TwentyIntent);
                break;

        }

    }
}
