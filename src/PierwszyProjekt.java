
public class PierwszyProjekt extends TestDziedziczenie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 172;
		double b = 3.5;
		System.out.println("siema");
		System.out.println("asd");
		System.out.println(Math.random());
		System.out.println("Wartosc:" + tunczyk());
		System.out.println("Kwadrat=" + kwadrat(a, b));
		TestDziedziczenie.dziedziczenie();
		TestDziedziczenie.main(args);
		char c;
		// c = '0';
		c = (char) a;
		System.out.println(c);
	}

	public static int tunczyk() {
		return 10;
	}

	public static double kwadrat(double a, double b) {
		double kwadrat = a * b;
		return kwadrat;
	}

}
