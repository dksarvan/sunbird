package com.org.sunbird;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class openWeb {	
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Inside Before");
  }

  @Test
  public void Test1() {
	  System.out.println("Inside Test");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Inside After");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
