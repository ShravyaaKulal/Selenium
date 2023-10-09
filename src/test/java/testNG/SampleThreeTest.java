package testNG;

import org.testng.annotations.Test;

public class SampleThreeTest {
  @Test(groups = "featureOne")
  public void testOne() {
	  System.out.println("Test31 in SampleFour");
  }
  @Test(groups = "featureTwo")
  public void testTwo() {
	  System.out.println("Test32 in SampleFour");
}
  @Test(groups = "featureThree")
  public void testThree() {
	  System.out.println("Test33 in SampleFour");
  }
  @Test
  public void testFour() {
	  System.out.println("Test34 in SampleFour");
  }
}


