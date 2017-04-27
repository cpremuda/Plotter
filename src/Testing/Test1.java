package Testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.Visualizer;

public class Test1 {
	
  @Test
  public void A() {
	  Visualizer qua=new Visualizer();
		qua.initialize();
		
		Assert.assertEquals("frame0", qua.getName());
  }
  
  @Test
  public void B() {
	  Visualizer qua=new Visualizer();
		qua.initialize();
		
		Assert.assertEquals("Math graphics 2.0.1 ", qua.getTitle());
  }
  
  @Test
  public void C() {
	  Visualizer qua=new Visualizer();
		qua.initialize();
		
		Assert.assertFalse(qua.isDerivativeDisplay);
		
		//System.out.println(qua.isDerivativeDisplay);
  }
}
