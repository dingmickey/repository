package cn.whpu.testMarven01;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCalculator {
	public static Calculator cal = new Calculator();
	@Test
	public void testAdd() {
		 assertEquals(5,cal.add(3,2));
	}
	@Test
	public void tesSubstract() {
		 assertEquals(1,cal.substract(3,2));
	}


}
