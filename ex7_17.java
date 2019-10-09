package program1;
import java.util.Scanner;
public class ex7_17 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n,i,j,temp;
		String pass;
		String[] student=new String[1000];
		int[] score=new int[1000];
		n=input.nextInt();
		for(i=0;i<n;i++) {
			student[i]=input.next();
			score[i]=input.nextInt();
		}
		for(i=0;i<n-1;i++) {
			for(j=0;j<n-1-i;j++) {
				if(score[j]<score[j+1]) {
					temp=score[j];
					score[j]=score[j+1];
					score[j+1]=temp;
					pass=student[j];
					student[j]=student[j+1];
					student[j+1]=pass;
				}
			}
		}
		for(i=0;i<n;i++) {
			System.out.println(student[i]);
		}
		input.close();
	}

}
