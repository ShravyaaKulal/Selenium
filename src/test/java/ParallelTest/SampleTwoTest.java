package ParallelTest;

import org.testng.annotations.Test;

public class SampleTwoTest {
  /*@Test
  public void testOne() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test21 in SampleThree....."+id);
  }
  @Test
  public void testTwo() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test22 in SampleThree....."+id);
  }
  @Test
  public void testThree() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test23 in SampleThree....."+id);
  }*/
  @Test(invocationCount=6, threadPoolSize=2, timeOut=10000)
  public void testFour() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test24 in SampleThree....."+id);
  }
}
