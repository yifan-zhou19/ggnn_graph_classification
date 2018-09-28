package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  11.5homework
	//  ??????
	//  Created by ??? on 11/5/12.
	//  Copyright (c) 2012 airjcy. All rights reserved.
	//



	public static void ySwap(int[] a, int i, int j)
	{
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	public static void yQsort(int[] a, int left, int right)
	{
		if (left > right)
		{
			return;
		}
		int key = a[left];
		int i = left;
		int j = right;
		while (i < j)
		{
			while (i < j && a[j] >= key)
			{
				j--;
			}
			ySwap(a, i, j);
			while (i < j && a[i] <= key)
			{
				i++;
			}
			ySwap(a, i, j);
		}
		yQsort(a, left, i - 1);
		yQsort(a, i + 1, right);
	}


	public static void Main(String[] args)
	{

		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int t = 0;
		int[] a = new int[n]; //???????
		int countOfUnevens = 0;
		for (i = 0; i < n; i++)
		{
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (t % 2 != 0)
			{
				a[countOfUnevens] = t;
				countOfUnevens++;
			}
		}
		yQsort(a, 0, countOfUnevens - 1);
		for (i = 0; i < countOfUnevens - 1; i++)
		{
			System.out.print(a[i]);
			System.out.print(",");
		}
		System.out.print(a[i]);
	}

}

