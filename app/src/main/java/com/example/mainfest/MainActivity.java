package com.example.mainfest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    CheckBox check;
    ToggleButton toggle;
    RadioGroup group;
    SeekBar bar;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        check=(CheckBox)findViewById(R.id.check);
        toggle=(ToggleButton)findViewById(R.id.toggle);
        group=(RadioGroup)findViewById(R.id.group);
        bar=(SeekBar)findViewById(R.id.seek);
        txt=(TextView)findViewById(R.id.txt);

        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(check.isChecked())
                {
                    Toast.makeText(MainActivity.this,"check",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "uncheck",Toast.LENGTH_SHORT).show();

                }
            }
        });

        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(toggle.isChecked())
                {
                    Toast.makeText(MainActivity.this, "ON", Toast.LENGTH_SHORT).show();

                }
            }
        });
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(toggle.isChecked())
                {
                    Toast.makeText(MainActivity.this,"on",Toast.LENGTH_SHORT).show();
                }
                else
                {

                    Toast.makeText(MainActivity.this,"off",Toast.LENGTH_SHORT).show();

                }
            }
        });
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton btn = (RadioButton)findViewById(checkedId);

                Toast.makeText(MainActivity.this,((RadioButton)btn).getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
