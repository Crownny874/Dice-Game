import java.util.*;
import java.util.Iterator;
public class getWins {
	   getWins() {
		
		   }
	void getPCWins(List<Integer> track,List<Integer> track2) {
	 System.out.printf("%7s","Die1");
	 System.out.printf("%9s","Die2");
	 System.out.println();
  Iterator<Integer> it = track2.iterator();
	 for(int i : track) {
		System.out.println("    "+i+"        "+it.next());
	  }
	}
}