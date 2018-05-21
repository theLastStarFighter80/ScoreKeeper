package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    /**
     * tracks scores for each team
     */

    int scoreTeamA = 0, scoreTeamB = 0, penaltyTeamA = 0, penaltyTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 1 point.
     */

    public void addOneForTeamA(View v)
    {
        penaltyTeamA = penaltyTeamA + 1;
        displayForTeamAPenalty(penaltyTeamA);
    }

    /**
     * Increase the score for Team A by 7 points.
     */

    public void addTouchDownForTeamA(View v)
    {
        scoreTeamA = scoreTeamA + 7;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */

    public void addFieldGoalForTeamA(View v)
    {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */

    public void addSafetyForTeamA(View v)
    {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */

    public void displayForTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given penalty for Team A.
     */

    public void displayForTeamAPenalty(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_penalty);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team B by 1 point.
     */

    public void addOneForTeamB(View v)
    {
        penaltyTeamB = penaltyTeamB + 1;
        displayForTeamBPenalty(penaltyTeamB);
    }

    /**
     * Increase the score for Team B by 7 points.
     */

    public void addTouchDownForTeamB(View v)
    {
        scoreTeamB = scoreTeamB + 7;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 3 points.
     */

    public void addFieldGoalForTeamB(View v)
    {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 2 points.
     */

    public void addSafetyForTeamB(View v)
    {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */

    public void displayForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given penalty for Team B.
     */

    public void displayForTeamBPenalty(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_penalty);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets the score for team A
     */

    public void resetScoreA(View v)
    {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Resets the score for team B
     */

    public void resetScoreB(View v)
    {
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Resets the penalty for team A
     */

    public void resetPenaltyA(View v)
    {
        penaltyTeamA = 0;
        displayForTeamAPenalty(penaltyTeamA);
    }

    /**
     * Resets the penalty for team B
     */

    public void resetPenaltyB(View v)
    {
        penaltyTeamB = 0;
        displayForTeamBPenalty(penaltyTeamB);
    }
}
