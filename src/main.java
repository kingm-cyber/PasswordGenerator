import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Password Generator");
		System.out.println("------------------");
		
		System.out.println("What do you want the length to be?: (Enter a number 1-50)");
		int length = input.nextInt();
		
		System.out.println("Do you want to include letters?: (y/n)");
		String letters = input.nextLine();
		System.out.println();
		
		System.out.println("Do you want to include numbers?: (y/n)");
		String numbers = input.nextLine();
		
		System.out.println("Do you want to include symbols?: (y/n)");
		String symbols = input.nextLine();
		
		//boolean variables
		boolean let = false;
		boolean num = false;
		boolean sym = false;
		
		if(letters.equals("y")) {
			let = true;
		}
		
		if(numbers.equals("y")) {
			num = true;
		}

		if(symbols.equals("y")) {
			sym = true;
		}
		
		if(let || num || sym) {
			generator pass = new generator(length, let, num, sym);
		}
		
		System.out.println(); //pass.toString
		
	}

}
