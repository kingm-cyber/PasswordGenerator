import java.util.Scanner;

public class main {
  static boolean let, num, sym;
  static int length;

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Password Generator");
    System.out.println("------------------");

    while (true) {

      try {
        System.out.println("What do you want the length to be?: (Enter a number 1-50)");

        length = input.nextInt();

        if (length < 1 || length > 50) {
          System.out.println("that number is not within the bounds");
        }
        else {
          break;
        }
      }
      catch (Exception e) {
        System.out.println("That is not a number you fool!");
        input.nextLine();
      }
    }

    input.nextLine(); // to prevent scanner from skipping input

    while (true) {

      System.out.println("Do yo" + "" + "u want to include letters?: (y/n)");
      String letters = input.nextLine();

      System.out.println();

      System.out.println("Do you want to include numbers?: (y/n)");
      String numbers = input.nextLine();

      System.out.println("Do you want to include symbols?: (y/n)");
      String symbols = input.nextLine();

      // boolean variables
      let = false;
      num = false;
      sym = false;

      if (letters.equals("y")) {
        let = true;
      }

      if (numbers.equals("y")) {
        num = true;
      }

      if (symbols.equals("y")) {
        sym = true;
      }

      if ( ! (let || num || sym)) {

        System.out.println("You chose not to add any types of characters. Try Again.");

      }
      else {
        break;
      }

    }

    generator pass = new generator(length, let, num, sym);
    System.out.println(pass.password);

  }

}
