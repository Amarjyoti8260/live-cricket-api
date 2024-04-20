package com.demoscarpping.webscarping;

import com.demoscarpping.webscarping.models.Match;
import com.demoscarpping.webscarping.services.MatchService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class WebscarpingApplicationTests {

	@Autowired
	private MatchService testService;

//	@Test
//	public void startTest() {
//		System.out.println("start testing");
//		testService.test();
//	}


	@Test
	public  void getLiveMatch(){
		List<Match> liveMatchs = testService.getLiveMatches();

		liveMatchs.forEach(match -> {
			System.out.println(match.getMatchHeading());
		});

	}
}
