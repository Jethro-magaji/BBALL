package com.example.bball;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;
import android.view.View;

import java.text.NumberFormat;

import android.view.ActionProvider;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(9);
        displayForTeamB(3);
    }


     @Override
     public boolean onCreateOptionsMenu(Menu menu){
     getMenuInflater().inflate(R.menu.menu_main, menu);
     return true;
     }




     @Override
     public boolean onOptionsItemSelected(MenuItem item){
      int id = item.getItemId();

     if (id == R.id.action_settings){
      return true;
      }
      return  super.onOptionsItemSelected(item);
      }


    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamB(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamB);
    }

    public void addTwoForTeamB(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamB);
    }

    public void addThreeForTeamB(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamB);
    }


    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}

