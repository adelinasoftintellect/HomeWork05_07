
public class Main {

	public static void main(String[] args) {
		int n = 6;
		printFacturiel(n);

	}

	private static void printFacturiel(int n) {
		long factorialn = 1;
		for (int i = 1; i <= n; i++) {
			factorialn *= i;
		}
		System.out.println("Facturial: " + factorialn);
	}
}
