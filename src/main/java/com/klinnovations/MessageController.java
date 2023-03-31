package com.klinnovations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController<return2> {
	private Logger logger = LoggerFactory.getLogger(MessageController.class);
			
			
	@GetMapping("/welcome")
	public String welcomeMsg() {
		logger.info("welcomeMsg() execution Started..");
		
		try {
		int i = 10/0;
		}catch(Exception e) {
       logger.error("Exception occured"+e.getMessage());			
		}
		logger.warn("This is warning from welcome method");
		
		String msg = "welcome to Laxman";
		
		logger.info("welcomeMsg() execution Ended..");
		return msg;
		
	}
	
	@GetMapping("/greet")
	public String greetMsg() {
		logger.info("greetMsg() excution Started...");
		
		String s = null;
		s.length();
		
		String msg = "Good Afternoon";
		
		logger.info("greetMsg() excution Ended...");
		return msg;
		
	}

}
