package org.gittestingpro;

import java.util.Scanner;

public class Gitprotesting {
	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if( a%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
	
	}
}
