package studio7;

public class Rectangle {
	private double l;
	private double w;

	public static void main(String[] args) {
		Rectangle One = new Rectangle(5.0, 2.0);
		System.out.println(One.area());
		

	}
	public Rectangle(double l, double w)  {
		this.l = l;
		this.w = w;
	}
	
	public double area() {
		return (this.l*this.w);
	}
	
	public double perimeter()  {
		return (2*this.l + 2*this.w);
	}
	
	public boolean square() {
		if (this.l == this.w)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
