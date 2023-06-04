import java.util.Scanner;

public class Program {
	
	public static double f(double x) {
		return x * x;
	}
	
	public static double search(double l, double r) {
		double eps = 0.00001;
		
		while (r - l > eps) {
			double m1 = l + (r - l) / 3;
			double m2 = r - (r - l) / 3;
			
			if (f(m1) < f(m2)) {
				l = m1;
			}
			else {
				r = m2;
			}
		}
		
		return Math.round(l);
	}
	
	public static void main(String[] args) {
		System.out.println("Введите левое значение x");
		double l = new Scanner(System.in).nextDouble();
		System.out.println("Введите правое значение x");
		double r = new Scanner(System.in).nextDouble();
		System.out.println("Наибольшее значение функция принимает в точке: " + search(l, r));
	}
}
