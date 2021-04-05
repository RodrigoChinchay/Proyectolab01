
public class Coordenada {
	private double x;
	private double y;
	
	public Coordenada() {
		this(0,0);
		
	}
	public Coordenada(double x, double y) {
		this.x= x;
		this.y= y;
	}
	public Coordenada(Coordenada c) {
		this.x = c.x;
		this.y = c.y;
	}
	public double getX() {
		return this.x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double distancia(Coordenada c) {
		double dist = Math.sqrt(Math.pow(c.x-this.x,2)+Math.pow(c.y - this.y,2));
		return dist;
	}
	public static double distancia(Coordenada c1,Coordenada c2) {
		double dist = Math.sqrt(Math.pow(c2.x-c1.x,2)+Math.pow(c2.y - c1.y,2));
		return dist;
	}
	@Override
	public String toString() {
		return "Coordenada [x=" + x + ", y=" + y + "]";
	}
}
