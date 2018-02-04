package com.example.android.soccerscoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.soccerscoreboard.model.Scoreboard;

public class ScoreboardActivity extends AppCompatActivity {

    private Scoreboard scoreboard;

    //TextViews frequently updated on screen
    TextView homeScore;
    TextView guestScore;
    TextView homeFouls;
    TextView homeYellowCards;
    TextView homeRedCards;
    TextView guestFouls;
    TextView guestYellowCards;
    TextView guestRedCards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_scoreboard);

        //This line avoid the problem of screen rotation, in the sense that when the screen is
        //rotated, the reference to the scoreboard is restored
        scoreboard = Scoreboard.create();

        loadTextViewsRef();
        displayAllStatistics();
    }

    /**
     * This method, called once at the application startup, retrieves all the object references for
     * those text views, shown on this activity, which will be frequently updated
     */
    private void loadTextViewsRef(){
        TextView value;

        //Home score TextView
        value = (TextView) findViewById(R.id.home_score_field);
        homeScore = value;

        //Guest score TextView
        value = (TextView) findViewById(R.id.guest_score_field);
        guestScore = value;

        //Home fouls TextView
        value = (TextView) findViewById(R.id.home_fouls_field);
        homeFouls = value;

        //Home yellow cards TextView
        value = (TextView) findViewById(R.id.home_yellows_field);
        homeYellowCards = value;

        //Home red cards TextView
        value = (TextView) findViewById(R.id.home_reds_field);
        homeRedCards = value;

        //Guest fouls TextView
        value = (TextView) findViewById(R.id.guest_fouls_field);
        guestFouls = value;

        //Guest yellow cards TextView
        value = (TextView) findViewById(R.id.guest_yellows_field);
        guestYellowCards = value;

        //Guest red cards TextView
        value = (TextView) findViewById(R.id.guest_reds_field);
        guestRedCards = value;
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
        homeScore.setText(String.valueOf(this.scoreboard.getHomeTeamScore()));
    }

    /**
     * This method displays the score for the Guest team
     */
    private void displayScoreForGuestTeam(){
        guestScore.setText(String.valueOf(this.scoreboard.getGuestTeamScore()));
    }

    /**
     * This method displays the fouls for the Home team
     */
    private void displayFoulsForHomeTeam(){
        homeFouls.setText(String.valueOf(this.scoreboard.getHomeTeamFouls()));
    }

    /**
     * This method displays the fouls for the Guest team
     */
    private void displayFoulsForGuestTeam(){
        guestFouls.setText(String.valueOf(this.scoreboard.getGuestTeamFouls()));
    }

    /**
     * This method displays the yellow cards for the Home team
     */
    private void displayYellowsForHomeTeam(){
        homeYellowCards.setText(String.valueOf(this.scoreboard.getHomeTeamYellows()));
    }

    /**
     * This method displays the yellow cards for the Guest team
     */
    private void displayYellowsForGuestTeam(){
        guestYellowCards.setText(String.valueOf(this.scoreboard.getGuestTeamYellows()));
    }

    /**
     * This method displays the red cards for the Home team
     */
    private void displayRedsForHomeTeam(){
        homeRedCards.setText(String.valueOf(this.scoreboard.getHomeTeamReds()));
    }

    /**
     * This method displays the red cards for the Guest team
     */
    private void displayRedsForGuestTeam(){
        guestRedCards.setText(String.valueOf(this.scoreboard.getGuestTeamReds()));
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
