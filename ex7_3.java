package program1;
import java.util.Scanner;
public class ex7_3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] numbers=new int[1000];
		int[] countNumbers= new int[104];
		int count=0;
		numbers[0]=input.nextInt();
		countNumbers[numbers[0]]++;
		while(numbers[count]!=0) {
			count++;
			numbers[count]=input.nextInt();
			countNumbers[numbers[count]]++;
		}
		for(int i=1;i<=100;i++) {
//			System.out.println(countNumbers[i]);
			if(countNumbers[i]!=0)
				System.out.println(i+" occurs "+countNumbers[i]);
		}
		input.close();
	}
}
