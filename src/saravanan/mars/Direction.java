package saravanan.mars;

public enum Direction {
	
    NORTH(0, "North"),
    EAST(1, "East"),
    SOUTH(2, "South"),
    WEST(3, "West");
	
	private int value;
	private String name;
	
	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

	private Direction(int Value, String Name)
	{
		this.value = Value;
		this.name = Name;
	}
	
	// intentionally hard coded 4 for 4 sides
	// improve later
	public Direction Left(Direction dir) {
		int newValue = (dir.getValue() + 4 - 1) % 4;
		return Direction.values()[newValue];
	}
	public Direction Right(Direction dir) {
		int newValue = (dir.getValue() + 4 + 1) % 4;
		return Direction.values()[newValue];
	}
	
}
