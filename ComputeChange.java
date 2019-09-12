package program1;
import java.util.Scanner;
public class ComputeChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount in double, for example 11.56: ");
		double amount = input.nextDouble();
		
		int remainningAmount = (int)(amount * 100);
		
		int numberOfOneDollars = remainningAmount / 100;
		remainningAmount = remainningAmount %100;
		int numberOfQuarters = remainningAmount / 25;
		remainningAmount = remainningAmount % 25;
		int numberOfDimes = remainningAmount / 10;
		remainningAmount = remainningAmount % 10;
		int numberOfNickels = remainningAmount / 5;
		remainningAmount = remainningAmount % 5;
		int numberOfPennies = remainningAmount;
		
		System.out.println("Your amount " + amount + " consists of");
		System.out.println("    " + numberOfOneDollars + " dollars");
		System.out.println("    " + numberOfQuarters + " quarters");
		System.out.println("    " + numberOfDimes + " dimes");
		System.out.println("    " + numberOfNickels + " nickels");
		System.out.println("    " + numberOfPennies + " pennies");
		
	}

}
