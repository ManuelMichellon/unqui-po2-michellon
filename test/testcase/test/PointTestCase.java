package test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import unq.Point;

class PointTestCase {
	private Point point;
	private Point point1;
	
	@Test
	public void testCreatePoint() {
		point = new Point(1, 2);
		
		assertEquals(point.getX(), 1);
		assertEquals(point.getY(), 2);
	}
	
	@Test
	public void testEmptyPoint() {
		point = new Point();
		
		assertEquals(point.getX(), 0);
		assertEquals(point.getY(), 0);
	}
	
	@Test
	public void testMovePoint() {
		point = new Point();
		
		point.moveTo(1, 2);
		
		assertEquals(point.getX(), 1);
		assertEquals(point.getY(), 2);
	}
	
	@Test
	public void testSumPoints() {
		point = new Point(1, 2);
		point1 = new Point(1, 1);
		
		point.sum(point1);
		
		assertEquals(point.getX(), 2);
		assertEquals(point.getY(), 3);
	}

}
