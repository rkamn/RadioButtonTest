package com.example.rakesh.radiobuttontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rating = (RadioGroup)findViewById(R.id.rating);
        rating.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = (RadioButton)findViewById(checkedId);
                switch (radioButton.getId()){
                    case R.id.rbexcelent:
                        Toast.makeText(MainActivity.this,"Thankyou, Watch continue",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbgood:
                        Toast.makeText(MainActivity.this,"Thank You",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbavarage:
                        Toast.makeText(MainActivity.this,"Thank You, I will improve",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbbad:
                        Toast.makeText(MainActivity.this,"Thankyou, Please comment in discription",Toast.LENGTH_SHORT).show();
                        break;
                        default:Toast.makeText(MainActivity.this,"You are welcome",Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}
