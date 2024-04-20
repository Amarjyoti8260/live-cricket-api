package com.demoscarpping.webscarping.models;

public class Match {
    private  String matchHeading;

    private  String matchNumberAndVenue;

    private String battingTeamName;

    private  String battingTeamScore;


    private  String bowlTeamName;

    private String bowlTeamScore;



    public  Match(){

    }

    public Match(String matchHeading, String matchNumberAndVenue, String battingTeamName, String battingTeamScore, String bowlTeamName, String bowlTeamScore) {
        this.matchHeading = matchHeading;
        this.matchNumberAndVenue = matchNumberAndVenue;
        this.battingTeamName = battingTeamName;
        this.battingTeamScore = battingTeamScore;
        this.bowlTeamName = bowlTeamName;
        this.bowlTeamScore = bowlTeamScore;
    }

    public String getMatchHeading() {
        return matchHeading;
    }

    public void setMatchHeading(String matchHeading) {
        this.matchHeading = matchHeading;
    }

    public String getMatchNumberAndVenue() {
        return matchNumberAndVenue;
    }

    public void setMatchNumberAndVenue(String matchNumberAndVenue) {
        this.matchNumberAndVenue = matchNumberAndVenue;
    }

    public String getBattingTeamName() {
        return battingTeamName;
    }

    public void setBattingTeamName(String battingTeamName) {
        this.battingTeamName = battingTeamName;
    }

    public String getBattingTeamScore() {
        return battingTeamScore;
    }

    public void setBattingTeamScore(String battingTeamScore) {
        this.battingTeamScore = battingTeamScore;
    }

    public String getBowlTeamName() {
        return bowlTeamName;
    }

    public void setBowlTeamName(String bowlTeamName) {
        this.bowlTeamName = bowlTeamName;
    }

    public String getBowlTeamScore() {
        return bowlTeamScore;
    }

    public void setBowlTeamScore(String bowlTeamScore) {
        this.bowlTeamScore = bowlTeamScore;
    }
}
