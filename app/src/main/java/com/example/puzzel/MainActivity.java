package com.example.puzzel;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.EGLExt;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button b[] = new Button[9];
    ArrayList arr= new ArrayList();
    int random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int min=0;
        int max=9;

        for (int i = 0;i<b.length;i++)
        {
            int id=getResources().getIdentifier("b"+i,"id",getPackageName());
            b[i]=findViewById(id);
            b[i].setOnClickListener(this);
        }

        for(int i=0;i<b.length;i++)
        {
            while (true) {
                random = new Random().nextInt(max - min) + min;
                if (!arr.contains(random)) {
                    arr.add(random);
                    b[i].setText(""+arr.get(i));
                    if(b[i].getText().toString().equals("0"))
                    {
                        b[i].setTextColor(getResources().getColor(android.R.color.transparent));
                    }
                    break;
                }
           }
        }

    }


    @Override
    public void onClick(View view) {

        for (int i = 0; i < b.length; i++)
        {
            if (view.getId() == b[0].getId()) {
                if (b[1].getText().toString().equals("0")) {
                    b[1].setText(b[0].getText().toString());
                    b[0].setText("0");
                    b[0].setTextColor(getResources().getColor(android.R.color.transparent));
                    b[1].setTextColor(getResources().getColor(R.color.white));
                }
                if (b[3].getText().toString().equals("0")) {
                    b[3].setText(b[0].getText().toString());
                    b[0].setText("0");
                    b[0].setTextColor(getResources().getColor(android.R.color.transparent));
                    b[3].setTextColor(getResources().getColor(R.color.white));
                }
            }
            if (view.getId() == b[1].getId()) {
                if (b[0].getText().toString().equals("0")) {
                    b[0].setText(b[1].getText().toString());
                    b[1].setText("0");
                    b[1].setTextColor(getResources().getColor(android.R.color.transparent));
                    b[0].setTextColor(getResources().getColor(R.color.white));
                }
                if (b[2].getText().toString().equals("0")) {
                    b[2].setText(b[1].getText().toString());
                    b[1].setText("0");
                    b[1].setTextColor(getResources().getColor(android.R.color.transparent));
                    b[2].setTextColor(getResources().getColor(R.color.white));
                }
                if (b[4].getText().toString().equals("0")) {
                    b[4].setText(b[1].getText().toString());
                    b[1].setText("0");
                    b[1].setTextColor(getResources().getColor(android.R.color.transparent));
                    b[4].setTextColor(getResources().getColor(R.color.white));
                }
            }
            if (view.getId() == b[2].getId()) {
                if (b[1].getText().toString().equals("0")) {
                    b[1].setText(b[2].getText().toString());
                    b[2].setText("0");
                    b[2].setTextColor(getResources().getColor(android.R.color.transparent));
                    b[1].setTextColor(getResources().getColor(R.color.white));
                }
                if (b[5].getText().toString().equals("0")) {
                    b[5].setText(b[2].getText().toString());
                    b[2].setText("0");
                    b[2].setTextColor(getResources().getColor(android.R.color.transparent));
                    b[5].setTextColor(getResources().getColor(R.color.white));
                }
            }
            if (view.getId() == b[3].getId()) {
                if (b[0].getText().toString().equals("0")) {
                    b[0].setText(b[3].getText().toString());
                    b[3].setText("0");
                    b[3].setTextColor(getResources().getColor(android.R.color.transparent));
                    b[0].setTextColor(getResources().getColor(R.color.white));
                }
                if (b[4].getText().toString().equals("0")) {
                    b[4].setText(b[3].getText().toString());
                    b[3].setText("0");
                    b[3].setTextColor(getResources().getColor(android.R.color.transparent));
                    b[4].setTextColor(getResources().getColor(R.color.white));
                }
                if (b[6].getText().toString().equals("0")) {
                    b[6].setText(b[3].getText().toString());
                    b[3].setText("0");
                    b[3].setTextColor(getResources().getColor(android.R.color.transparent));
                    b[6].setTextColor(getResources().getColor(R.color.white));
                }
            }
            if (view.getId() == b[4].getId()) {
                if (b[1].getText().toString().equals("0")) {
                    b[1].setText(b[4].getText().toString());
                    b[4].setText("0");
                    b[4].setTextColor(getResources().getColor(android.R.color.transparent));
                    b[1].setTextColor(getResources().getColor(R.color.white));
                }
                if (b[5].getText().toString().equals("0")) {
                    b[5].setText(b[4].getText().toString());
                    b[4].setText("0");
                    b[4].setTextColor(getResources().getColor(android.R.color.transparent));
                    b[5].setTextColor(getResources().getColor(R.color.white));
                }
                if (b[7].getText().toString().equals("0")) {
                    b[7].setText(b[4].getText().toString());
                    b[4].setText("0");
                    b[4].setTextColor(getResources().getColor(android.R.color.transparent));
                    b[7].setTextColor(getResources().getColor(R.color.white));
                }
                if (b[3].getText().toString().equals("0")) {
                    b[3].setText(b[4].getText().toString());
                    b[4].setText("0");
                    b[4].setTextColor(getResources().getColor(android.R.color.transparent));
                    b[3].setTextColor(getResources().getColor(R.color.white));
                }
            }
            if (view.getId() == b[5].getId()) {
                if (b[2].getText().toString().equals("0")) {
                    b[2].setText(b[5].getText().toString());
                    b[5].setText("0");
                    b[5].setTextColor(getResources().getColor(android.R.color.transparent));
                    b[2].setTextColor(getResources().getColor(R.color.white));
                }
                if (b[4].getText().toString().equals("0")) {
                    b[4].setText(b[5].getText().toString());
                    b[5].setText("0");
                    b[5].setTextColor(getResources().getColor(android.R.color.transparent));
                    b[4].setTextColor(getResources().getColor(R.color.white));
                }
                if (b[8].getText().toString().equals("0")) {
                    b[8].setText(b[5].getText().toString());
                    b[5].setText("0");
                    b[5].setTextColor(getResources().getColor(android.R.color.transparent));
                    b[8].setTextColor(getResources().getColor(R.color.white));
                }
            }
            if (view.getId() == b[6].getId()) {
                if (b[3].getText().toString().equals("0")) {
                    b[3].setText(b[6].getText().toString());
                    b[6].setText("0");
                    b[6].setTextColor(getResources().getColor(android.R.color.transparent));
                    b[3].setTextColor(getResources().getColor(R.color.white));
                }
                if (b[7].getText().toString().equals("0")) {
                    b[7].setText(b[6].getText().toString());
                    b[6].setText("0");
                    b[6].setTextColor(getResources().getColor(android.R.color.transparent));
                    b[7].setTextColor(getResources().getColor(R.color.white));
                }
            }
            if (view.getId() == b[7].getId()) {
                if (b[6].getText().toString().equals("0")) {
                    b[6].setText(b[7].getText().toString());
                    b[7].setText("0");
                    b[7].setTextColor(getResources().getColor(android.R.color.transparent));
                    b[6].setTextColor(getResources().getColor(R.color.white));
                }
                if (b[4].getText().toString().equals("0")) {
                    b[4].setText(b[7].getText().toString());
                    b[7].setText("0");
                    b[7].setTextColor(getResources().getColor(android.R.color.transparent));
                    b[4].setTextColor(getResources().getColor(R.color.white));
                }
                if (b[8].getText().toString().equals("0")) {
                    b[8].setText(b[7].getText().toString());
                    b[7].setText("0");
                    b[7].setTextColor(getResources().getColor(android.R.color.transparent));
                    b[8].setTextColor(getResources().getColor(R.color.white));
                }
            }
            if (view.getId() == b[8].getId()) {
                if (b[5].getText().toString().equals("0")) {
                    b[5].setText(b[8].getText().toString());
                    b[8].setText("0");
                    b[8].setTextColor(getResources().getColor(android.R.color.transparent));
                    b[5].setTextColor(getResources().getColor(R.color.white));
                }
                if (b[7].getText().toString().equals("0")) {
                    b[7].setText(b[8].getText().toString());
                    b[8].setText("0");
                    b[8].setTextColor(getResources().getColor(android.R.color.transparent));
                    b[7].setTextColor(getResources().getColor(R.color.white));
                }
            }

        }
        if(b[0].getText().toString().equals("1") && b[1].getText().toString().equals("2") && b[2].getText().toString().equals("3") && b[3].getText().toString().equals("4") && b[4].getText().toString().equals("5") && b[5].getText().toString().equals("6") && b[6].getText().toString().equals("7") && b[7].getText().toString().equals("8") && b[8].getText().toString().equals("0"))
        {
            System.out.println("player win ");
        }
    }
}