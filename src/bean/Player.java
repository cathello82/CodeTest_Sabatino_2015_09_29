package bean;

public class Player {
	
	private Point point;
	
	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public Player ()
	{
		point = new Point();		
	}
}
