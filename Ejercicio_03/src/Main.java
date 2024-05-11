
public class Main {

	public static void main(String[] args) {

		try {
			Array array = new Array();
			array.dividir();
			array.mostrarDatos();
		} catch (ArithmeticException e) {
			System.out.println("Division by zero");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Indice fuera de limite");
		} finally {
			System.out.println("Fin de programa");
		}
		
	}

}
