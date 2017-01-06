package saravanan.mars;

public class RoverMovement {
	
	private Rover rover;
	private static World world;


	public RoverMovement(Rover rover, World w) {
		super();
		this.rover = rover;
		world = w;

	}


	private boolean move(int straightOpposite)
	{
	

			Point oldP = (Point) rover;
			// clone temporarily to check obstacle error
			Point p = new Point(oldP); 
			
			switch (rover.dir)
			{
				case NORTH :
					p.y = p.y + straightOpposite;
					break;
				case SOUTH :
					p.y = p.y - straightOpposite;
					break;
				case EAST :
					p.x = p.x + straightOpposite;
					break;
				case WEST :
					p.x = p.x - straightOpposite;
					break;

			}

			Point newP = world.checkBeforeGo(p);
			if (newP == null || oldP.equals(newP))
			{
				// obstacle hit
				// expecting there should be movement
				// from old point to new point
				return false; 
			}				
			else
			{
				// rover is moving to new position
				rover.movePoint(newP);
				return true;
			}

			
	}
	
	public boolean Forward()
	{
		return move(1);
	}
	
	public boolean Backword()
	{
		return move(-1);
	}

}
