package connect4;

import java.util.Scanner;

public class Connect4Controller {
	private Scanner scanner = new Scanner(System.in);
	
	public int readInt() {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        else {
            scanner.next();
            return -1;
        }
    }

    public String read() {
        if (scanner.hasNext()) {
            return scanner.next();
        }
        else {
            scanner.next();
            return "no input";
        }
    }
		/*Connect4Controller controller = new Connect4Controller();

        System.out.print("Please enter a number: ");
		//int number = controller.readInt();
        String number = new Scanner(System.in).next();
		System.out.println("You entered: " + number);*/

	public static void main(String[] args) {
        Partie nouvellePartie = new Partie();
        nouvellePartie.start();
    }
}