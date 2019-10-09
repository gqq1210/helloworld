package program1;
import java.util.Scanner;
public class ex7_18 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double[] numbers=new double[11];
		int i,pass;
		double temp;
		for(i=0;i<10;i++) {
			numbers[i]=input.nextDouble();
		}
		for(pass=0;pass<9;pass++) {
			for(i=0;i<9-pass;i++) {
				if(numbers[i]>numbers[i+1]) {
					temp=numbers[i];
					numbers[i]=numbers[i+1];
					numbers[i+1]=temp;
				}
			}
		}
		for(i=0;i<10;i++) {
			System.out.print(numbers[i]+" ");
		}
		input.close();
	}

}
