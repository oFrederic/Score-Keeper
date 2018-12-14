package com.example.android.scorekeeperv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int homeScore;
    int visitorScore;
    int inningsScore;
    int ballsScore;
    int strikesScore;
    int outsScore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Home.
     */
    public void addOneHomeScore(View v) {
        homeScore++;
        displayHome(homeScore);
    }

    /**
     * Displays the given score for Home.
     */
    public void displayHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.homeScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Visitor.
     */
    public void addOneVisitorScore(View v) {
        visitorScore++;
        displayVisitor(visitorScore);
    }

    /**
     * Displays the given score for Visitor.
     */
    public void displayVisitor(int score) {
        TextView scoreView = (TextView) findViewById(R.id.visitorScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Innings.
     */
    public void addOneInningsScore(View v) {
        inningsScore++;
        displayInnings(inningsScore);
    }

    /**
     * Displays the given score for Innings.
     */
    public void displayInnings(int score) {
        TextView scoreView = (TextView) findViewById(R.id.inningsScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset score and innings and display them.
     */
    public void resetScore1(View v) {
        homeScore = 0;
        visitorScore = 0;
        inningsScore = 1;
        displayHome(homeScore);
        displayVisitor(visitorScore);
        displayInnings(inningsScore);
    }

    /**
     * Increase the score for Balls.
     */
    public void addOneBallsScore(View v) {
        ballsScore++;
        if (ballsScore > 4) {
            resetScore2(v);
        }
        displayBalls(ballsScore);
    }

    /**
     * Displays the given score for Balls.
     */
    public void displayBalls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ballsScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Strikes.
     */
    public void addOneStrikesScore(View v) {
        strikesScore++;
        if (strikesScore > 3) {
            resetScore2(v);
        }
        displayStrikes(strikesScore);
    }

    /**
     * Displays the given score for Strikes.
     */
    public void displayStrikes(int score) {
        TextView scoreView = (TextView) findViewById(R.id.strikesScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Outs.
     */
    public void addOneOutsScore(View v) {
        outsScore++;
        if (outsScore > 3) {
            resetScore2(v);
        }
        displayOuts(outsScore);
    }

    /**
     * Displays the given score for Outs.
     */
    public void displayOuts(int score) {
        TextView scoreView = (TextView) findViewById(R.id.outsScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset the score for Balls, Strikes and Outs.
     */
    public void resetScore2(View v) {
        ballsScore = 0;
        strikesScore = 0;
        outsScore = 0;
        displayBalls(ballsScore);
        displayStrikes(strikesScore);
        displayOuts(outsScore);
    }

}
