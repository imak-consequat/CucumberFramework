package testNGProj;

import org.testng.annotations.Test;


public class TestAnatAttribute_DependsOnMethods {
  @Test(priority=1)
  public void test1() {
	  System.out.println("test 1 method");
  }
  
  @Test
  public void bero() {
	  System.out.println("bero method");
  }
  
  @Test(dependsOnMethods="test3")
  public void zero() {
	  System.out.println("zero method");
  }
  
  @Test(priority=-1, dependsOnMethods= {"test2","test1"})
  public void nero() {
	  System.out.println("nero method");
  }
  @Test(priority=2, invocationCount=2)
  public void test2() {
	  System.out.println("test 2 method");
  }
  
  @Test
  public void test3() {
	  System.out.println("test 3 method");
  }

 
 

}
