package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import com.main.Visualizer;

public class InitializeVizualizerTest {
	Visualizer v;
	
	@BeforeMethod
	public void setUp() {
		v = new Visualizer();
		v.initialize();
	}
	
	@Test
	public void checkBoundsandBorders() {
		Assert.assertEquals(v.getBounds().getHeight(), 640.0);
		Assert.assertEquals(v.getBounds().getWidth(), 950.0);
		Assert.assertEquals(v.getBounds().getX(), 20.0);
		Assert.assertEquals(v.getBounds().getY(), 23.0);
		Assert.assertEquals(v.getBounds().getCenterX(), 495.0);
		Assert.assertEquals(v.getBounds().getCenterY(), 343.0);
		
		v.setBounds(10, 11, 1000, 700);
		
		Assert.assertEquals(v.getBounds().getHeight(), 700.0);
		Assert.assertEquals(v.getBounds().getWidth(), 1000.0);
		Assert.assertEquals(v.getBounds().getX(), 10.0);
		Assert.assertEquals(v.getBounds().getY(), 11.0);
		
		Assert.assertEquals(v.BUTTOMBORDER, 100);
		Assert.assertEquals(v.UPBORDER, 40);
		Assert.assertEquals(v.LEFTBORDER, 0);
		Assert.assertEquals(v.RIGHTBORDER, 150);
		//Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void checkDefaultVals() {
		Assert.assertEquals(v.displayedFunction.getText(), "sin(x)");
		Assert.assertEquals(v.displayedA.getText(), "0.0");
		Assert.assertEquals(v.displayedB.getText(), "6.29");
		Assert.assertEquals(v.getTitle(), "Math graphics 2.0.1 ");
		
		v.setTitle("Math graphics 2.0.2");
		
		Assert.assertEquals(v.getTitle(), "Math graphics 2.0.2");
		
		
		Assert.assertEquals(v.VISUALIZATION_STATE, 0); //Cartesian state
		
		v.VISUALIZATION_STATE = v.POLAR2D_STATE;
		
		Assert.assertEquals(v.VISUALIZATION_STATE, 1); //Polar state
	}
	
	@Test
	public void checkDefaultColors() {
		Assert.assertEquals(v.BACKGROUND_COLOR.getRed(), 255);
		Assert.assertEquals(v.BACKGROUND_COLOR.getGreen(), 255);
		Assert.assertEquals(v.BACKGROUND_COLOR.getBlue(), 255);
		
		Assert.assertEquals(v.PANEL_COLOR.getRed(), 205);
		Assert.assertEquals(v.PANEL_COLOR.getGreen(), 190);
		Assert.assertEquals(v.PANEL_COLOR.getBlue(), 112);
	}
	
	@Test
	public void checkMenuBar() {
		Assert.assertEquals(v.getJMenuBar().getComponentCount(), 4);
		Assert.assertNotEquals(v.getJMenuBar().getComponent(0).toString().indexOf("Do"), -1);
		Assert.assertNotEquals(v.getJMenuBar().getComponent(1).toString().indexOf("Visualization"), -1);
		Assert.assertNotEquals(v.getJMenuBar().getComponent(2).toString().indexOf("Colors"), -1);
		Assert.assertNotEquals(v.getJMenuBar().getComponent(3).toString().indexOf("Save"), -1);
	}
}
