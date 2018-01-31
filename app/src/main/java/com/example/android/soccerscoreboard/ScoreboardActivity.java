package com.example.android.soccerscoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.soccerscoreboard.model.Scoreboard;

public class ScoreboardActivity extends AppCompatActivity {

    private Scoreboard scoreboard;

    /**
     *  Fields :
     *
     *  - home_score_field
     *  - guest_score_field
     *  - home_fouls_field
     *  - home_yellows_field
     *  - home_reds_fields
     *  - guest_fouls_field
     *  - guest_yellows_field
     *  - guest_reds_field
     */

    /**
     *  Buttons
     *
     *  - home_score_button
     *  - guest_score_button
     *  - home_fouls_button
     *  - home_yellows_button
     *  - home_reds_button
     *  - guest_fouls_button
     *  - guest_yellows_button
     *  - guest_reds_button
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoreboard);

        scoreboard = new Scoreboard();
        displayAllStatistics();
    }

    /**
     *  This method displays all statistics for Home and Guest team
     */
    private void displayAllStatistics(){
        displayScoreForHomeTeam();
        displayScoreForGuestTeam();
        displayFoulsForHomeTeam();
        displayFoulsForGuestTeam();
        displayYellowsForHomeTeam();
        displayYellowsForGuestTeam();
        displayRedsForHomeTeam();
        displayRedsForGuestTeam();
    }

    /**
     * This method displays the score for the Home team
     */
    private void displayScoreForHomeTeam(){
        TextView textView = (TextView) findViewById(R.id.home_score_field);

        textView.setText(String.valueOf(this.scoreboard.getHomeTeamScore()));
    }

    /**
     * This method displays the score for the Guest team
     */
    private void displayScoreForGuestTeam(){
        TextView textView = (TextView) findViewById(R.id.guest_score_field);

        textView.setText(String.valueOf(this.scoreboard.getGuestTeamScore()));
    }

    /**
     * This method displays the fouls for the Home team
     */
    private void displayFoulsForHomeTeam(){
        TextView textView = (TextView) findViewById(R.id.home_fouls_field);

        textView.setText(String.valueOf(this.scoreboard.getHomeTeamFouls()));
    }

    /**
     * This method displays the fouls for the Guest team
     */
    private void displayFoulsForGuestTeam(){
        TextView textView = (TextView) findViewById(R.id.guest_fouls_field);

        textView.setText(String.valueOf(this.scoreboard.getGuestTeamFouls()));
    }

    /**
     * This method displays the yellow cards for the Home team
     */
    private void displayYellowsForHomeTeam(){
        TextView textView = (TextView) findViewById(R.id.home_yellows_field);

        textView.setText(String.valueOf(this.scoreboard.getHomeTeamYellows()));
    }

    /**
     * This method displays the yellow cards for the Guest team
     */
    private void displayYellowsForGuestTeam(){
        TextView textView = (TextView) findViewById(R.id.guest_yellows_field);

        textView.setText(String.valueOf(this.scoreboard.getGuestTeamYellows()));
    }

    /**
     * This method displays the red cards for the Home team
     */
    private void displayRedsForHomeTeam(){
        TextView textView = (TextView) findViewById(R.id.home_reds_field);

        textView.setText(String.valueOf(this.scoreboard.getHomeTeamReds()));
    }

    /**
     * This method displays the red cards for the Guest team
     */
    private void displayRedsForGuestTeam(){
        TextView textView = (TextView) findViewById(R.id.guest_reds_field);

        textView.setText(String.valueOf(this.scoreboard.getGuestTeamReds()));
    }

    /**
     * This methods reset to defaults the scoreboard
     */
    public void resetScoreboard(View view){
        scoreboard.reset();
        displayAllStatistics();
    }

    /**
     * This event is triggered when the home_score_button is clicked
     * @param view
     */
    public void updateHomeTeamScore(View view){
        scoreboard.updateScoreForHomeTeam();
        displayScoreForHomeTeam();
    }

    /**
     * This event is triggered when the guest_score_button is clicked
     * @param view
     */
    public void updateGuestTeamScore(View view){
        scoreboard.updateScoreForGuestTeam();
        displayScoreForGuestTeam();
    }

    /**
     * This event is triggered when the home_fouls_button is clicked
     * @param view
     */
    public void updateHomeTeamFouls(View view){
        scoreboard.updateFoulsForHomeTeam();
        displayFoulsForHomeTeam();
    }

    /**
     * This event is triggered when the guest_fouls_button is clicked
     * @param view
     */
    public void updateGuestTeamFouls(View view){
        scoreboard.updateFoulsForGuestTeam();
        displayFoulsForGuestTeam();
    }

    /**
     * This event is triggered when the home_yellows_button is clicked
     * @param view
     */
    public void updateHomeTeamYellows(View view){
        scoreboard.updateYellowsForHomeTeam();
        displayYellowsForHomeTeam();
    }

    /**
     * This event is triggered when the guest_yellows_button is clicked
     * @param view
     */
    public void updateGuestTeamYellows(View view){
        scoreboard.updateYellowsForGuestTeam();
        displayYellowsForGuestTeam();
    }

    /**
     * This event is triggered when the home_reds_button is clicked
     * @param view
     */
    public void updateHomeTeamReds(View view){
        scoreboard.updateRedsForHomeTeam();
        displayRedsForHomeTeam();
    }

    /**
     * This event is triggered when the guest_reds_button is clicked
     * @param view
     */
    public void updateGuestTeamReds(View view){
        scoreboard.updateRedsForGuestTeam();
        displayRedsForGuestTeam();
    }

}
