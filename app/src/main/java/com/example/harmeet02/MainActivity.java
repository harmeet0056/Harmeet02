package com.example.harmeet02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                imgView = findViewById(R.id.imageView9);
                sw = findViewById(R.id.switch1);
                sw.setOnCheckedChangeListener( (btn, isChecked) -> {
                });

                sw.setOnCheckedChangeListener((buttonView, isChecked) -> {
                    if (isChecked)
                    {
                        RotateAnimation rotate = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f,
                                Animation.RELATIVE_TO_SELF, 0.5f);
                        rotate.setDuration(5000);
                        rotate.setRepeatCount(Animation.INFINITE);
                        rotate.setInterpolator(new LinearInterpolator());
                        imgView.startAnimation(rotate);
                    }else {
                        imgView.clearAnimation();
                    }
                });

            }

        }
    }
}