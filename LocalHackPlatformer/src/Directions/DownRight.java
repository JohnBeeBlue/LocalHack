package Directions;

public class DownRight implements Direction{

	private final int x;
	private final int y;
	
	public DownRight(){
		x = 1;
		y = 1;
	}
	
	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}
	
	@Override
	public boolean checkEquals(Direction direction) {
		if (direction.getX() == x && direction.getY() == y) {
			return true;
		} else {
			return false;
		}
	}
}
