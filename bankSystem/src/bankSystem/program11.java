package bankSystem;

import java.util.Scanner;

public class program11 {

	public static void main(String[] args) {
		System.out.println("welcome to our bank");
		long nabal=0;
		
		//menu
		
		System.out.println("*****************************************");
		System.out.println("A) check the balance");
		System.out.println("B) deposite");
		System.out.println("C) withdraw");
		System.out.println("D) exit");
		System.out.println("*****************************************");
		
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("enter the letter");
			String choice=scan.next();
			
			// check the balance
			
			
			if (choice.equalsIgnoreCase("a")) {
				System.out.println("*****************************************");
			    System.out.println();
			    System.out.println("balance"+nabal+"$");
			    System.out.println();
			    System.out.println("*****************************************");
			    
			}
			
			
			
			// deposite
			 
			else if (choice.equalsIgnoreCase("b")) {
				System.out.println("enter the amount");
			    int n=scan.nextInt();
			    if (n<0) {
			    	System.out.println("*****************************************");
			    	System.out.println("note:- enter the valid amount");
			    	System.out.println("*****************************************");
		          	}
		    	else {
		    		nabal=nabal+n;
		    		System.out.println("*****************************************");
		    		System.out.println("note:- your amount is succesfully deposite");
		    		System.out.println("*****************************************");
		    		}
			    }
			else if (choice.equalsIgnoreCase("c")) {
				System.out.println("enter the amount");
				int w=scan.nextInt();
				if (w<0) {
					System.out.println("*****************************************");
					System.out.println("note:- enter the valid amount");
					System.out.println("*****************************************");
					}
				else {
					nabal=nabal-w;
					System.out.println("*****************************************");
					System.out.println("note:- your amount is succesfully withdraw");
					System.out.println("*****************************************");
					}
				}
			
			
			else if (choice.equalsIgnoreCase("d")) {
				System.out.println("*****************************************");
			    System.out.println();
				System.out.println("Thankyou using our service");
			    System.out.println();
			    System.out.println("*****************************************");
			    break;
		   }
		   }
		
		  
	


	}


}
