package com.example.widget02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup rg = (RadioGroup) findViewById(R.id.rg_gender);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                TextView tv = (TextView)findViewById(R.id.radioChecker);
                switch (checkedId){
                    case R.id.rb_female:{
                        tv.setText("여자 선택");
                        break;
                    }
                    case R.id.rd_male:{
                        tv.setText("남자 선택");
                        break;
                    }
                    default:
                        break;
                }
            }
        });

        findViewById(R.id.checkBox).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean isChecked = ((CheckBox)view).isChecked();
                TextView tv = findViewById(R.id.checkboxChecker);
                tv.setText(isChecked ? "checked" : "unchecked");
            }
        });

        findViewById(R.id.toggleButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean isChecked = ((ToggleButton)view).isChecked();
                TextView tv = findViewById(R.id.toggleButtonChecker);
                tv.setText(isChecked ? "on" : "off");
            }
        });
    }
}
