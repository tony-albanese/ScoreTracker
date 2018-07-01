package com.example.android.scoretracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //Declare and initialize the variables that will hold the numerical score/timeout values.
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    int timeoutsTeamA = 3;
    int timeoutsTeamB = 3;

    int touchDownPoints = 7; //The extra point is implied!
    int fieldGoalPoints = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //These methods handle touchdowns.
    //*******************************************
    public void touchdownScoredA(View view) {
        TextView score = (TextView) findViewById(R.id.score_team_A);
        scoreTeamA = scoreTeamA + touchDownPoints;
        score.setText("" + scoreTeamA); // The quotes convert the int type to String.
    }


    public void touchdownScoredB(View view) {
        TextView score = (TextView) findViewById(R.id.score_team_B);
        scoreTeamB = scoreTeamB + touchDownPoints;
        score.setText("" + scoreTeamB);// The quotes convert the int type to String.
    }
    //*********************************************


    //These methods handle field goals.
    //*********************************************

    public void fieldGoalScoredA(View view) {
        TextView score = (TextView) findViewById(R.id.score_team_A);
        scoreTeamA = scoreTeamA + fieldGoalPoints;
        score.setText(String.valueOf(scoreTeamA));
    }


    public void fieldGoalScoredB(View view) {
        TextView score = (TextView) findViewById(R.id.score_team_B);
        scoreTeamB = scoreTeamB + fieldGoalPoints;
        score.setText(String.valueOf(scoreTeamB));
    }
    //**********************************************


    //These methods handle the timeouts.
    //*********************************************

    public void useTimeoutA(View view) {
        TextView timeoutView = (TextView) findViewById(R.id.timeoutsRemaining_team_A);

        timeoutsTeamA = timeoutsTeamA - 1;

        if (timeoutsTeamA >= 0) {
            timeoutView.setText(String.valueOf(timeoutsTeamA));
        } else timeoutsTeamA = 0;
    }


    public void useTimeoutB(View view) {
        TextView timeoutView = (TextView) findViewById(R.id.timeoutsRemaining_team_B);

        timeoutsTeamB = timeoutsTeamB - 1;

        if (timeoutsTeamB >= 0) {
            timeoutView.setText(String.valueOf(timeoutsTeamB));
        } else timeoutsTeamB = 0;
    }


    public void resetAll(View view) {

        TextView timeoutViewA = (TextView) findViewById(R.id.timeoutsRemaining_team_A);
        TextView timeoutViewB = (TextView) findViewById(R.id.timeoutsRemaining_team_B);
        TextView scoreA = (TextView) findViewById(R.id.score_team_A);
        TextView scoreB = (TextView) findViewById(R.id.score_team_B);

        scoreA.setText("0");
        scoreB.setText("0");
        timeoutViewA.setText("3");
        timeoutViewB.setText("3");

        timeoutsTeamA = 3;
        timeoutsTeamB = 3;
        scoreTeamA = 0;
        scoreTeamB = 0;
    }
}
