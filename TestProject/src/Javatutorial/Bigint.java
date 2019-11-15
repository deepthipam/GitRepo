package Javatutorial;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Bigint {
	    public static void main(String[] args) {
	
	         Scanner sc = new Scanner(System.in);
	        String numOne = sc.nextLine();
	        String numTwo = sc.nextLine();
	        BigInteger bigNumOne = new BigInteger(numOne);
	        BigInteger bigNumTwo = new BigInteger(numTwo);
	        System.out.println(bigNumOne.add(bigNumTwo));
	        System.out.println(bigNumOne.multiply(bigNumTwo));
	    }
	    
	}


