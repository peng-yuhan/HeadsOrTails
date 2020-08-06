import java.util.Random;
import java.util.Scanner;

class Toss{
	public String result() {
		Random r = new Random();
		int value = r.nextInt(2);
		if(value == 1) {
			return "Heads";
		}
		else {
			return "Tails";
		}
	}
	
}

public class HeadsOrTails{
	public static void main(String []args) {
		System.out.println("Who are you?\n");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		System.out.println("Hello, " + input + ".\n");
		int heads = 0;
		int tails = 0;
		int round = 3;
		String h = "Heads";
		System.out.println("Tossing a coin...\n");
		Toss t = new Toss();
		for(int i=1; i<=round; i++) {
			String n = t.result();
			System.out.println("Round " + i + ": " + n + "\n");
			if(n.equals(h)) {
				heads++;
			}
			else {
				tails++;}
		}
		System.out.println("\nHeads: " + heads + ", Tails: " + tails);
		if(heads > tails) {
			System.out.println("You won!");
		}
		else {
			System.out.println("You lost!");
		}
	}
}
