package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final int FREE_THROW = 1;
    final int TWO_POINT_SHOT = 2;
    final int THREE_POINT_SHOT = 3;
    int mScoreTeamA = 0;
    int mScoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreePointsForTeamA(View view) {
        mScoreTeamA += THREE_POINT_SHOT;
        displayForTeamA(mScoreTeamA);
        //displayForTeamA(FREE_THROW);
    }

    public void addTwoPointsForTeamA(View view) {
        mScoreTeamA += TWO_POINT_SHOT;
        displayForTeamA(mScoreTeamA);
        //displayForTeamA(TWO_POINT_SHOT);
    }

    public void addOnePointForTeamA(View view) {
        mScoreTeamA += FREE_THROW;
        displayForTeamA(mScoreTeamA);
        //displayForTeamA(THREE_POINT_SHOT);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreePointsForTeamB(View view) {
        mScoreTeamB += THREE_POINT_SHOT;
        displayForTeamB(mScoreTeamB);
        //displayForTeamA(FREE_THROW);
    }

    public void addTwoPointsForTeamB(View view) {
        mScoreTeamB += TWO_POINT_SHOT;
        displayForTeamB(mScoreTeamB);
        //displayForTeamA(TWO_POINT_SHOT);
    }

    public void addOnePointForTeamB(View view) {
        mScoreTeamB += FREE_THROW;
        displayForTeamB(mScoreTeamB);
        //displayForTeamA(THREE_POINT_SHOT);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScores(View view) {
        mScoreTeamA = 0;
        mScoreTeamB = 0;
        displayForTeamA(mScoreTeamA);
        displayForTeamB(mScoreTeamB);
    }
}