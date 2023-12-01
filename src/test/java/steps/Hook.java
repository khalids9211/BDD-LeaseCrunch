package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hook {
	@BeforeAll
	public static void  before_all() {
		
		System.out.println("create db connection - Befor all");
	}
	
	@AfterAll
	public static void after_all() {
		
		System.out.println("Closing db connection - after all");
	}
	
	@Before(order=0)
	public void setup() {
		System.out.println("Before hook - launching a chrome browser");
		
	}
	@Before(order=1)
	public void setup1() {
		System.out.println("Before hook - launching a edge browser");
		
	}

	@After(order=1)
	public void tearDown() {
		
		System.out.println("after hook - quiting the chrome browser");
		
	}
	@After(order=0)
	public void tearDown1() {
		
		System.out.println("after hook - quiting the edge browser");
		
	}
	
	@BeforeStep
	public void beforeeachSteps() {
		
		System.out.println("adding a log - before each steps");
	}
	@AfterStep
	public void aftereachSteps() {
		
		System.out.println("Deleting a log - after each steps");
	}
}
