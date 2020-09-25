package com.example.vlad.bolyas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity implements View.OnClickListener{
	String[] voprosi = {"Пейн является главой Акацуки?","Какаши состоял в Анбу?",
	"Первый хокаге Канохи был Тобирама Сенджу?",
	"Тоби был в одной команде с Какаши?",
	"Мадара Учиха погиб во время битвы с Хаширамой Сенджу?",
	"Саске вернулся в Каноху?","Мадара собрал всех хвостатых?","Тоби это Мадара Учиха?",
	"Саске хотел стать хокаге?",
	"Итачи Учиха один уничтожил свой клан?",
	"Первый Шаринган был у Мадары Учиха?",
	"Какаши получил шаринган от Обито Учиха?",
	"Тоби это Обито?","Саске состоял в Акацуки?",
	"Первый шаринган в аниме показали у Саске?",
	"Наруто стал хокаге?",
	"У Наруто и Саске был поцелуй?",
	"Был ли активирован вечный цукуеми?",
	"Первым владельцем чакры была Кагуя Ооцуцуки?",
	"Наруто был перерождением Индры?",
	"Владел ли Наруто кендзюцу?",
	"Владел ли Саске кендзюцу",
	"Саске был перерождением Индры Ооцуцуки?",
	"Технику Чидори изобрел Какши?","Технику бог грома изобрел Минто Намикадзе",
	"Саске владел техникой призыва?",
	"Наруто, Саске, Сакура состояли в команде номер 7?",
	"Кагуя Ооцуцуки с земли?",
	"Наруто и Нагато из одного клана?",
	"Автор Наруто Масаси Кисимото? "
	,"Саске состоял в Андзуки?"
	};

	boolean[] otvet = {true,true,false,true,false,
	true,true,false,true,false,
	false,true,true,true,false,
	true,true,true,true,false,
	false,true,true,true,false,
	true,true,false,true,true
	};
	TextView vopros;
	int numbervopr = 0;
	int pravkolvo = 0;
	Button but;
	Button but2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
		vopros = findViewById(R.id.textView2);
		vopros.setText(voprosi[numbervopr]);
		but = (Button) findViewById(R.id.yes);
		but.setOnClickListener(this);
		but2 = (Button) findViewById(R.id.no);
		but2.setOnClickListener(this);
    }



	public void onClick(View v) {
		if(numbervopr> 29){
			CharSequence charSequence = "Вы ответили на " + pravkolvo + " из 30";
			Toast toast = Toast.makeText(this, charSequence,Toast.LENGTH_LONG);
			toast.show();
			startActivity(new Intent(this,MainActivity.class));
			return;
		}
		switch (v.getId()) {
			case R.id.yes: {

				if(otvet[numbervopr]){
					pravkolvo++;
				}
                numbervopr++;
			}break;
			case R.id.no: {
				if(!otvet[numbervopr]){
					pravkolvo++;
				}

                numbervopr++;
			}break;
		}


		vopros.setText(voprosi[numbervopr]);


	}

}
