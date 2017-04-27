package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Properties;

import java.awt.Color;

import com.main.Colorpanel;
import com.main.Visualizer;

public class ColorPanelTest {	
	@Test
	public void colorPanelSelectsCorrectColor() {	  
		Visualizer qua = new Visualizer();
		qua.initialize();
		
		//test background color
		qua.BACKGROUND_COLOR = new Color(111,112,113);
		Assert.assertEquals(qua.BACKGROUND_COLOR.getRed(), 111);
		Assert.assertEquals(qua.BACKGROUND_COLOR.getGreen(), 112);
		Assert.assertEquals(qua.BACKGROUND_COLOR.getBlue(), 113);
		
		//test panel color
		qua.PANEL_COLOR = new Color(221,222,223);
		Assert.assertEquals(qua.PANEL_COLOR.getRed(), 221);
		Assert.assertEquals(qua.PANEL_COLOR.getGreen(), 222);
		Assert.assertEquals(qua.PANEL_COLOR.getBlue(), 223);
		
		//test line color
		qua.LINE_COLOR = new Color(221,222,223);
		Assert.assertEquals(qua.LINE_COLOR.getRed(), 221);
		Assert.assertEquals(qua.LINE_COLOR.getGreen(), 222);
		Assert.assertEquals(qua.LINE_COLOR.getBlue(), 223); 
		
		//test second line color
		qua.LINE_2_COLOR = new Color(221,222,223);
		Assert.assertEquals(qua.LINE_2_COLOR.getRed(), 221);
		Assert.assertEquals(qua.LINE_2_COLOR.getGreen(), 222);
		Assert.assertEquals(qua.LINE_2_COLOR.getBlue(), 223);
		
		//test axes line color
		qua.AXIS_COLOR = new Color(221,222,223);
		Assert.assertEquals(qua.AXIS_COLOR.getRed(), 221);
		Assert.assertEquals(qua.AXIS_COLOR.getGreen(), 222);
		Assert.assertEquals(qua.AXIS_COLOR.getBlue(), 223);
		
		//test 3d line color
		qua.LINE_3D_COLOR = new Color(221,222,223);
		Assert.assertEquals(qua.LINE_3D_COLOR.getRed(), 221);
		Assert.assertEquals(qua.LINE_3D_COLOR.getGreen(), 222);
		Assert.assertEquals(qua.LINE_3D_COLOR.getBlue(), 223);
   }
}
