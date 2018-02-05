package com.example.android.csgocounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int moneyTeamA = 0;
    int roundTeamA = 0;
    int moneyTeamB = 0;
    int roundTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the round score for Team A
     * @param round add a new round
     */
    public void displayRoundForTeamA(int round) {
        if (roundTeamA + roundTeamB == 30) {
            Toast.makeText(this, getString(R.string.maxRound), Toast.LENGTH_SHORT).show();
            return;
        }
            TextView scoreView = (TextView) findViewById(R.id.team_a_round_score);
            scoreView.setText(String.valueOf(round));

    }

    /**
     * Displays the given money for Team A.
     * @param money
     */
    public void displayForTeamA(int money) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        NumberFormat format = NumberFormat.getCurrencyInstance();
        format.setMaximumFractionDigits(0);
        scoreView.setText(String.valueOf(format.format(money)));
    }

    /**
     * Adds $100 point to Team A money.
     */
    public void addHundredDollarsForTeamA(View view) {
        moneyTeamA += 100;
        displayForTeamA(moneyTeamA);
    }
    /**
     * Adds 1 round to Team A round score.
     */
    public void addOneForTeamA(View view) {
        roundTeamA += 1;
        displayRoundForTeamA(roundTeamA);
    }

    /**
     * Displays the round score for Team B
     * @param round add a new round
     */
    public void displayRoundForTeamB(int round) {
        if (roundTeamA + roundTeamB == 30) {
            Toast.makeText(this, getString(R.string.maxRound), Toast.LENGTH_SHORT).show();
            return;
        }
        TextView scoreView = (TextView) findViewById(R.id.team_b_round_score);
        scoreView.setText(String.valueOf(round));
    }

    /**
     * Displays the given money for Team B.
     * @param money
     */
    public void displayForTeamB(int money) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        NumberFormat format = NumberFormat.getCurrencyInstance();
        format.setMaximumFractionDigits(0);
        scoreView.setText(String.valueOf(format.format(money)));
    }

    /**
     * Adds $100 point to Team B money.
     */
    public void addHundredDollarsForTeamB(View view) {
        moneyTeamB += 100;
        displayForTeamB(moneyTeamB);
    }
    /**
     * Adds 1 point to Team B score.
     */
    public void addOneForTeamB(View view) {
        roundTeamB += 1;
        displayRoundForTeamB(roundTeamB);
    }
    /**
     * Resets Team A and Team B score to 0.
     */
    public void resetScore(View view) {
        moneyTeamA = moneyTeamB = roundTeamB = roundTeamA = 0;
        displayForTeamA(moneyTeamA);
        displayForTeamB(moneyTeamB);
        displayRoundForTeamB(roundTeamB);
        displayRoundForTeamA(roundTeamA);

    }
}


