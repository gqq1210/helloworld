package program1;
import java.util.Scanner;
public class ex7_31 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n,m;
		int i;
		m=input.nextInt();
		int[] list1=new int[m];
		for(i=0;i<m;i++) {
			list1[i]=input.nextInt();
		}
		
		n=input.nextInt();
		int[] list2=new int[n];
		int[] L=new int[m+n];
		for(i=0;i<n;i++) {
			list2[i]=input.nextInt();
		}
		
		
//		int count1=0,count2=0,count=0;
//		int[] list=new int[list1.length+list2.length];
//		while(count1<list1.length&&count2<list2.length) {
//			if(list1[count1]<=list2[count2]) {
//				list[count]=list1[count1];
//				count++;
//				count1++;
//			}
//			if(list1[count1]>list2[count2]) {
//				list[count]=list2[count2];
//				count++;
//				count2++;
//			}
//		}
//		if(list1.length<=list2.length) {
//			for(i=count2;i<list2.length;i++) {
//				list[count]=list2[i];
//				count++;
//			}
//		}
//		if(list1.length>list2.length) {
//			for(i=count1;i<list1.length;i++) {
//				list[count]=list1[i];
//				count++;
//			}
//		}
//		for(i=0;i<list1.length;i++) {
//			System.out.print(list1[i]+" ");
//		}
		
		L=merge(list1,list2);
		for(i=0;i<list1.length+list2.length;i++) {
			System.out.print(L[i]+" ");
		}
		input.close();
	}
	
	public static int[] merge(int[] list1,int[] list2) {
		int i;
		int count1=0,count2=0,count=0;
		int[] list=new int[list1.length+list2.length];
		while(count1<list1.length&&count2<list2.length) {
			if(list1[count1]<=list2[count2]) {
				list[count]=list1[count1];
				count++;
				count1++;
			}
			if(list1[count1]>list2[count2]) {
				list[count]=list2[count2];
				count++;
				count2++;
			}
		}
		if(list1.length<=list2.length) {
			for(i=count2;i<list2.length;i++) {
				list[count]=list2[i];
				count++;
			}
		}
		if(list1.length>list2.length) {
			for(i=count1;i<list1.length;i++) {
				list[count]=list1[i];
				count++;
			}
		}
		return list;
	}
}
