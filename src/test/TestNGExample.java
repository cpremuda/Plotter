package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGExample {
	   String message = "Hello World";	
	  

	   @Test
	   public void testPrintMessage() {	  
	      Assert.assertEquals(message, "Hello World");
	   }
	}
