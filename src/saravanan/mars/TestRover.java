package saravanan.mars;

public class TestRover {

	public static void main(String[] args) {
		World w = new World(8, 8);

		// Testing moves with r1 and r2 
		Rover r1 = new Rover("Rover1", 4,4, Direction.NORTH, w);
		r1.actions("FFFRFFFFFFFLFFFBBBB");
		System.out.println("============================");

		Rover r2 = new Rover("Rover2", 5,5, Direction.EAST, w);
		r2.actions("FFFRFFFFFFFLFFFBBBB");		
		System.out.println("============================");

		// Testing hit on obstacle with r3 and r4 
		w.addObstacle(new Obstacle(6,7));
		w.addObstacle(new Obstacle(8,2));

		
		Rover r3 = new Rover("Rover3", 4,4, Direction.NORTH, w);
		r3.actions("FFFRFFFFFFFLFFFBBBB");
		System.out.println("============================");

		Rover r4 = new Rover("Rover4", 5,5, Direction.EAST, w);
		r4.actions("FFFRFFFFFFFLFFFBBBB");		
		System.out.println("============================");
		
		// Testing Single moves with r5
		Rover r5 = new Rover("Rover5", 6,6, Direction.WEST, w);
		r5.action("F");
		r5.action("L");
		r5.action("B");
		r5.action("R");
		
		
		
	}

}
