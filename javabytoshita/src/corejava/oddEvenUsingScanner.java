package corejava;

import java.util.Scanner;

public class oddEvenUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number x:");
	
		int x=sc.nextInt();
		
		if(x%2==0) {
			
			System.out.println("the number is even number");
		}else {
			System.out.println("the number is odd");
		}

	}

}
