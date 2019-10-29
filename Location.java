package project9;
import java.util.Scanner;
public class Location {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int row=input.nextInt();
		int column=input.nextInt();
		double[][] a=new double[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				a[i][j]=input.nextDouble();
			}
		}
		Location maxNumber=new Location();
		maxNumber=locateLargest(a);
		System.out.println("The largest number is "+maxNumber.maxValue+" at "+"("+maxNumber.row+","+maxNumber.column+")");
		input.close();
	}
	
	public int row;
	public int column;
	public double maxValue;
	public Location() {
		row=0;
		column=0;
		maxValue=0;
	}
	
	
	public static Location locateLargest(double[][] a) {
		Location locate=new Location();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]>locate.maxValue) {
					locate.maxValue=a[i][j];
					locate.row=i;
					locate.column=j;
				}
			}
		}
		return locate;
	}
}
