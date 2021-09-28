package com.yourick.hiduck;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Group;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView i1,i2,i3,i32,i31;
    TextView t1,t2,t3;

    ImageView ia1,ia2,ia3;
    TextView ta1,ta2,ta3;

    int answ, wrong1,wrong2;
    boolean wr1,wr2,wr3 = false;
    TextView ok;
    ImageView s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
    int score=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i1=findViewById(R.id.imageView1);
        i2=findViewById(R.id.imageView2);
        i3=findViewById(R.id.imageView3);
        i31=findViewById(R.id.imageView31);
        i32=findViewById(R.id.imageView32);

        t1=findViewById(R.id.textView1);
        t2=findViewById(R.id.textView2);
        t3=findViewById(R.id.textView3);

        ia1=findViewById(R.id.imageViewA1);
        ia2=findViewById(R.id.imageViewA2);
        ia3=findViewById(R.id.imageViewA3);

        ta1=findViewById(R.id.tvAnsw1);
        ta2=findViewById(R.id.tvAnsw2);
        ta3=findViewById(R.id.tvAnsw3);

        ok=findViewById(R.id.tvOk); // текст ответа верно/неверно
        ok.setVisibility(View.GONE);

        s1=findViewById(R.id.s1);
        s2=findViewById(R.id.s2);
        s3=findViewById(R.id.s3);
        s4=findViewById(R.id.s4);
        s5=findViewById(R.id.s5);
        s6=findViewById(R.id.s6);
        s7=findViewById(R.id.s7);
        s8=findViewById(R.id.s8);
        s9=findViewById(R.id.s9);
        s10=findViewById(R.id.s10);
        s1.setVisibility(View.INVISIBLE);
        s2.setVisibility(View.INVISIBLE);
        s3.setVisibility(View.INVISIBLE);
        s4.setVisibility(View.INVISIBLE);
        s5.setVisibility(View.INVISIBLE);
        s6.setVisibility(View.INVISIBLE);
        s7.setVisibility(View.INVISIBLE);
        s8.setVisibility(View.INVISIBLE);
        s9.setVisibility(View.INVISIBLE);
        s10.setVisibility(View.INVISIBLE);
        go();
    }

    @SuppressLint("SetTextI18n")
    private void go() {
    setImage();
    whatScore();
        wr1=false;
        wr2=false;
        wr3=false;
        Random r = new Random();
        int i1 = r.nextInt(5)+1;
        int i2 = r.nextInt(5)+1;


        t1.setText("=" +i1);
        t2.setText("=" +i2);
        t3.setText("= ");

        answ = i1+i2;

            wrong1=r.nextInt(9)+1; //неправильные ответы
            wrong2=r.nextInt(9)+1;
                if(wrong1==wrong2){       // 4 иф сни3у , что бы не повторялись цифры в ответе
                    wrong2++;
                }
                if(wrong1==answ){
                    wrong1++;
                }
                if(wrong2==answ){
                    wrong2++;
                }
                if(wrong1==wrong2){
                    wrong2++;
                }

        int g = r.nextInt(3); // переменная по3иции правильного ответа
        switch (g){
            case 0:
                ta1.setText("= " +answ);
                ta2.setText("= " +wrong1);
                ta3.setText("= " +wrong2);
                wr1= true;
                break;
            case 1:
                ta1.setText("= " +wrong1);
                ta2.setText("= " +answ);
                ta3.setText("= " +wrong2);
                wr2= true;
                break;
            case 2:
                ta1.setText("= " +wrong1);
                ta2.setText("= " +wrong2);
                ta3.setText("= " +answ);
                wr3= true;
                break;
        }
    }

    private void whatScore() {
        switch (score){
            case 0:
                break;
            case 1:
                break;
            case 2: s1.setVisibility(View.VISIBLE);
                s2.setVisibility(View.INVISIBLE);
                s3.setVisibility(View.INVISIBLE);
                s4.setVisibility(View.INVISIBLE);
                s5.setVisibility(View.INVISIBLE);
                s6.setVisibility(View.INVISIBLE);
                s7.setVisibility(View.INVISIBLE);
                s8.setVisibility(View.INVISIBLE);
                s9.setVisibility(View.INVISIBLE);
                s10.setVisibility(View.INVISIBLE);
                break;
            case 3:
                break;
            case 4: s1.setVisibility(View.VISIBLE);
                s2.setVisibility(View.VISIBLE);
                s3.setVisibility(View.INVISIBLE);
                s4.setVisibility(View.INVISIBLE);
                s5.setVisibility(View.INVISIBLE);
                s6.setVisibility(View.INVISIBLE);
                s7.setVisibility(View.INVISIBLE);
                s8.setVisibility(View.INVISIBLE);
                s9.setVisibility(View.INVISIBLE);
                s10.setVisibility(View.INVISIBLE);
                break;
            case 5:
                break;
            case 6: s1.setVisibility(View.VISIBLE);
                s2.setVisibility(View.VISIBLE);
                s3.setVisibility(View.VISIBLE);
                s4.setVisibility(View.INVISIBLE);
                s5.setVisibility(View.INVISIBLE);
                s6.setVisibility(View.INVISIBLE);
                s7.setVisibility(View.INVISIBLE);
                s8.setVisibility(View.INVISIBLE);
                s9.setVisibility(View.INVISIBLE);
                s10.setVisibility(View.INVISIBLE);
                break;
            case 7:
                break;
            case 8: s1.setVisibility(View.VISIBLE);
                s2.setVisibility(View.VISIBLE);
                s3.setVisibility(View.VISIBLE);
                s4.setVisibility(View.VISIBLE);
                s5.setVisibility(View.INVISIBLE);
                s6.setVisibility(View.INVISIBLE);
                s7.setVisibility(View.INVISIBLE);
                s8.setVisibility(View.INVISIBLE);
                s9.setVisibility(View.INVISIBLE);
                s10.setVisibility(View.INVISIBLE);
                break;
            case 9:
                break;
            case 10: s1.setVisibility(View.VISIBLE);
                s2.setVisibility(View.VISIBLE);
                s3.setVisibility(View.VISIBLE);
                s4.setVisibility(View.VISIBLE);
                s5.setVisibility(View.VISIBLE);
                s6.setVisibility(View.INVISIBLE);
                s7.setVisibility(View.INVISIBLE);
                s8.setVisibility(View.INVISIBLE);
                s9.setVisibility(View.INVISIBLE);
                s10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                break;
            case 12: s1.setVisibility(View.VISIBLE);
                s2.setVisibility(View.VISIBLE);
                s3.setVisibility(View.VISIBLE);
                s4.setVisibility(View.VISIBLE);
                s5.setVisibility(View.VISIBLE);
                s6.setVisibility(View.VISIBLE);
                s7.setVisibility(View.INVISIBLE);
                s8.setVisibility(View.INVISIBLE);
                s9.setVisibility(View.INVISIBLE);
                s10.setVisibility(View.INVISIBLE);
                break;
            case 13:
                break;
            case 14: s1.setVisibility(View.VISIBLE);
                s2.setVisibility(View.VISIBLE);
                s3.setVisibility(View.VISIBLE);
                s4.setVisibility(View.VISIBLE);
                s5.setVisibility(View.VISIBLE);
                s6.setVisibility(View.VISIBLE);
                s7.setVisibility(View.VISIBLE);
                s8.setVisibility(View.INVISIBLE);
                s9.setVisibility(View.INVISIBLE);
                s10.setVisibility(View.INVISIBLE);
                break;
            case 15:
                break;
            case 16: s1.setVisibility(View.VISIBLE);
                s2.setVisibility(View.VISIBLE);
                s3.setVisibility(View.VISIBLE);
                s4.setVisibility(View.VISIBLE);
                s5.setVisibility(View.VISIBLE);
                s6.setVisibility(View.VISIBLE);
                s7.setVisibility(View.VISIBLE);
                s8.setVisibility(View.VISIBLE);
                s9.setVisibility(View.INVISIBLE);
                s10.setVisibility(View.INVISIBLE);
                break;
            case 17:
                break;
            case 18: s1.setVisibility(View.VISIBLE);
                s2.setVisibility(View.VISIBLE);
                s3.setVisibility(View.VISIBLE);
                s4.setVisibility(View.VISIBLE);
                s5.setVisibility(View.VISIBLE);
                s6.setVisibility(View.VISIBLE);
                s7.setVisibility(View.VISIBLE);
                s8.setVisibility(View.VISIBLE);
                s9.setVisibility(View.VISIBLE);
                s10.setVisibility(View.INVISIBLE);
                break;
            case 19:
                break;
            case 20: s1.setVisibility(View.VISIBLE);
                s2.setVisibility(View.VISIBLE);
                s3.setVisibility(View.VISIBLE);
                s4.setVisibility(View.VISIBLE);
                s5.setVisibility(View.VISIBLE);
                s6.setVisibility(View.VISIBLE);
                s7.setVisibility(View.VISIBLE);
                s8.setVisibility(View.VISIBLE);
                s9.setVisibility(View.VISIBLE);
                s10.setVisibility(View.VISIBLE);
                break;

        }

    }

    private void setImage() { // какие картинки будут
        Random imageRand = new Random();
        int i = imageRand.nextInt(3);
        switch (i){
            case 0:
                i1.setImageResource(R.drawable.duck);
                i2.setImageResource(R.drawable.mouse);
                i3.setImageResource(R.drawable.rabbit);

                i31.setImageResource(R.drawable.duck);
                i32.setImageResource(R.drawable.mouse);

                ia1.setImageResource(R.drawable.rabbit);
                ia2.setImageResource(R.drawable.rabbit);
                ia3.setImageResource(R.drawable.rabbit);
                break;
            case 1:
                i1.setImageResource(R.drawable.duck);
                i2.setImageResource(R.drawable.rabbit);
                i3.setImageResource(R.drawable.mouse);

                i31.setImageResource(R.drawable.duck);
                i32.setImageResource(R.drawable.rabbit);

                ia1.setImageResource(R.drawable.mouse);
                ia2.setImageResource(R.drawable.mouse);
                ia3.setImageResource(R.drawable.mouse);
                break;
            case 2:
                i1.setImageResource(R.drawable.rabbit);
                i2.setImageResource(R.drawable.mouse);
                i3.setImageResource(R.drawable.duck);

                i31.setImageResource(R.drawable.mouse);
                i32.setImageResource(R.drawable.rabbit);

                ia1.setImageResource(R.drawable.duck);
                ia2.setImageResource(R.drawable.duck);
                ia3.setImageResource(R.drawable.duck);
                break;
        }
    }

    public void onClickA1(View view) {
        if(score>20){
            Intent i = new Intent(MainActivity.this, VideoActivity.class);
            startActivity(i);
        }
        if(wr1){
            ok.setVisibility(View.VISIBLE);
            ok.setText( "Правильно !" );
            ok.setTextColor(Color.parseColor("#5AFF21"));
            score++;
            go();
        }else {
            ok.setVisibility(View.VISIBLE);
            ok.setText( "Неверно");
            ok.setTextColor(Color.parseColor("#FF0000"));

        }
    }

    public void onClickA2(View view) {
        if(score>20){
            Intent i = new Intent(MainActivity.this, VideoActivity.class);
            startActivity(i);
        }
        if(wr2){
            ok.setVisibility(View.VISIBLE);
            ok.setText( "Правильно !");
            ok.setTextColor(Color.parseColor("#5AFF21"));
            score++;
            go();
        }else {
            ok.setVisibility(View.VISIBLE);
            ok.setText( "Неверно");
            ok.setTextColor(Color.parseColor("#FF0000"));

        }
    }

    public void onClickA3(View view) {
        if(score>20){
            Intent i = new Intent(MainActivity.this, VideoActivity.class);
            startActivity(i);
        }
        if(wr3){
            ok.setVisibility(View.VISIBLE);
            ok.setText( "Правильно !");
            ok.setTextColor(Color.parseColor("#5AFF21"));
            score++;
            go();
        }else {
            ok.setVisibility(View.VISIBLE);
            ok.setText( "Неверно");
            ok.setTextColor(Color.parseColor("#FF0000"));

        }
    }
}