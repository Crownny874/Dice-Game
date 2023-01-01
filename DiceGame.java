import java.util.*;
import java.util.Random;
public class DiceGame {
	  static int randomnum;
	  static int computerValue;
	  
	 static int newrandomnum;
	 static int userValue;
	 static List<Integer> computertrack = new ArrayList<>();
	 static List<Integer> playertrack = new ArrayList<>();
	public static void main(String[] args) throws Exception {
		getWins g = new getWins();
		char[] game = {'G','A','M','E',' ','E','N','D','S'};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Computer's UserName:");
		String computer = sc.next();
		computer = "Me_"+12;
		System.out.println("Enter User's UserName:");
		String user = sc.next();
		
	  for(int i = 1; i <= 10; i++) {
	  Random r = new Random();
		randomnum = r.nextInt(6);
	  computerValue = randomnum;
		computertrack.add(computerValue);
 	 newrandomnum = r.nextInt(6);
 	 userValue = newrandomnum;
		playertrack.add(userValue);
		
		if(i == 10) {
		g.getPCWins(computertrack,playertrack);
		new getTotalWins("Computer("+computer+") TotalWins: ",computertrack,"Player("+user+") Totalwins",playertrack);
		new checkWins(computertrack,playertrack);
	  new printEnds(game);
	  System.out.println("Thanks For Playing Our Game!,\nKeep Playing And Enjoying!");
			 }	
		 }
	}
}