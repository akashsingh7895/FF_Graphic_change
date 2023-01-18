package com.avssolutiion.autoheadshot;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.avssolutiion.autoheadshot.databinding.ActivityProgressBinding;

import java.util.Timer;
import java.util.TimerTask;

public class ProgressActivity extends AppCompatActivity {


    ActivityProgressBinding binding;
    int value;

  //  private ProgressBar progressBar;
    private int progressStatus = 0;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProgressBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        value = getIntent().getIntExtra("value",0);

        if (value==0){
            binding.tvHeader.setText("Call of Duty Graphic");
        }else if (value==1){
            binding.tvHeader.setText("Minecraft Grapic");
        }else if (value==2){
            binding.tvHeader.setText("Pubg Grapic");

        }


        new Thread(new Runnable() {
            public void run() {
                while (progressStatus < 100) {
                    progressStatus += 5;
                    // Update the progress bar and display the
                    //current value in the text view
                    handler.post(new Runnable() {
                        public void run() {
                            binding.progressbarPredict.setProgress(progressStatus);
                           // binding.proNumber.setText(progressStatus+"/"+binding.progressbarPredict.getMax()+"");
                            binding.proNumber.setText("Processing "+progressStatus+" % ");

                            if (progressStatus==100){
                                Intent intent = new Intent(ProgressActivity.this,GraphicDoneActivity.class);
                                intent.putExtra("game",value);
                                startActivity(intent);
                                //startActivity(new Intent(ProgressActivity.this,GraphicDoneActivity.class));
                            }
                        }
                    });
                    try {
                        // Sleep for 200 milliseconds.
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

}