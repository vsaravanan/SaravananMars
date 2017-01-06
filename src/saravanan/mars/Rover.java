package saravanan.mars;

public class Rover extends Point {
	
	private String name = "";
	private String hitting = "";
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
	
	public void actions(String side)	{
		for (char ch : side.toCharArray()) {
			if (! action(String.valueOf(ch)))
				break;
		}
	}

	public boolean action(String side)
	{
			boolean noObstacle = true;
			switch (side.toUpperCase()) {
				case "L":
					dir = dir.left(dir);
					break;
				case "R":
					dir = dir.right(dir);
					break;
				case "F":
					noObstacle = roverMove.Forward();
					break;
				case "B":
					noObstacle = roverMove.Backword();
					break;
			}
			
			if (noObstacle )
				hitting = ""; 
			else
				hitting = " - Hit ";
			
			System.out.println(side.toUpperCase() + "  " + this);
			
			return noObstacle;

	}
	
	public String getName() {
		return name;
	}

	public String getHitting() {
		return hitting;
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
