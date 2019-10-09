package program1;

public class ex7_24 {

	public static void main(String[] args) {
		int[] deck=new int[52];
		String[] suits= {"Spades","Hearts","Diamonds","Clubs"};
		String[] ranks= {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		int i;
		int deckCount[]= {0,0,0,0};
		int card[]= {0,0,0,0};
		int count=0;
		for(i=0;i<deck.length;i++) {
			deck[i]=i;
		}
		for(i=0;i<1000;i++) {
			count++;
			int index=(int)(Math.random()*deck.length);
			if(index/13==0&&deckCount[0]==0) {
				deckCount[0]=1;
				card[0]=i;
			}
			else if(index/13==1) {
				deckCount[1]=1;
				card[1]=i;
			}
			else if(index/13==2) {
				deckCount[2]=1;
				card[2]=i;
			}
			else {
				deckCount[3]=1;
				card[3]=i;
			}
			if(deckCount[0]==1&&deckCount[1]==1&&deckCount[2]==1&&deckCount[3]==1)
				break;
		}
		for(i=0;i<4;i++) {
			String suit=suits[card[i]/13];
			String rank=ranks[card[i]%13];
			System.out.println(rank+" of "+suit);
		}
		System.out.println(count);
	}

}
