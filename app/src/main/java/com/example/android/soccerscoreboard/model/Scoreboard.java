package com.example.android.soccerscoreboard.model;

/**
 * This class represents the scoreboard shown on the activity
 */

public class Scoreboard {

    private TeamMatchStatistics _homeTeamStat  ; //Match statistics for the Home team
    private TeamMatchStatistics _guestTeamStat ; //Match statistics for the Guest team

    private static Scoreboard mScoreboard;

    /**
     * This method used the pattern Singleton to create a single reference for this class
     * @return reference to an object Scoreboard
     */
    public static Scoreboard create(){
        if(mScoreboard != null){
            return mScoreboard;
        }

        mScoreboard = new Scoreboard();
        return mScoreboard;
    }


    /**
     * Constructor method for the Scoreboard
     */
    private Scoreboard(){
        _homeTeamStat  = new TeamMatchStatistics();
        _guestTeamStat = new TeamMatchStatistics();
    }

    /**
     * This method updates the score for the Home team
     */
    public void updateScoreForHomeTeam(){
        int oldVal;

        oldVal = _homeTeamStat.getScore();
        _homeTeamStat.setScore(oldVal + 1);
    }

    /**
     * This method updates the score for the Guest team
     */
    public void updateScoreForGuestTeam(){
        int oldVal;

        oldVal = _guestTeamStat.getScore();
        _guestTeamStat.setScore(oldVal + 1);
    }

    /**
     * This method updates the number of fouls for the Home team
     */
    public void updateFoulsForHomeTeam(){
        int oldVal;

        oldVal = _homeTeamStat.getFouls();
        _homeTeamStat.setFouls(oldVal + 1);
    }

    /**
     * This method updates the number of fouls for the Guest team
     */
    public void updateFoulsForGuestTeam(){
        int oldVal;

        oldVal = _guestTeamStat.getFouls();
        _guestTeamStat.setFouls(oldVal + 1);
    }

    /**
     * This method updates the number of yellow cards for the Home team
     */
    public void updateYellowsForHomeTeam(){
        int oldVal;

        oldVal = _homeTeamStat.getYellowsCards();
        _homeTeamStat.setYellowCards(oldVal + 1);
    }

    /**
     * This method updates the number of yellow cards for the Guest team
     */
    public void updateYellowsForGuestTeam(){
        int oldVal;

        oldVal = _guestTeamStat.getYellowsCards();
        _guestTeamStat.setYellowCards(oldVal + 1);
    }

    /**
     * This method updates the number of red cards for the Home team
     */
    public void updateRedsForHomeTeam(){
        int oldVal;

        oldVal = _homeTeamStat.getRedCards();
        _homeTeamStat.setRedCards(oldVal + 1);
    }

    /**
     * This method updates the number of red cards for the Guest team
     */
    public void updateRedsForGuestTeam(){
        int oldVal;

        oldVal = _guestTeamStat.getRedCards();
        _guestTeamStat.setRedCards(oldVal + 1);
    }

    /**
     * This method returns the score the Home team
     */
    public int getHomeTeamScore(){
        return _homeTeamStat.getScore();
    }

    /**
     * This method returns the score for the Guest team
     */
    public int getGuestTeamScore(){
        return _guestTeamStat.getScore();
    }

    /**
     * This method returns the fouls for the Home team
     */
    public int getHomeTeamFouls(){
        return _homeTeamStat.getFouls();
    }

    /**
     * This method returns the fouls for the Guest team
     */
    public int getGuestTeamFouls(){
        return _guestTeamStat.getFouls();
    }

    /**
     * This method returns the yellow cards for the Home team
     */
    public int getHomeTeamYellows(){
        return _homeTeamStat.getYellowsCards();
    }

    /**
     * This method returns the yellow cards for the Guest team
     */
    public int getGuestTeamYellows(){
        return _guestTeamStat.getYellowsCards();
    }

    /**
     * This method returns the red cards for the Home team
     */
    public int getHomeTeamReds(){
        return _homeTeamStat.getRedCards();
    }

    /**
     * This method returns the red cards for the Guest team
     */
    public int getGuestTeamReds(){
        return _guestTeamStat.getRedCards();
    }

    /**
     * This method reset to defaults the scoreboard
     */
    public void reset(){
        _homeTeamStat.initStatistics();
        _guestTeamStat.initStatistics();
    }
}
