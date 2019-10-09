package program1;
import java.util.Scanner;
public class ex7_19 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n;
		n=input.nextInt();
		int i;
		int flag=0;
		int[] numbers=new int[n];
		for(i=0;i<n;i++) {
			numbers[i]=input.nextInt();
		}
		for(i=0;i<n-1;i++) {
			if(numbers[i]>numbers[i+1])
				flag=1;
		}
		if(flag==1)
			System.out.println("The list is not sorted");
		else
			System.out.println("The list is already sorted");
		input.close();
	}

}
