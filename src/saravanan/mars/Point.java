package saravanan.mars;

public class Point {
	protected int x = 0;
	protected int y = 0;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point(Point p) {
		super();
		this.x = p.x;
		this.y = p.y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	
	public boolean equals(Object that) {
		if(this == that) 
			return true;
		
		if (that == null) 
			return false;
		
		if(!(that instanceof Point)) 
			return false;
		
		Point newp = (Point) that;
		
		if (this.x == newp.x && this.y == newp.y)
			return true;
		
		return false;
	}

	


}
