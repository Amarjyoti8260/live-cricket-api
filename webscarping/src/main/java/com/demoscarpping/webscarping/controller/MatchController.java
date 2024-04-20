package com.demoscarpping.webscarping.controller;


import com.demoscarpping.webscarping.models.Match;
import com.demoscarpping.webscarping.services.MatchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {

    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    //get live matches

    @GetMapping("/live")
    public List<Match> getLiveMatches(){
        return matchService.getLiveMatches();
    }

}
