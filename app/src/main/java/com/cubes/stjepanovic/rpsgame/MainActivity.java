package com.cubes.stjepanovic.rpsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.cubes.stjepanovic.rpsgame.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.imageViewIntro2.setImageResource(R.drawable.dev);
        binding.imageViewIntro.setImageResource(R.drawable.jsi);



        binding.imageViewIntro.postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(getApplicationContext(),MainMenuActivity.class));

                finish();
            }
        },1000);



    }


}