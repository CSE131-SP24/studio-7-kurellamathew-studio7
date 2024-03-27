package studio7;

public class Die {
	private int sides;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die standard = new Die(6);
		System.out.println(standard.result());

	}
	
	public Die(int sides)  {
		this.sides = sides;
	}
	
	public int result()  {
		int result = (int) Math.round(this.sides*Math.random()+1);
		return result;
	}

}
