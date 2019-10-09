package program1;
import java.util.Scanner;
public class ex7_5 {

	public static void main(String[] args) {
		int[] numbers=new int[11];
		Scanner input=new Scanner(System.in);
		int i,temp,j,count=1,flag;
		numbers[0]=input.nextInt();
		for(i=1;i<10;i++) {
			flag=0;
			temp=input.nextInt();
			for(j=0;j<count;j++) {
				if(temp==numbers[j]) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				numbers[count]=temp;
				count++;
			}
		}
		for(i=0;i<count;i++) {
			System.out.print(numbers[i]+" ");
		}
		input.close();
	}

}
