package com.example.administrator.englishduo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{
    Button turizm;
    Button beseda;
    Button prof;
    Button market;
    Button family;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        turizm = (Button) findViewById(R.id.button);
        turizm.setOnClickListener(this);
        beseda = (Button) findViewById(R.id.button2);
        beseda.setOnClickListener(this);
        prof = (Button) findViewById(R.id.button3);
        prof.setOnClickListener(this);
        market = (Button) findViewById(R.id.button4);
        market.setOnClickListener(this);
        family = (Button) findViewById(R.id.button5);
        family.setOnClickListener(this);
    }
    public void onClick(View v){
        Intent intent = new Intent(this,GameActivity.class);
        switch (v.getId()){
            case R.id.button:{
               intent.putExtra("turizm","turizm");
                break;
            }
            case R.id.button2:{
                intent.putExtra("beseda","beseda");
                break;
            }
            case R.id.button3:{
                intent.putExtra("proffection","proffection");
                break;
            }
            case R.id.button4:{
                intent.putExtra("market","market");
                break;
            }
            case R.id.button5:{
                intent.putExtra("family","family");
                break;
            }
        }
        startActivity(intent);
    }

}
