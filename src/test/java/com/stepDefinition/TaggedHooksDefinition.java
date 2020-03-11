package com.stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHooksDefinition 
{
   @Before
   public void before()
   {
	   System.out.println("This is Global before hook....");
   }
   
   @After(order=0)
   public void after()
   {
	   System.out.println("This is Global after hook....");
   }
   
   @Before("@first")
   public void firstBefore()
   {
	   System.out.println("This is first scenario before hook...."); 
   }
   
   @After(value="@first",order=1)
   public void firstAfter()
   {
	   System.out.println("This is first scenario after hook...."); 
   }
   
   @Given("^This is first step$")
   public void first_step()
   {
	   System.out.println("This is first step");
   }
   
   @When("^This is second step$")
   public void second_step()
   {
	   System.out.println("This is second step");
   }
   
   @Then("^This is third step$")
   public void third_step()
   {
	   System.out.println("This is third step");
   }
   
 
}
