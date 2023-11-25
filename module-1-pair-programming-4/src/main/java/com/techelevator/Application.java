package com.techelevator;
import com.techelevator.search.SearchDomain;
import com.techelevator.search.SearchEngine;
import com.techelevator.util.TELog;

public class Application {

	public static void main(String[] args) {
		
		try {

			// Step Two: Create TELog, and log the start of the application.
			//
			TELog.log("Search Application Started");
			
			// Step Four: Instantiate a Search Domain
			//
			SearchDomain domain = new SearchDomain("data");
			System.out.println(domain.toString());
			// Step Six: Single word search
			//

			SearchEngine domain1 = new SearchEngine(domain);
			
			// Step Seven: Multiple word search
			//
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
