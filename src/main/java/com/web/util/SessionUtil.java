package com.web.util;

import java.security.SecureRandom;
import java.util.List;
import org.springframework.stereotype.Component;



@Component
public class SessionUtil {
	
	
	  public List<String> userSessions;
	
	 
	 
	 public SessionUtil(List<String> userSessions) {
		super();
		this.userSessions = userSessions;
	}


	private  final String CHARACTERS = "0123456789";
		
		
		public  String generateSessionId() {
			int length =6;
	        SecureRandom random = new SecureRandom();
	        StringBuilder password = new StringBuilder();

	        for (int i = 0; i < length; i++) {
	            int randomIndex = random.nextInt(CHARACTERS.length());
	            password.append(CHARACTERS.charAt(randomIndex));
	        }

	        return password.toString();
	    }

}
