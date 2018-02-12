package test.java.com.unagis.container.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import main.java.com.unagis.container.operations.Calculator;

public class AdditionTest {
  @Test
  public void addTest01() {
	  
	  assertEquals(Calculator.add(2, 4), (2+4));
  }
  @Test
  public  void addTest02()
  {
	  assertEquals(Calculator.add(0, 0), 0);
  }
  
  @Test
  public void addTest003()
  {
	  assertEquals(Calculator.add(Integer.MAX_VALUE, Integer.MIN_VALUE), -1);
  }
}
