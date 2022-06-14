package com.eval3;

import java.util.Scanner;

public class Question1 {
	
	static void exception(int N,int[] arr,int i)
	{
		try {
			System.out.println("The array element at index "+i+"= "+arr[i]);
			System.out.println("The array element successfully accessed");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int N = sc.nextInt();
		System.out.println("Enter the elements in the array");
		int []arr = new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the index of the array element you want to access");
		int i = sc.nextInt();
		exception(N,arr,i);
		sc.close();
	}

}
