package com.example.elina.a2505;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    String[] arr2 = {"Вариант 1", "Вариант 2", "Вариант 3", "Вариант 4", "Вариант 5", "Вариант 6" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView lv2Main = (ListView)findViewById(R.id.lv2);
        final TextView txt2 = (TextView)findViewById(R.id.txt2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,arr2);
        lv2Main.setAdapter(adapter);
        lv2Main.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0: Intent intent1 = new Intent(getApplicationContext(),var1.class);
                        startActivity(intent1);
                        break;
                    case 1: Intent intent2 = new Intent(getApplicationContext(),var2.class);
                        startActivity(intent2);
                        break;
                    case 2: Intent intent3 = new Intent(getApplicationContext(),var3.class);
                        startActivity(intent3);
                        break;
                    case 3: Intent intent4 = new Intent(getApplicationContext(),var4.class);
                        startActivity(intent4);
                        break;
                    case 4: Intent intent5 = new Intent(getApplicationContext(),var5.class);
                        startActivity(intent5);
                        break;
                    case 5: Intent intent6 = new Intent(getApplicationContext(),var6.class);
                        startActivity(intent6);
                        break;
                }


            }

        });
    }
}
