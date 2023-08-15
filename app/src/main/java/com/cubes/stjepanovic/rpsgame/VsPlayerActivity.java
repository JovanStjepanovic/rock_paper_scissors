package com.cubes.stjepanovic.rpsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.cubes.stjepanovic.rpsgame.databinding.ActivityVsPlayerBinding;

public class VsPlayerActivity extends AppCompatActivity {

    private ActivityVsPlayerBinding binding;
    private static int a,b,c,d,e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityVsPlayerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


           a=0;
           b=0;
           c=0;
           d=0;
           e=0;

            binding.imagePaper1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                  if (a==0) {


                      a = 2;


                      binding.imagePaper1.setVisibility(View.GONE);
                      binding.imageRock1.setVisibility(View.GONE);
                      binding.imageScissors1.setVisibility(View.GONE);


                      binding.textViewPlayer.setText("PLAYER 2 OPTIONS");
                      binding.textViewPlayer.setTextColor(Color.parseColor("#AE1919"));

                  }



                }
            });


            binding.imageRock1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                 if (a==0) {

                     a = 1;
                     binding.imagePaper1.setVisibility(View.GONE);
                     binding.imageRock1.setVisibility(View.GONE);
                     binding.imageScissors1.setVisibility(View.GONE);

                     binding.textViewPlayer.setText("PLAYER 2 OPTIONS");
                     binding.textViewPlayer.setTextColor(Color.parseColor("#AE1919"));


                 }


                }
            });


            binding.imageScissors1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                  if (a==0) {

                      a = 3;

                      binding.imagePaper1.setVisibility(View.GONE);
                      binding.imageRock1.setVisibility(View.GONE);
                      binding.imageScissors1.setVisibility(View.GONE);


                      binding.textViewPlayer.setText("PLAYER 2 OPTIONS");
                      binding.textViewPlayer.setTextColor(Color.parseColor("#AE1919"));

                  }


                }
            });



        binding.imagePaper2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


              if (b==0) {

                  b = 2;


                  checkResult();

              }


            }
        });


        binding.imageRock2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if (b==0) {


                   b = 1;

                   checkResult();

               }

               }
        });


        binding.imageScissors2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if (b==0) {

                   b = 3;

                   checkResult();

               }



            }
        });








    }

    private void checkResult(){



       if (a==1){

           binding.imageViewPlayer1.setImageResource(R.drawable.rock);

       }
       else if (a==2) {

           binding.imageViewPlayer1.setImageResource(R.drawable.paper);
       }
       else if (a==3) {
           binding.imageViewPlayer1.setImageResource(R.drawable.scissors);

       }


        if (b==1){

            binding.imageViewBot1.setImageResource(R.drawable.rock);
        }
        else if (b==2) {

            binding.imageViewBot1.setImageResource(R.drawable.paper);
        }
        else if (b==3) {
            binding.imageViewBot1.setImageResource(R.drawable.scissors);
        }



        if (a==1 && b==1){


            c=c+1;

            binding.textViewResult.setText("DRAW, RESETTING BOARD !!");

            binding.textViewResult.setTextColor(Color.parseColor("#FFC107"));


            binding.textViewDraws.setText("DRAWS"+" "+c);


            binding.imagePaper1.setVisibility(View.VISIBLE);
            binding.imageRock1.setVisibility(View.VISIBLE);
            binding.imageScissors1.setVisibility(View.VISIBLE);




        }
        else if (a==1 && b ==2 ) {

            d=d+1;

            binding.textViewResult.setText("PLAYER2 WINS, RESETTING BOARD !!");
            binding.textViewResult.setTextColor(Color.parseColor("#AE1919"));
            binding.textViewBotWins.setText("PLAYER2 WINS"+" "+d);

            binding.imagePaper1.setVisibility(View.VISIBLE);
            binding.imageRock1.setVisibility(View.VISIBLE);
            binding.imageScissors1.setVisibility(View.VISIBLE);


        }


        else if (a==1 && b ==3 ) {

            e=e+1;
            binding.textViewResult.setText("PLAYER1 WINS, RESETTING BOARD !!");
            binding.textViewResult.setTextColor(Color.parseColor("#2196F3"));
            binding.textViewPlayerWins.setText("PLAYER1 WINS"+" "+e);

            binding.imagePaper1.setVisibility(View.VISIBLE);
            binding.imageRock1.setVisibility(View.VISIBLE);
            binding.imageScissors1.setVisibility(View.VISIBLE);

        }





        else   if (a==2 && b==2){

            c=c+1;

            binding.textViewResult.setText("DRAW, RESETTING BOARD !!");
            binding.textViewResult.setTextColor(Color.parseColor("#FFC107"));
            binding.textViewDraws.setText("DRAWS"+" "+c);

            binding.imagePaper1.setVisibility(View.VISIBLE);
            binding.imageRock1.setVisibility(View.VISIBLE);
            binding.imageScissors1.setVisibility(View.VISIBLE);
        }
        else if (a==2 && b ==3 ) {

            d=d+1;

            binding.textViewResult.setText("PLAYER2 WINS, RESETTING BOARD !!");
            binding.textViewResult.setTextColor(Color.parseColor("#AE1919"));
            binding.textViewBotWins.setText("PLAYER2 WINS"+" "+d);

            binding.imagePaper1.setVisibility(View.VISIBLE);
            binding.imageRock1.setVisibility(View.VISIBLE);
            binding.imageScissors1.setVisibility(View.VISIBLE);

        }


        else if (a==2 && b ==1 ) {

            e=e+1;

            binding.textViewResult.setText("PLAYER1 WINS, RESETTING BOARD !!");
            binding.textViewResult.setTextColor(Color.parseColor("#2196F3"));
            binding.textViewPlayerWins.setText("PLAYER1 WINS"+" "+e);

            binding.imagePaper1.setVisibility(View.VISIBLE);
            binding.imageRock1.setVisibility(View.VISIBLE);
            binding.imageScissors1.setVisibility(View.VISIBLE);

        }



        if (a==3 && b==3){

            c=c+1;

            binding.textViewResult.setText("DRAW, RESETTING BOARD !!");
            binding.textViewResult.setTextColor(Color.parseColor("#FFC107"));
            binding.textViewDraws.setText("DRAWS"+" "+c);


            binding.imagePaper1.setVisibility(View.VISIBLE);
            binding.imageRock1.setVisibility(View.VISIBLE);
            binding.imageScissors1.setVisibility(View.VISIBLE);

        }
        else if (a==3 && b ==1 ) {

            d=d+1;

            binding.textViewResult.setText("PLAYER2 WINS, RESETTING BOARD !!");
            binding.textViewResult.setTextColor(Color.parseColor("#AE1919"));
            binding.textViewBotWins.setText("PLAYER2 WINS"+" "+d);

            binding.imagePaper1.setVisibility(View.VISIBLE);
            binding.imageRock1.setVisibility(View.VISIBLE);
            binding.imageScissors1.setVisibility(View.VISIBLE);

        }


        else if (a==3 && b ==2 ) {

            e=e+1;
            binding.textViewResult.setText("PLAYER1 WINS, RESETTING BOARD !!");
            binding.textViewResult.setTextColor(Color.parseColor("#2196F3"));
            binding.textViewPlayerWins.setText("PLAYER1 WINS"+" "+e);

            binding.imagePaper1.setVisibility(View.VISIBLE);
            binding.imageRock1.setVisibility(View.VISIBLE);
            binding.imageScissors1.setVisibility(View.VISIBLE);
        }


           doInBack();



    }

    private void doInBack(){

        new MyAt().execute();
    }




private   class MyAt extends AsyncTask<Void,Void,Void>{

    @Override
    protected Void doInBackground(Void... voids) {

        try {

            Thread.sleep(2000);

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
        b=0;

        super.onPostExecute(unused);
    }
}







}