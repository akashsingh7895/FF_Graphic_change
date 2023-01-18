package com.avssolutiion.autoheadshot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.avssolutiion.autoheadshot.databinding.ActivityGraphicDoneBinding;

public class GraphicDoneActivity extends AppCompatActivity {

    ActivityGraphicDoneBinding binding;
    int value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGraphicDoneBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        value = getIntent().getIntExtra("game",0);

        if (value==0){
            binding.tvHeader.setText("Call of Duty Graphic");
        }else if (value==1){
            binding.tvHeader.setText("Minecraft Grapic");
        }else if (value==2){
            binding.tvHeader.setText("Pubg Grapic");

        }


        binding.openGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (value==0){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.activision.callofduty.shooter&hl=en_IN&gl=US"));
                    startActivity(browserIntent);
                  //  Toast.makeText(GraphicDoneActivity.this, "Call of Duty", Toast.LENGTH_SHORT).show();
               }else if (value==1){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.mojang.minecraftpe&hl=en_IN&gl=US"));
                    startActivity(browserIntent);
                  //  Toast.makeText(GraphicDoneActivity.this, "Minecraft", Toast.LENGTH_SHORT).show();
                }else if (value==2){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.tencent.ig&hl=en_IN&gl=US"));
                    startActivity(browserIntent);
                   // Toast.makeText(GraphicDoneActivity.this, "pubg", Toast.LENGTH_SHORT).show();

                }
            }
        });

        binding.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        binding.backButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



    }
}