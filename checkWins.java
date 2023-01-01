import java.util.*;
public class checkWins {
	  static int value;
	  static int value2;
	 checkWins(List<Integer> track,List<Integer> track2) {
	  for(int i = 0,j = 0; i < track.size() || j < track2.size(); i++,j++) {
		  value += track.get(i);
			value2 += track2.get(j);
			}
		if(value > value2) {
		System.out.println("computer beats player");
		}
		else if(value2 > value) {
		System.out.println("player beats computer");
		}
		else {
		if(value == value2) {
		System.out.println("game ended in a tie");
			}
		}
	}
}