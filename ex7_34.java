package program1;
import java.util.Scanner;
public class ex7_34 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s;
		s=input.next();
		System.out.println(sort(s));
		input.close();
	}
	public static String sort(String s) {
		char[] charArray = s.toCharArray();
		int i,pass;
		char temp;
		for(pass=0;pass<charArray.length-1;pass++) {
			for(i=0;i<charArray.length-1-pass;i++) {
				if(charArray[i]>charArray[i+1]) {
					temp=charArray[i];
					charArray[i]=charArray[i+1];
					charArray[i+1]=temp;
				}
			}
		}
		String news = new String();
		for(i=0;i<charArray.length;i++) {
			news+=charArray[i];
		}
		return news;
	}
	
}
