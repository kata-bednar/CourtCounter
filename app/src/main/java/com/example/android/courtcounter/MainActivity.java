package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA (scoreTeamA);
    }

    /**
     * Increases the score of Team A by 3 points.
     */
    public void scoreThree (View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA (scoreTeamA);
    }

    /**
     * Increases the score of Team A by 2 points.
     */
    public void scoreTwo (View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA (scoreTeamA);
    }

    /**
     * Increases the score of Team A by 1 point.
     */
    public void scoreOne (View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA (scoreTeamA);
    }

    /**
     * Increases the score of Team B by 3 points.
     */
    public void scoreThreeB (View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB (scoreTeamB);
    }

    /**
     * Increases the score of Team B by 2 points.
     */
    public void scoreTwoB (View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB (scoreTeamB);
    }

    /**
     * Increases the score of Team B by 1 point.
     */
    public void scoreOneB (View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB (scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void ResetAllScores (View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}

