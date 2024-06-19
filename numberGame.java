package CodeSoft_Task;

import java.util.Scanner;

public class numberGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chances=10;
		int finals=0;
		boolean playAgain=true;
		System.out.println("Welcome Buddy!");
		System.out.println("Hey Buddy you have about "+chances+" to win the game");
		while(playAgain) {
			int random=getrandomN(1,100);
			boolean guess=false;
			for(int i=0;i<chances;i++) {
				System.out.println("Chance "+(i+1)+" Enter you guess:");
				int user=sc.nextInt();
				if(user==random) {
					guess=true;
					finals+=1;
					System.out.println("You won it.");
					break;
				}
				else if(user>random) {
					System.out.println("your number is Greater then computer No");
				}
				else {
					System.out.println("your number is smaller then computer No");
					}
			}
			if(guess==false) {
				System.out.println("Sorry Buddy. You lost the chances. The number is "+random);
			}
			System.out.println("Do you want to guess the the number again(yes/no)");
			String pA=sc.next();
			playAgain=pA.equalsIgnoreCase("yes");
		}
		System.out.println("That's it Buddy , Hope you enjoyed it");
		System.out.println("Here is your Score "+finals);
		}
	public static int getrandomN(int min,int max) {
		return(int)(Math.random()*(max-min+1)+min);
	
	}
}

