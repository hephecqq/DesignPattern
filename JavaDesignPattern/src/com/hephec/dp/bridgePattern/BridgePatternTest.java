package com.hephec.dp.bridgePattern;

import org.junit.Test;

public class BridgePatternTest {

	@Test
	public void test(){
		  Shape redCircle = new Circle(100,100, 10, new RedCircle());
	      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

	      redCircle.draw();
	      greenCircle.draw();
	}
}
