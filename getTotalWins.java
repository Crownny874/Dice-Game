import java.util.*;
public class getTotalWins {
	  static int value = 0;
	  static int value2 = 0;
	  getTotalWins(String title,List<Integer> track,String title2,List<Integer> track2) {
	   for(int i = 0,j = 0; i < track.size() || j < track2.size(); i++,j++) {
		  value += track.get(i);
			value2 += track2.get(j);
			}
			System.out.println(title+": "+value);
	 	 System.out.println(title2+": "+value2);
		 }
		}
