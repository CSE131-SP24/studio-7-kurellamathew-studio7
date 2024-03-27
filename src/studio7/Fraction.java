package studio7;

public class Fraction {
	private double num1;
	private double den1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Fraction(double num1, double den1)  {
		this.num1 = num1;
		this.den1 = den1;
	}
	
	public double add(double num2, double den2)  {
		if (this.den1 == den2)
		{
			return (this.num1 + num2)/den1;
		}
		else
		{
			double lcmnum1 = this.num1 * den2;
			double lcmnum2 = num2 * this.den1;
			return (lcmnum1 + lcmnum2) / (this.den1 * den2);
		}
	} 
	
	public double multiply(double num2, double den2)  {
			return (this.num1 * num2) / (this.den1 * den2);
	} 
	
	public double reciporcal()  {
			return this.den1 / this.num1;
	} 
	
	public int Fraction()  {
		if (this.num1%this.den1 == 0)
		{
			return 
		}
	}

}
