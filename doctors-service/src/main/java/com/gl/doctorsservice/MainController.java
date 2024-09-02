package com.gl.doctorsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author - GreenLearner(https://www.youtube.com/channel/UCaH2MTg94hrJZTolW01a3ZA)
 */

@RestController
public class MainController {

    @GetMapping("/doctors")
    public String doctors(){
    	//Uncomment this one to check Circuit breaker pattern using Zuul
    	//We have added timeout parameters in app.yaml of docportaldriver-gateway
		/*
		 * try { Thread.sleep(20000); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */
        return "List of doctors";
    }
}
