package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreForTeamA=0;
    int ScoreForTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeForTeamA(View view){
        scoreForTeamA=scoreForTeamA+3;
        displayForTeamA(scoreForTeamA);
    }
    public void addTwoForTeamA(View view){
        scoreForTeamA=scoreForTeamA+2;
        displayForTeamA(scoreForTeamA);
    }
    public void addOneForTeamA(View view){
        scoreForTeamA=scoreForTeamA+1;
        displayForTeamA(scoreForTeamA);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeForTeamB(View view){
        ScoreForTeamB=ScoreForTeamB+3;
        displayForTeamB(ScoreForTeamB);
    }
    public void addTwoForTeamB(View view){
        ScoreForTeamB=ScoreForTeamB+2;
        displayForTeamB(ScoreForTeamB);
    }
    public void addOneForTeamB(View view){
        ScoreForTeamB=ScoreForTeamB+1;
        displayForTeamB(ScoreForTeamB);
    }
    public void resetScore(View view){
        scoreForTeamA=0;
        ScoreForTeamB=0;
        displayForTeamB(ScoreForTeamB);
        displayForTeamA(scoreForTeamA);
    }
}
