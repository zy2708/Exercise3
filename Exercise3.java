public class Exercise3 {
	public static void main(String[]args){
		int  n=(int)(Math.random()*13);
		String rank=new String();
		switch(n){
			case 0:
				rank="Ace";
				break;
			case 1:
				rank="2";
				break;
			case 2:
				rank="3";
				break;
			case 3:
				rank="4";
				break;
			case 4:
				rank="5";
				break;
			case 5:
				rank="6";
				break;
			case 6:
				rank="7";
				break;
			case 7:
				rank="8";
				break;
			case 8:
				rank="9";
				break;
			case 9:
				rank="10";
				break;
			case 10:
				rank="Jack";
				break;
			case 11:
				rank="Queen";
				break;
			case 12:
				rank="King";
				break;
			default:
			}
		int l=(int)(Math.random()*4);
		String suit=new String();
		switch(l){
			case 0:
				suit="Clubs";
				break;
			case 1:
				suit="Diamonds";
				break;
			case 2:
				suit="Hearts";
				break;
			case 3:
				suit="Spades";
				break;
			default:
		}
		System.out.println("The card you picked is "+rank+" of "+suit+".");
	}

}
