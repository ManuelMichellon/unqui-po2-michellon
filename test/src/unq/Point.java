package unq;

public class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void moveTo(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public void sum(Point point1) {
		this.sumX(point1.getX());
		this.sumY(point1.getY());
	}

	private void sumY(int y2) {
		this.y = y + y2;
	}

	private void sumX(int x2) {
		this.x = x + x2;
	}
	
	
}
