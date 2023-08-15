package com.cubes.stjepanovic.rpsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.cubes.stjepanovic.rpsgame.databinding.ActivityMainMenuBinding;

public class MainMenuActivity extends AppCompatActivity {

    private ActivityMainMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding=ActivityMainMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


      binding.imageViewVersusBot.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              startActivity(new Intent(getApplicationContext(),VsBotActivity.class));
          }
      });


      binding.imageViewVersusPlayer.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              startActivity(new Intent(binding.getRoot().getContext(),VsPlayerActivity.class));
          }
      });






    }
}