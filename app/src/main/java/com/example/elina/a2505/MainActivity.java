package com.example.elina.a2505;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ege;
    Button var;
    Button tests;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView ege = (TextView) findViewById(R.id.ege);
        Button var = (Button) findViewById(R.id.var);
        var.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent varr = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(varr);
            }
        });
        Button tests = (Button) findViewById(R.id.tests);
        tests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent test = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(test);
            }
        });
    }
}
