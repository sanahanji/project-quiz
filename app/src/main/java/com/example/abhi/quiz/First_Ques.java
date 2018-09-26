package com.example.abhi.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatRadioButton;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class First_Ques extends MainActivity {
    private Button button;
    static int value;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
         button=(Button)findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
                int selectedId = radioGroup.getCheckedRadioButtonId();
                switch (selectedId)
                {
                    case R.id.radioButton2:
                        value=10;
                        break;
                    case R.id.radioButton3:
                        value=20;
                        break;
                    case R.id.radioButton4:
                        value=30;
                        break;
                }
                Intent i=new Intent(First_Ques.this,Second_Ques.class);
                i.putExtra("Values",value);
                startActivity(i);
            }
        });

        }
    }

