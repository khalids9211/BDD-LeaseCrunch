package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {

	@Given("user navigates to the LC QA website")
	public void user_navigates_to_the_lc_qa_website() {
	  System.out.println("user navigates to LC QA");
	}

	@When("user validates that LC Web home page lucnched")
	public void user_validates_that_lc_web_home_page_lucnched() {
	    System.out.println("LC Web home page lucnched");
	}

	@Then("user enters Firm Admin email")
	public void user_enters_firm_admin_email() {
	    System.out.println("user enters firm admin emails");
	}

	@And("user click on Next button")
	public void user_click_on_next_button() {
	   System.out.println("click on Next button");
	}

	@Then("user enters Firm user email")
	public void user_enters_firm_user_email() {
	   System.out.println("User enters Firm user email");
	}
}
