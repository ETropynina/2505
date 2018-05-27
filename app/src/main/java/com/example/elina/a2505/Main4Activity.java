package com.example.elina.a2505;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    TextView quoteText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent intent = getIntent();


        quoteText = findViewById(R.id.tv1);
        quoteText.setText(intent.getStringExtra("cc"));
    }
}
/*
 Intent mIntent= getIntent();
 int intValue = mIntent.getIntExtra("intVariableName", 0);

Bundle extras = new Bundle();
extras.putString("StringVariableName", intValue + "");
intent.putExtras(extras);
startActivity(intent);

Bundle extras = getIntent().getExtras();
   String stringVariableName = extras.getString("StringVariableName");
   int intVariableName = Integer.parseInt(stringVariableName);
 */