package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.Point;
import unq.Rectangle;

class RectangleTestCase {
	private Point point;
	private Rectangle rectangle;
	
	@BeforeEach
	private void setUp() {
		point = new Point(1,2);
		rectangle = new Rectangle(point);

	}

	@Test
	void testCreate() {
		
		assertEquals(rectangle.getFirsPoint().getX(), 0);
		assertEquals(rectangle.getFirsPoint().getY(), 0);
		assertEquals(rectangle.getSecondPoint().getX(), 1);
		assertEquals(rectangle.getSecondPoint().getY(), 2);
	}
	
	@Test
	void testGetArea() {
		assertEquals(rectangle.getArea(), 2);
	}

	@Test
	void testGetPerimeter() {
		assertEquals(rectangle.getPerimeter(), 6);
	}

	@Test
	void testPosition() {
		assertTrue(rectangle.isVertical());
		assertFalse(rectangle.isHorizontal());
	}
	

}
