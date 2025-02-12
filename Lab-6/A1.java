import java.util.Scanner;
public class A1{
	public static double area(int r){
		double a=0.0;
		a = 3.14 * r * r;
		return a;
	}
	public static void main(String[] args){
		System.out.print("Enter the value of radius = ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double a=area(r);
		System.out.println("Area of circle is = "+a);

	}
}