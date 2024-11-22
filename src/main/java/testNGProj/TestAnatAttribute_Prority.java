package testNGProj;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;



import java.util.NoSuchElementException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestAnatAttribute_Prority {
  @Test(priority=1)
  public void test1() {
	  System.out.println("test 1 method");
  }
  
  @Test
  public void bero() {
	  System.out.println("bero method");
	  throw new NoSuchElementException();
  }
  
  @Test
  public void zero() {
	  System.out.println("zero method");
  }
  
  @Test(priority=-1)
  public void nero() {
	  System.out.println("nero method");
  }
  @Test(priority=2)
  public void test2() {
	  System.out.println("test 2 method");
  }
  
  @Test(priority=3)
  public void test3() {
	  System.out.println("test 3 method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest");
	  throw new NoSuchElementException();
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite");
  }

}
