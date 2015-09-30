package bean;

public class Point {
	
	private String [] listPoint;
	private int indice;

	public String getValuePoint() {
		return listPoint[indice];
	}
	
	public void addPoint()
	{
		indice++;		
	}
	
	public void setPoint(int index)
	{
		indice = index;
	}
	
	public int getIndice()
	{
		return indice;
	}
	
	public void resetPoint()
	{
		indice = 0;
	}
		
	public Point()
	{
		listPoint = new String[4];
		listPoint[0] = "love";
		listPoint[1] = "fifteen";
		listPoint[2] = "thirty";
		listPoint[3] = "forty";
		indice = 0;
	}
}
