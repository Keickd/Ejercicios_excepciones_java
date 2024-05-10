import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Introduce el dividendo: ");
			int dividendo = sc.nextInt();

			System.out.print("\nIntroduce el divisor: ");
			int divisor = sc.nextInt();
			
			System.out.println("La division de" + dividendo + " / " + divisor + " = " + dividendo / divisor);
		} catch (ArithmeticException ex) {
			System.out.println("No se puede dividir entre 0");
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error desconocido");
		}

	}


}
