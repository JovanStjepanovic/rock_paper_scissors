package com.cubes.stjepanovic.rpsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Toast;

import com.cubes.stjepanovic.rpsgame.databinding.ActivityVsBotBinding;

import java.util.Locale;
import java.util.Random;

public class VsBotActivity extends AppCompatActivity {

   private ActivityVsBotBinding binding;
   private  static  int a,c,d,e;
  private   Random random;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding=ActivityVsBotBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        c=0;
        d=0;
        e=0;


        binding.imagePaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (a==0) {


                    binding.imageViewPlayer1.setImageResource(R.drawable.paper);


                    a = 2;

                    botChoice(a);

                }


            }
        });



        binding.imageRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                  if (a==0) {


                      binding.imageViewPlayer1.setImageResource(R.drawable.rock);


                      a = 1;

                      botChoice(a);

                  }


            }
        });


        binding.imageScissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (a==0) {


                    binding.imageViewPlayer1.setImageResource(R.drawable.scissors);

                    a = 3;


                    botChoice(a);


                }

                }
        });














    }

  private void botChoice(int a){

     random= new Random() ;

      int numb = random.nextInt((3-1)+1)+1;


      if (numb==1){
          binding.imageViewBot1.setImageResource(R.drawable.rock);
      }

    else if (numb==2){
          binding.imageViewBot1.setImageResource(R.drawable.paper);
      }

     else if (numb==3){
          binding.imageViewBot1.setImageResource(R.drawable.scissors);
      }



     resultComparison(a,numb);

    }

    private void resultComparison(int a , int b){



        if (a==1 && b==1){


            c=c+1;

            binding.textViewResult.setText("DRAW !!");

            binding.textViewResult.setTextColor(Color.parseColor("#FFC107"));


            binding.textViewDraws.setText("DRAWS"+" "+c);


        }
        else if (a==1 && b ==2 ) {

            d=d+1;

            binding.textViewResult.setText("BOT WINS !!");
            binding.textViewResult.setTextColor(Color.parseColor("#AE1919"));
            binding.textViewBotWins.setText("BOT WINS"+" "+d);




        }


        else if (a==1 && b ==3 ) {

            e=e+1;

            binding.textViewResult.setText("PLAYER WINS !!");
            binding.textViewResult.setTextColor(Color.parseColor("#2196F3"));
            binding.textViewPlayerWins.setText("PLAYER WINS"+" "+e);



        }





        else   if (a==2 && b==2){

            c=c+1;

            binding.textViewResult.setText("DRAW !!");
            binding.textViewResult.setTextColor(Color.parseColor("#FFC107"));
            binding.textViewDraws.setText("DRAWS"+" "+c);

        }
        else if (a==2 && b ==3 ) {

            d=d+1;

            binding.textViewResult.setText("BOT WINS !!");
            binding.textViewResult.setTextColor(Color.parseColor("#AE1919"));
            binding.textViewBotWins.setText("BOT WINS"+" "+d);


        }


        else if (a==2 && b ==1 ) {

            e=e+1;

            binding.textViewResult.setText("PLAYER WINS !!");
            binding.textViewResult.setTextColor(Color.parseColor("#2196F3"));
            binding.textViewPlayerWins.setText("PLAYER WINS"+" "+e);



        }



        if (a==3 && b==3){

            c=c+1;

            binding.textViewResult.setText("DRAW !!");
            binding.textViewResult.setTextColor(Color.parseColor("#FFC107"));
            binding.textViewDraws.setText("DRAWS"+" "+c);
        }
        else if (a==3 && b ==1 ) {

            d=d+1;

            binding.textViewResult.setText("BOT WINS !!");
            binding.textViewResult.setTextColor(Color.parseColor("#AE1919"));
            binding.textViewBotWins.setText("BOT WINS"+" "+d);



        }


        else if (a==3 && b ==2 ) {

            e=e+1;
            binding.textViewResult.setText("PLAYER WINS !!");
            binding.textViewResult.setTextColor(Color.parseColor("#2196F3"));
            binding.textViewPlayerWins.setText("PLAYER WINS"+" "+e);


        }



       doInBack();


    }


    private void doInBack(){

        new MyAt().execute();
    }




    private   class MyAt extends AsyncTask<Void,Void,Void> {

        @Override
        protected Void doInBackground(Void... voids) {

            try {

                Thread.sleep(1000);

            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }


            return null;
        }


        @Override
        protected void onPostExecute(Void unused) {

            binding.imageViewPlayer1.setImageResource(R.drawable.circle_blue);
            binding.imageViewBot1.setImageResource(R.drawable.circle_red);

            binding.textViewPlayer.setText("PLAYER 1 OPTIONS");
            binding.textViewPlayer.setTextColor(Color.parseColor("#2196F3"));

            binding.textViewResult.setText("");

            a=0;


            super.onPostExecute(unused);
        }
    }





}