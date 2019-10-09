package program1;
import java.util.Scanner;
public class ex7_32 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n;
		n=input.nextInt();
		int[] L=new int[n];
		int[] list=new int[n];
		int i;
		for(i=0;i<n;i++) {
			L[i]=input.nextInt();
		}
		list=partition(L);
		for(i=0;i<n;i++) {
			System.out.print(list[i]+" ");
		}
		input.close();
	}
	public static int[] partition(int[] list) {
		int m=list.length;
		int a=list[0];
		int[] listNext=new int[m];
		int i;
		int start=0;
		int end=m-1;
		for(i=1;i<m;i++) {
			if(list[i]<=a) {
				listNext[start]=list[i];
				start++;
			}
			else {
				listNext[end]=list[i];
				end--;
			}
		}
		listNext[end]=a;
		return listNext;
	}
}
