import java.util.Arrays;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String start = scan.next();
	    String end = scan.next();
	    
		start = start.toUpperCase();
		   end = end.toUpperCase();
		  
		   String directions[] = { "right", "down", "left", "up", "right", "down", "left"};
		   String points= "ABCDABCD";
		   String point[] = {"A", "B", "C", "D", "A", "B", "C"};
		  
		   int startIndex = points.indexOf(start);
		   int endIndex = points.indexOf(end);
		 
		  
		    if (start.equals(end)) {
		    	System.out.println(end + " found");
		    	
		    }	else {
		    	
					for (int i=startIndex; i<=6; i++)
					{start=point[i];
					startIndex++;
					System.out.print(directions[i]);
					if (points.charAt(startIndex)==points.charAt(endIndex)) {
						break;}
					System.out.print(" > ");
					}
					System.out.print(": " + end + " found");
		    }
    
    
    
	}
}
