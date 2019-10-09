package program1;

public class ex7_23 {

	public static void main(String[] args) {
		boolean[] L=new boolean[105];
		int i,j;
		for(i=1;i<=100;i++) {
			for(j=i;j<=100;j=j+i) {
				if(L[j]==false)
					L[j]=true;
				else
					L[j]=false;
			}
		}
		for(i=1;i<=100;i++) {
			if(L[i]==true)
				System.out.print(i+" ");
		}
	}

}
