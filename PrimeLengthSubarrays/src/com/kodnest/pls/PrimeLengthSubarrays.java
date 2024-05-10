package com.kodnest.pls;

import java.util.Scanner;

public class PrimeLengthSubarrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		subArrays(a);
	}

	public static void subArrays(int[] a) {
		System.out.println("Prime-Length Subarrays:");
		for(int i=0; i<a.length; i++) {
			for(int j=i; j<=a.length; j++) {
				int[] subarray = new int[j-i];
				for(int k=i; k<j; k++) {
					subarray[k-i] = a[k];
				}
				if(isPrime(subarray.length)) {
					printArray(subarray);
			    }
			}
		}
	}

	public static boolean isPrime(int n) {
		 if((n==0) || (n==1)) {
			 return false;
		 }
		 else if(n==2) {
			 return true;
		 }
		 else {
			 for(int i=2; i<n; i++) {
				 if(n%i == 0) {
					 return false;
				 }
			 }
		}
		 return true;
	}
	
	public static void printArray(int[] a) {
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");	
		}		
		System.out.println();
	}
}