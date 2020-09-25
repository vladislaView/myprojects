package com.example.administrator.englishduo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.*;

import java.util.Random;


public class GameActivity extends Activity implements View.OnClickListener{
    // Ресурсы:
    String[] turizmEng = {"Where is the parking lot, please? ",
            "Do you know where I can get a taxi? ",
            "Is this seat free? ", "Tickets, please ",
            "How can I get to the railway station? ",
            "One ticket to London, please ", "I have two luggage pieces. ",
            "I'd like a lower berth. ",
            "How can I go to the platform? ", "When does the check-in begin? "
    };
    String[] turizmRus = {"Где находится парковка?",
            "Вы не знаете, где можно поймать такси?", "Это место свободно?",
            "Билеты, пожалуйста", "Как мне добраться до железнодорожного вокзала?",
            "Один билет до Лондона, пожалуйста.", "Мой багаж состоит из двух сумок",
            "Я хотел бы место на нижней полке.", "Как мне добраться до платформы",
            "Когда начинается регистрация?"

    };
    String[] besedaEng = {
            "This soup is very tasty", "They are our neighbours. ",
            "I am going to travel round the world. ",
            "Linda likes collecting postcards. ",
            "Boris is not at home. ", "Do you agree with this statement? ",
            "Can you stay here? ", "Why are your clothes so dirty? ",
            "Where did they live in 2009? ", "How can you trust her? "
    };
    String[] besedaRus = {
            "Этот суп очень вкусный.", "Они наши соседи.",
            "Я собираюсь совершить кругосветное путешествие.",
            "Линде нравится коллекционировать открытки.", "Бориса нет дома.",
            "Вы согласны с этим утверждением?", "Вы можете остаться здесь?",
            "Почему твоя одежда такая грязная?", "Где они жили в 2009?",
            "Как ты можешь доверять ей?"
    };
    String[] worckEng = {
            "I can do it. ", "She finished her work yesterday. ",
            "Hе bought quіtе a fеw sharеs. ", "Shе found such a good job. ",
            "Jack іs a good workеr. ", "Іs hе workіng now? ",
            "І dіdn't call hіm bеcausе І thought hе was busy. ",
            "Goods іn thіs shop arе not as еxpеnsіvе as іn that onе. ",
            "І am surе you wіll copе wіth іt. ",
            "І am vеry tіrеd. І slеpt badly last nіght. "
    };
    String[] worckRus = {
            "Я могу сделать это.", "Она вчера закончила свою работу. ",
            "Oн купил дoвoльнo мнoгo aкций.", "Oнa нaшлa тaкую хoрoшую рaбoту.",
            "Джек - хoрoший рaбoтник.", "Oн сейчaс рaбoтaет?",
            "Я не пoзвoнил ему, пoтoму чтo думaл, чтo oн зaнят.",
            "Тoвaры в этoм мaгaзине не тaкие дoрoгие, кaк в тoм.",
            "Я уверен, ты с ним спрaвишься.",
            "Я oчень устaл. Я плoхo спaл вчерa нoчью."
    };
    String[] marazineEng = {
            "Can I help you? ", "No, I'm just looking. ", "What can I do for you? ",
            "Buy two for the price of one. ", "How many would you like? ", "What size do you take? ",
            "Would you like to try it on? ", "The fitting room is over there.", "The dress suits you very well. ",
            "It's great! I like it. "
    };
    String[] marazineRus = {
            "Я могу вам помочь?", "Нет, спасибо, я хочу только посмотреть.", "Чем могу вам помочь?",
            "Купите два по цене одного.", "Сколько вы хотите?", "Какой размер вы носите?",
            "Хотите померить?", "Примерочная вон там.", "Это платье вам очень идет.", "Это здорово. Мне это нравится."

    };
    String[] parentEng = {"She is married. ", "Are you married? ", "They are engaged. ",
            "Do you have children? ",
            "Yes, I have two kids. ", "They are twins. ",
            "She is a widow. ", "He is a bachelor. ", "When were you born? ", "He is twice as old as I am."};
    String[] parentRus = {"Она замужем.", "Ты замужем?", "Они помолвлены.",
            "У тебя есть дети?",
            "Да, у меня двое детей.", "Они близнецы.",
            "Она вдова.", "Он холостяк.", "Когда ты родился?", "Он вдвое старше меня."};

    int numberVopr = 0;
    int kolvoprav = 0;
    String tema = "";
    TextView textvopr;
    TextView textotv;
    GridLayout panel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Intent intent = getIntent();
        textvopr = (TextView) findViewById(R.id.Vopros);
        textotv = (TextView) findViewById(R.id.Otvet);
        textotv.setText("");
        panel = (GridLayout) findViewById(R.id.Panel);
        //Выбор темы
        if(intent.getStringExtra("turizm") != null){
        tema = "turizm";
        textvopr.setText(turizmRus[0]);
        String split = " ";
        String[] text = turizmEng[0].split(split);
        Random rnd = new Random();
        //Перемешивание массива
            for (int i = 0; i < text.length; i++) {
                int rand = rnd.nextInt(i + 1);
                String temp = text[i];
                text[i] = text[rand];
                text[rand] = temp;

            }
            //Динамическое добавление кнопок
            for (int i = 0; i < text.length; i++) {
                Button but = new Button(this);
                but.setText(text[i]);
                but.setOnClickListener(this);
                but.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                but.setGravity(Gravity.CENTER_HORIZONTAL);
                but.setHeight(ViewGroup.LayoutParams.MATCH_PARENT);
                but.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
                GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                params.setGravity(Gravity.FILL);
                params.width = ViewGroup.LayoutParams.WRAP_CONTENT;
                params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
                but.setLayoutParams(params);
                panel.addView(but);
            }
        }
        else if(intent.getStringExtra("beseda") != null){
            tema = "beseda";
            textvopr.setText(besedaRus[0]);
            String split = " ";
            String[] text = besedaEng[0].split(split);
            Random rnd = new Random();
            for (int i = 0; i < text.length; i++) {
                int rand = rnd.nextInt(i + 1);
                String temp = text[i];
                text[i] = text[rand];
                text[rand] = temp;

            }
            for (int i = 0; i < text.length; i++) {
                Button but = new Button(this);
                but.setText(text[i]);
                but.setOnClickListener(this);
                but.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                but.setGravity(Gravity.CENTER_HORIZONTAL);
                but.setHeight(ViewGroup.LayoutParams.MATCH_PARENT);
                but.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
                GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                params.setGravity(Gravity.FILL);
                params.width = ViewGroup.LayoutParams.WRAP_CONTENT;
                params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
                but.setLayoutParams(params);
                panel.addView(but);
            }
        }
        else if(intent.getStringExtra("proffection")!= null){
            tema = "proffection";
            textvopr.setText(worckRus[0]);
            String split = " ";
            String[] text = worckEng[0].split(split);
            Random rnd = new Random();
            for (int i = 0; i < text.length; i++) {
                int rand = rnd.nextInt(i + 1);
                String temp = text[i];
                text[i] = text[rand];
                text[rand] = temp;
            }

            for (int i = 0; i < text.length; i++) {
                Button but = new Button(this);
                but.setText(text[i]);
                but.setOnClickListener(this);
                but.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                but.setGravity(Gravity.CENTER_HORIZONTAL);
                but.setHeight(ViewGroup.LayoutParams.MATCH_PARENT);
                but.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
                GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                params.setGravity(Gravity.FILL);
                params.width = ViewGroup.LayoutParams.WRAP_CONTENT;
                params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
                but.setLayoutParams(params);
                panel.addView(but);
            }

        }
        else if(intent.getStringExtra("market")!= null){
            tema = "market";
            textvopr.setText(marazineRus[0]);
            String split = " ";
            String[] text = marazineEng[0].split(split);
            Random rnd = new Random();
            for (int i = 0; i < text.length; i++) {
                int rand = rnd.nextInt(i + 1);
                String temp = text[i];
                text[i] = text[rand];
                text[rand] = temp;

            }
            for (int i = 0; i < text.length; i++) {
                Button but = new Button(this);
                but.setText(text[i]);
                but.setOnClickListener(this);
                but.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                but.setGravity(Gravity.CENTER_HORIZONTAL);
                but.setHeight(ViewGroup.LayoutParams.MATCH_PARENT);
                but.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
                GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                params.setGravity(Gravity.FILL);
                params.width = ViewGroup.LayoutParams.WRAP_CONTENT;
                params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
                but.setLayoutParams(params);
                panel.addView(but);
            }

        }
        else if(intent.getStringExtra("family")!= null){
            tema = "family";
            textvopr.setText(parentRus[0]);
            String split = " ";
            String[] text = parentEng[0].split(split);
            Random rnd = new Random();
            for (int i = 0; i < text.length; i++) {
                int rand = rnd.nextInt(i + 1);
                String temp = text[i];
                text[i] = text[rand];
                text[rand] = temp;

            }

            for (int i = 0; i < text.length; i++) {
                Button but = new Button(this);
                but.setText(text[i]);
                but.setOnClickListener(this);
                but.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                but.setGravity(Gravity.CENTER_HORIZONTAL);
                but.setHeight(ViewGroup.LayoutParams.MATCH_PARENT);
                but.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
                GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                params.setGravity(Gravity.FILL);
                params.width = ViewGroup.LayoutParams.WRAP_CONTENT;
                params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
                but.setLayoutParams(params);
                panel.addView(but);
            }

        }

    }
    public void OnClickCled(View v){
        String otv = String.valueOf(textotv.getText());
        String vopr = String.valueOf(textvopr.getText());
        switch (tema) {
            case "turizm": {
                if (otv.equals(turizmEng[numberVopr])) { kolvoprav++; }
            }
            case "beseda":{
                if (otv.equals(besedaEng[numberVopr])) { kolvoprav++; }
            }
            case "proffection":{
                if (otv.equals(worckEng[numberVopr])) { kolvoprav++; }
            }
            case "market":{
                if (otv.equals(marazineEng[numberVopr])) { kolvoprav++; }
            }
            case "family":{
                if (otv.equals(parentEng[numberVopr])) { kolvoprav++; }
            }
        }
        numberVopr++;
        textotv.setText("");
        SledVopros();
    }
    public void SledVopros(){
        if (numberVopr > 9) {
            CharSequence charSequence = "Вы ответили на " + kolvoprav + " из 10";
            Toast toast = Toast.makeText(this, charSequence,Toast.LENGTH_LONG);
            toast.show();
            startActivity(new Intent(this,MainActivity.class));
            return;
        }
        switch (tema) {
            case "turizm": {
                textvopr.setText(turizmRus[numberVopr]);
                String split = " ";
                String[] text = turizmEng[numberVopr].split(split);
                Random rnd = new Random();
                for (int i = 0; i < text.length; i++) {
                    int rand = rnd.nextInt(i + 1);
                    String temp = text[i];
                    text[i] = text[rand];
                    text[rand] = temp;

                }
                for (int i = 0; i < text.length; i++) {
                    Button but = new Button(this);
                    but.setText(text[i]);
                    but.setOnClickListener(this);
                    but.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                    but.setGravity(Gravity.CENTER_HORIZONTAL);
                    but.setHeight(ViewGroup.LayoutParams.MATCH_PARENT);
                    but.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                    params.setGravity(Gravity.FILL);
                    params.width = ViewGroup.LayoutParams.WRAP_CONTENT;
                    params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
                    but.setLayoutParams(params);
                    panel.addView(but);
                }
            }break;
            case "beseda": {
                textvopr.setText(besedaRus[numberVopr]);
                String split = " ";
                String[] text = besedaEng[numberVopr].split(split);
                Random rnd = new Random();
                for (int i = 0; i < text.length; i++) {
                    int rand = rnd.nextInt(i + 1);
                    String temp = text[i];
                    text[i] = text[rand];
                    text[rand] = temp;

                }

                for (int i = 0; i < text.length; i++) {
                    Button but = new Button(this);
                    but.setText(text[i]);
                    but.setOnClickListener(this);
                    but.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                    but.setGravity(Gravity.CENTER_HORIZONTAL);
                    but.setHeight(ViewGroup.LayoutParams.MATCH_PARENT);
                    but.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                    params.setGravity(Gravity.FILL);
                    params.width = ViewGroup.LayoutParams.WRAP_CONTENT;
                    params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
                    but.setLayoutParams(params);
                    panel.addView(but);
                }

            }break;
            case "proffection": {
                textvopr.setText(worckRus[numberVopr]);
                String split = " ";
                String[] text = worckEng[numberVopr].split(split);
                Random rnd = new Random();
                for (int i = 0; i < text.length; i++) {
                    int rand = rnd.nextInt(i + 1);
                    String temp = text[i];
                    text[i] = text[rand];
                    text[rand] = temp;

                }

                for (int i = 0; i < text.length; i++) {
                    Button but = new Button(this);
                    but.setText(text[i]);
                    but.setOnClickListener(this);
                    but.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                    but.setGravity(Gravity.CENTER_HORIZONTAL);
                    but.setHeight(ViewGroup.LayoutParams.MATCH_PARENT);
                    but.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                    params.setGravity(Gravity.FILL);
                    params.width = ViewGroup.LayoutParams.WRAP_CONTENT;
                    params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
                    but.setLayoutParams(params);
                    panel.addView(but);
                }

            }break;
            case "market": {
                textvopr.setText(marazineRus[numberVopr]);
                String split = " ";
                String[] text = marazineEng[numberVopr].split(split);
                Random rnd = new Random();
                for (int i = 0; i < text.length; i++) {
                    int rand = rnd.nextInt(i + 1);
                    String temp = text[i];
                    text[i] = text[rand];
                    text[rand] = temp;

                }

                for (int i = 0; i < text.length; i++) {
                    Button but = new Button(this);
                    but.setText(text[i]);
                    but.setOnClickListener(this);
                    but.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                    but.setGravity(Gravity.CENTER_HORIZONTAL);
                    but.setHeight(ViewGroup.LayoutParams.MATCH_PARENT);
                    but.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                    params.setGravity(Gravity.FILL);
                    params.width = ViewGroup.LayoutParams.WRAP_CONTENT;
                    params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
                    but.setLayoutParams(params);
                    panel.addView(but);
                }

            }break;
            case "family": {
                textvopr.setText(parentRus[numberVopr]);
                String split = " ";
                String[] text = parentEng[numberVopr].split(split);
                Random rnd = new Random();
                for (int i = 0; i < text.length; i++) {
                    int rand = rnd.nextInt(i + 1);
                    String temp = text[i];
                    text[i] = text[rand];
                    text[rand] = temp;

                }
                for (int i = 0; i < text.length; i++) {
                    Button but = new Button(this);
                    but.setText(text[i]);
                    but.setOnClickListener(this);
                    but.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                    but.setGravity(Gravity.CENTER_HORIZONTAL);
                    but.setHeight(ViewGroup.LayoutParams.MATCH_PARENT);
                    but.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                    params.setGravity(Gravity.FILL);
                    params.width = ViewGroup.LayoutParams.WRAP_CONTENT;
                    params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
                    but.setLayoutParams(params);
                    panel.addView(but);
                }
            }break; }
            }
    public void OnClickOtmena(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void onClick(View view){
        Button but = (Button) view;
        String ishodntext = String.valueOf(textotv.getText());
        String text = String.valueOf(but.getText());
        textotv.setText(ishodntext + text + " ");
        but.setVisibility(View.GONE);
        panel.removeViewInLayout(but);

    }
}
