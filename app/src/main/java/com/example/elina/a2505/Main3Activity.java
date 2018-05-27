package com.example.elina.a2505;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    String[] arr = {"Вычисления", "Преобразования выражений",  "Задачи на смекалку", "Простейшие текстовые задачи", "Анализ утверждений", "Числа и их свойства" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ListView lvMain = (ListView)findViewById(R.id.lv);
        final TextView txt = (TextView)findViewById(R.id.txt);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,arr);
        lvMain.setAdapter(adapter);
        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0: Intent intent1 = new Intent(getApplicationContext(),Main5Activity.class);
                        startActivity(intent1);
                        break;
                    case 1: Intent intent2 = new Intent(getApplicationContext(),Theme2.class);
                        startActivity(intent2);
                        break;
                    case 2: Intent intent3 = new Intent(getApplicationContext(),Theme3.class);
                        startActivity(intent3);
                        break;
                    case 3: Intent intent4 = new Intent(getApplicationContext(),Theme4.class);
                        startActivity(intent4);
                        break;
                    case 4: Intent intent5 = new Intent(getApplicationContext(),Theme5.class);
                        startActivity(intent5);
                        break;
                    case 5: Intent intent6 = new Intent(getApplicationContext(),Theme6.class);
                        startActivity(intent6);
                        break;
                }


            }

        });
    }
}
