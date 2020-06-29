import java.util.Scanner;

public class FahtoCel {

	public static void main(String[] args) {

		double fahrenheit;

		System.out.printf("Introduza uma temperatura em fahrenheit :");

		Scanner entrada = new Scanner(System.in);
		fahrenheit = entrada.nextDouble();

		double celsius = (fahrenheit - 32) / 1.8;

		System.out.println(celsius + " celsius");

	}
}