package Javatutorial;

//import.java.util.Scanner;
import java.io.*; 
import java.util.*;
import java.text.*; 
import java.math.*; 
//import java.util.regex.*;



public class DemoIFElse {


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
       int n=scan.nextInt();  
        String str1="";
        if((n%2==1) || ( (n%2==0) && (n>=6 && n <= 20 ) ) ){
          str1 = "Weird";
        }
        else{
            str1 = "Not Weird";
       
        }
        System.out.println(str1);

    }
}