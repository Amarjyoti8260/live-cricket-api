package com.demoscarpping.webscarping.services;


import com.demoscarpping.webscarping.models.Match;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class MatchService {


    public void test()  {

        String url = "https://www.learncodewithdurgesh.com/";

        try {
            Document document =  Jsoup.connect(url).get();
            System.out.println(document.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



    public List<Match> getLiveMatches(){

        String url ="https://www.cricbuzz.com/cricket-match/live-scores";
        List<Match> matchList = new ArrayList<>();

        try {
            Document document =Jsoup.connect(url).get();

            Elements liveScoreElements = document.select("div.cb-mtch-lst.cb-tms-itm");



            for(Element element:liveScoreElements){
                String teamHeading =element.select("h3.cb-lv-scr-mtch-hdr").select("a").text();

                String matchNumberAndVenue = element.select("span").text();
                String battingTeam = element.select("div.cb-hmscg-bat-txt").select("div.cb-hmscg-tm-nm").text();

                String bowlingTeam = element.select("div.cb-hmscg-bwl-txt ").select("div.cb-hmscg-tm-nm").text();

                String bowlTeamScore = element.select("div.cb-hmscg-bwl-txt ").select("div.cb-hmscg-tm-nm+div").text();

                String battingTeamScore = element.select("div.cb-hmscg-bat-txt").select("div.cb-hmscg-tm-nm+div").text();

                Match match = new Match();
                match.setMatchHeading(teamHeading);
                match.setMatchNumberAndVenue(matchNumberAndVenue);
                match.setBattingTeamName(battingTeam);
                match.setBattingTeamScore(battingTeamScore);
                match.setBowlTeamName(bowlingTeam);
                match.setBowlTeamScore(bowlTeamScore);

                //  addd this match to list

                matchList.add(match);


            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return  matchList;

    }




}
