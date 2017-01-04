package saravanan.mars;

public class Rover extends Point {
	
	private String name = "";
	private String Hitting = "";
	protected Direction dir;
	private RoverMovement roverMove ;
	

	public Rover(String name, int x, int y, Direction dir, World world)
	{
		super(x, y);
		this.name = name;
		this.dir = dir;
		roverMove = new RoverMovement(this, world);
		// to understand new Rover is created at a pixel with a direction
		System.out.println("   " + this);
		
	}
	
	protected void movePoint(Point p)
	{
		this.x = p.x;
		this.y = p.y;
	}
	
	public void Actions(String side)	{
		for (char ch : side.toCharArray()) {
			if (! Action(String.valueOf(ch)))
				break;
		}
	}

	public boolean Action(String side)
	{
			boolean NoObstacle = true;
			switch (side.toUpperCase()) {
				case "L":
					dir = dir.Left(dir);
					break;
				case "R":
					dir = dir.Right(dir);
					break;
				case "F":
					NoObstacle = roverMove.Forward();
					break;
				case "B":
					NoObstacle = roverMove.Backword();
					break;
			}
			
			if (NoObstacle )
				Hitting = ""; 
			else
				Hitting = " - Hit ";
			
			System.out.println(side.toUpperCase() + "  " + this);
			
			return NoObstacle;

	}
	
	public String getName() {
		return name;
	}

	public String getHitting() {
		return Hitting;
	}	

	
	@Override
	public String toString() {
		return this.getName() + 
				" Location : X " + this.x + 
				", Y " + this.y + 
				", Direction : " + dir.getName() + 
				" " + this.getHitting();
	}
			
}
