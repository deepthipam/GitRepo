package Javatutorial;

import java.util.*;
public class DemoEof {
	
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int count = 1;
        
	        while (scan.hasNext()) {
	    String ns = scan.nextLine();
	    System.out.println(count + " " + ns);
	    count++;
	      }
	    }
	
}
