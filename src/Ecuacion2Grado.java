import java.util.Scanner;

/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Programa que resuelva una ecuaci�n de segundo grado
* (del tipo ax2 + bx + c = 0).
*
* @author Amparo Izquierdo Ba�ez
* @mail amizba@gmail.com
* 
*/
public class Ecuacion2Grado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1, x2;
		System.out.println("Este programa resuelve ecuaciones de segundo grado.");
		System.out.println("ax^2 + bx + c = 0");
		System.out.println("Por favor, introduzca los valores.");
		System.out.print("a = ");
		double a = sc.nextDouble();
		System.out.print("b = ");
		double b = sc.nextDouble();
		System.out.print("c = ");
		double c = sc.nextDouble();
		// 0x^2 + 0x + 0 = 0
		if ((a == 0) && (b == 0) && (c == 0)) {
			System.out.println("La ecuaci�n tiene infinitas soluciones.");
		}
		// 0x^2 + 0x + c = 0 con c distinto de 0
		if ((a == 0) && (b == 0) && (c != 0)) {
			System.out.println("La ecuaci�n no tiene soluci�n.");
		}
		// ax^2 + bx + 0 = 0 con a y b distintos de 0
		if ((a != 0) && (b != 0) && (c == 0)) {
			System.out.println("x1 = 0");
			System.out.println("x2 = " + (-b / a));
		}
		// 0x^2 + bx + c = 0 con b y c distintos de 0
		if ((a == 0) && (b != 0) && (c != 0)) {
			System.out.println("x1 = x2 = " + (-c / b));
		}
		// ax^2 + bx + c = 0 con a, b y c distintos de 0
		if ((a != 0) && (b != 0) && (c != 0)) {
			double discriminante = b*b - (4 * a * c);
			if (discriminante < 0) {
				System.out.println("La ecuaci�n no tiene soluciones reales");
			} else {
				System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(2 * a));
				System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(2 * a));
			}
		}
	}
}
