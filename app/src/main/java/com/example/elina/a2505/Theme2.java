package com.example.elina.a2505;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Theme2 extends AppCompatActivity {
    public int c = 0;
    String rightanswer1 = "6";
    String rightanswer2 = "11";
    String rightanswer3 = "12";
    String rightanswer4 = "2";
    String rightanswer5 = "7";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme2);}
    public void ClickButton(View v)
    {
        EditText editText1 = (EditText) findViewById(R.id.e1);
        final String result = editText1.getText().toString();

        if (result.equals(rightanswer1)){
            c = c + 1;
        }

        EditText editText2 = (EditText) findViewById(R.id.e2);
        final String result2 = editText2.getText().toString();

        if (result2.equals(rightanswer2)){
            c = c + 1;
        }
        EditText editText3 = (EditText) findViewById(R.id.e3);
        final String result3 = editText3.getText().toString();

        if (result3.equals(rightanswer3)){
            c = c + 1;
        }
        EditText editText4 = (EditText) findViewById(R.id.e4);
        final String result4 = editText4.getText().toString();

        if (result4.equals(rightanswer4)){
            c = c + 1;
        }
        EditText editText5 = (EditText) findViewById(R.id.e5);
        final String result5 = editText5.getText().toString();

        if (result5.equals(rightanswer5)){
            c = c + 1;
        }
        Button z = (Button) findViewById(R.id.z);
        z.setText("Узнать результат");
        z.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Main4Activity.class);
                intent.putExtra("cc", c + "");
                startActivity(intent);

            }
        });
    } }
