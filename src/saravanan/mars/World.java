package saravanan.mars;

import java.util.ArrayList;
import java.util.List;

// it is a Mars world
public class World {
	private int maxX = 10; // max pixels
	private int maxY = 10; // max pixels


	private List<Obstacle> obstacles = new ArrayList<>();

	public World(int x, int y) {
		super();
		// assuming you are sending valid x and y
		this.maxX = x;
		this.maxY = y;
	}
	

	public List<Obstacle> getObstacles() {
		return obstacles;
	}

	public void addObstacle(Obstacle obs)
	{
		obstacles.add(obs);
	}

	private Point wrapOnEdge(Point p)
	{
		if (p.x < 1 )
			p.x = this.maxX;
		else if (p.x > this.maxX)
			p.x = 1;
		
		if (p.y < 1 )
			p.y = this.maxY;
		else if (p.y > this.maxY)
			p.y = 1;
		
		return p;
	}
	
	public Point checkBeforeGo(Point p)
	{
		
		p = wrapOnEdge(p);
		
		for (Obstacle obstacle : obstacles)
		{
			if (obstacle.getX() == p.x && obstacle.getY() == p.y)
			{
				return null;
			}
		}
		
		return p;
	}
	
	

	
}
