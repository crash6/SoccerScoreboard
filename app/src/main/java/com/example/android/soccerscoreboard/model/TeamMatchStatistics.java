package com.example.android.soccerscoreboard.model;

/**
 * This class contains all the statistics data (such as _score,fouls etc..) for a soccer team,
 * during a match
 */

public class TeamMatchStatistics {

    static final int INITIAL_SCORE          = 0;    //Initial value for _score
    static final int INITIAL_FOULS          = 0;    //Initial value for the number of fouls
    static final int INITIAL_YELLOW_CARDS   = 0;    //Initial value for the number of yellow cards
    static final int INITIAL_RED_CARDS      = 0;    //Initial value for the number of red cards

    private int _score;
    private int _fouls;
    private int _yellowCards;
    private int _redCards;

    /**
     * Constructor method
     */
    public TeamMatchStatistics(){
        initStatistics();
    }

    /**
     * This method initializes the statistics data of the match for the team
     */
    public void initStatistics(){
        _score = INITIAL_SCORE;
        _fouls = INITIAL_FOULS;
        _yellowCards = INITIAL_YELLOW_CARDS;
        _redCards = INITIAL_RED_CARDS;
    }

    //Below the list of the getter methods for this class

    /*+
     * This method returns the score
     */
    public int getScore(){
        return _score;
    }

    /*+
     * This method returns the number of fouls
     */
    public int getFouls(){
        return _fouls;
    }

    /*+
     * This method returns the number of yellow cards
     */
    public int getYellowsCards(){
        return _yellowCards;
    }

    /*+
     * This method returns the number of red cards
     */
    public int getRedCards(){
        return _redCards;
    }

    //Below the list of the setter methods for this class

    /**
     * Sets the score for this team
     * @param score
     */
    public void setScore(int score){
        //Skips negative values
        if(score < 0 ){
            return;
        }
        _score = score;
    }

    /**
     * Sets the number of fouls for this team
     * @param fouls
     */
    public void setFouls(int fouls){
        //Skips negative values
        if(fouls < 0 ){
            return;
        }
        _fouls = fouls;
    }

    /**
     * Sets the number of yellow cards for this team
     * @param yellowCards
     */
    public void setYellowCards(int yellowCards){
        //Skips negative values
        if(yellowCards < 0 ){
            return;
        }
        _yellowCards = yellowCards;
    }

    /**
     * Sets the number of red cards for this team
     * @param redCards
     */
    public void setRedCards(int redCards){
        //Skips negative values
        if(redCards < 0 ){
            return;
        }
        _redCards = redCards;
    }

}
