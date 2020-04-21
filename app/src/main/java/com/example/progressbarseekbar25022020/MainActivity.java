package com.example.progressbarseekbar25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ProgressBar mProgressBar ;
SeekBar mSeekBar ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSeekBar = findViewById(R.id.seekBar);
//        mProgressBar = findViewById(R.id.progressBar);
//
//        final CountDownTimer countDownTimer = new CountDownTimer(1000,1000) {
//            @Override
//            public void onTick(long millisUntilFinished) {
//                if (mProgressBar.getProgress() >=100){
//                    mProgressBar.setProgress(0);
//                }
//                mProgressBar.setProgress(mProgressBar.getProgress() + 10);
//            }
//
//            @Override
//            public void onFinish() {
//              this.start();
//            }
//        };
//        countDownTimer.start();
        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(MainActivity.this,progress +"",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
