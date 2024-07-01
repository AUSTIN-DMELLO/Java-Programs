import java.util.*;

public class Triangle
{
	public static void main(String[] args) 
	{
		double Perimeter, s, Area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Enter the Three sides of triangle: ");
		double side1 = sc.nextDouble();
		double side2 = sc.nextDouble();
		double side3 = sc.nextDouble();

		Perimeter = side1 + side2 + side3;
		s = Perimeter/2; 
		Area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

		System.out.format("\n The Area of the triangle = %.2f\n",Area);
	}
}