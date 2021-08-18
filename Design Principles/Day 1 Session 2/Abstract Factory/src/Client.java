import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		//Factory factory;
		Scanner sc = new Scanner(System.in);
		System.out.println("Comapnies");
		System.out.println("   1. Audi Factory");
		System.out.println("   2. Mercedes Factory");
		System.out.println("   3. Exit");
		System.out.println("Enter the choice  ");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			Factory factory= new AudiFactory();
			System.out.println("\nWelcome to Audi Factory");
			System.out.println("Select Product");
			System.out.println("   1. Tire");
			System.out.println("   2. Headlight");
			System.out.println("   3. Exit");
			System.out.println("Enter the choice  ");
			int ch1 = sc.nextInt();
			switch (ch1) {
			case 1:
				Tire tire=factory.makeTire();
				System.out.println("\n   "+ tire.getTireName());
				break;
			case 2:
				Headlight headlight=factory.makeHeadlight();
				System.out.println("\n   "+ headlight.getHeadlightName());
				break;
			default:
				break;

			}
			break;
		case 2:
			Factory factory1= new MercedesFactory();
			System.out.println("\nWelcome to Mercedes Factory");
			System.out.println("Select Product");
			System.out.println("   1. Tire");
			System.out.println("   2. Headlight");
			System.out.println("   3. Exit");
			System.out.println("Enter the choice  ");
			int ch2 = sc.nextInt();
			switch (ch2) {
			case 1:
				Tire tire=factory1.makeTire();
				System.out.println("\n   "+tire.getTireName());
				break;
			case 2:
				Headlight headlight=factory1.makeHeadlight();
				System.out.println("\n   "+ headlight.getHeadlightName());
				break;
			default:
				break;

			}
			break;
		default:
			break;

		}
		System.out.println("\nThank You");
		sc.close();

	}

}
