package com.example.diceroller;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.media.MediaPlayer;

import java.util.Random;

// Stuff and thangs

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private TextView textViewHit;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer dicerollWV = MediaPlayer.create(this, R.raw.diceroll);


        textViewHit = findViewById(R.id.text_view_hit);
        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
                dicerollWV.start();
            }
        });
    }
    private void rollDice(){
        final MediaPlayer tadaMP = MediaPlayer.create(this, R.raw.tada);
        final MediaPlayer noMP = MediaPlayer.create(this, R.raw.no);

        int randomNumber = rng.nextInt(20) +1;
        switch (randomNumber){
            case 1:
                imageViewDice.setImageResource(R.drawable.d20_face_01);
                textViewHit.setText("Critical Miss!");
                noMP.start();
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.d20_face_02);
                textViewHit.setText("");
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.d20_face_03);
                textViewHit.setText("");
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.d20_face_04);
                textViewHit.setText("");
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.d20_face_05);
                textViewHit.setText("");
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.d20_face_06);
                textViewHit.setText("");
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.d20_face_07);
                textViewHit.setText("");
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.d20_face_08);
                textViewHit.setText("");
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.d20_face_09);
                textViewHit.setText("");
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.d20_face_10);
                textViewHit.setText("");
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.d20_face_11);
                textViewHit.setText("");
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.d20_face_12);
                textViewHit.setText("");
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.d20_face_13);
                textViewHit.setText("");
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.d20_face_14);
                textViewHit.setText("");
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.d20_face_15);
                textViewHit.setText("");
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.d20_face_16);
                textViewHit.setText("");
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.d20_face_17);
                textViewHit.setText("");
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.d20_face_18);
                textViewHit.setText("");
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.d20_face_19);
                textViewHit.setText("");
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.d20_face_20);
                textViewHit.setText("Critical Hit!");
                tadaMP.start();
                break;
        }
    }
}
