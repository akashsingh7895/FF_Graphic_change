package com.avssolutiion.autoheadshot;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.avssolutiion.autoheadshot.databinding.ActivityResoSettingBinding;

public class ResoSettingActivity extends AppCompatActivity {

    ActivityResoSettingBinding binding;
    int value;

    String[] position = {"30 Fps ","40 Fps","60 Fps","120 Fps"};
    String selected;

    String[] position1 = {"Disable ","2x","3x"};
    String selected1;

    String[] position2 = {"Low","Medium","High"};
    String selected2;

    String[] position3= {"Classic","Colorful","Realistic"};
    String selected3;

    String[] position4 = {"Default","480p","720p","1080p"};
    String selected4;

    String[] position5 = {"Classic","Standerd","High"};
    String selected5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResoSettingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        value = getIntent().getIntExtra("value",0);

        if (value==0){
            binding.tvHeader.setText("Free Fire");
        }else if (value==1){
            binding.tvHeader.setText("Free Fire Max");
        }

        binding.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        binding.iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowDiloag();
            }
        });
        binding.iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowDiloag1();
            }
        });


        binding.iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowDiloag2();
            }
        });


        binding.iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowDiloag3();
            }
        });


        binding.iv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowDiloag4();
            }
        });


        binding.iv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowDiloag5();
            }
        });

        binding.useButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResoSettingActivity.this,ResoDoneSuccessActivity.class));
            }
        });

    }
    public void ShowDiloag(){
        selected = position[0];
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //  builder.setTitle("10");
        builder.setSingleChoiceItems(position, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                selected = position[i];
            }
        });

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                binding.tv1.setText(selected);
            }
        });

        builder.setNegativeButton("Cancel",null);
        builder.show();
    }

    public void ShowDiloag1(){
        selected1 = position1[0];
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //  builder.setTitle("10");
        builder.setSingleChoiceItems(position1, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                selected1 = position1[i];
            }
        });

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                binding.tv2.setText(selected1);
            }
        });

        builder.setNegativeButton("Cancel",null);
        builder.show();
    }

    public void ShowDiloag2(){
        selected2 = position2[0];
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //  builder.setTitle("10");
        builder.setSingleChoiceItems(position2, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                selected2 = position2[i];
            }
        });

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                binding.tv3.setText(selected2);
            }
        });

        builder.setNegativeButton("Cancel",null);
        builder.show();
    }

    public void ShowDiloag3(){
        selected3 = position3[0];
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //  builder.setTitle("10");
        builder.setSingleChoiceItems(position3, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                selected3 = position3[1];
            }
        });

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                binding.tv4.setText(selected3);
            }
        });

        builder.setNegativeButton("Cancel",null);
        builder.show();
    }

    public void ShowDiloag4(){
        selected4 = position4[0];
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //  builder.setTitle("10");
        builder.setSingleChoiceItems(position4, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                selected4 = position4[1];
            }
        });

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                binding.tv5.setText(selected4);
            }
        });

        builder.setNegativeButton("Cancel",null);
        builder.show();
    }

    public void ShowDiloag5(){
        selected5 = position5[0];
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //  builder.setTitle("10");
        builder.setSingleChoiceItems(position5, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                selected5 = position5[1];
            }
        });

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                binding.tv6.setText(selected5);
            }
        });

        builder.setNegativeButton("Cancel",null);
        builder.show();
    }

}