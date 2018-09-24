package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  HomeWork 10.29
	//
	//  Created by airjcy on 10/29/12.
	//  Copyright (c) 2012 ???. All rights reserved.
	//


	public static void deleteNumber(int[] a, int n, int atPlace)
	{
		int i;
		for (i = atPlace; i < n - 1; i++)
		{
			a[i] = a[i + 1];
		}
	}

	public static void Main(String[] args)
	{

		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n]; //?????
		int i;
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		int numberToDelete;
		numberToDelete = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));


		for (i = 0; i < n; i++)
		{
			if (a[i] == numberToDelete)
			{
				deleteNumber(a, n, i);
				i--;
				n--;
			}
		}

		for (i = 0; i < n - 1; i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n - 1]);


	}

}

