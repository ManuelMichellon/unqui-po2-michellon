package unq;

import java.util.function.BooleanSupplier;

public class Rectangle {
	
	private Point firstPoint;
	private Point secondPoint;

	public Rectangle(Point point) {
		this.firstPoint = new Point(0,0);
		this.secondPoint = point;
	}

	public Point getFirsPoint() {
		return this.firstPoint;
	}

	public Point getSecondPoint() {
		return this.secondPoint;
	}

	public int getArea() {
		return this.getXDistance() * this.getYDistance();
		
	}

	private int getXDistance() {
		int result = 0;
		if (this.firstPoint.getX() < this.secondPoint.getX()) {
			result = this.secondPoint.getX() - this.firstPoint.getX();
		}else {
			 result = this.firstPoint.getX() - this.secondPoint.getX();
		}
		
		return result;
	}
	
	private int getYDistance() {
		int result = 0;
		if (this.firstPoint.getY() < this.secondPoint.getY()) {
			result = this.secondPoint.getY() - this.firstPoint.getY();
		}else {
			 result = this.firstPoint.getY() - this.secondPoint.getY();
		}
		
		return result;
	}

	public int getPerimeter() {
		return (this.getXDistance() + this.getYDistance())*2;
	}

	public Boolean isHorizontal() {
		return this.getXDistance() > this.getYDistance();
	}

	public Boolean isVertical() {
		return this.getXDistance() < this.getYDistance();
	}

}
