package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  Homework_11_18
	//  ?????
	//  Created by airjcy on 11/28/12.
	//  Copyright (c) 2012 airjcy. All rights reserved.
	//






	public static int compare(Object a, Object b)
	{
		int x = (int)a;
		int y = (int)b;
		if (x < y)
		{
			return -1;
		}
		if (x == y)
		{
			return 0;
		}
		return 1;
	}

	public static void initArrays(int[] a, int[] b, int m, int n)
	{
		int i;
		for (i = 0; i < m; i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 0; i < n; i++)
		{
			b[i] = ConsoleInput.readToWhiteSpace(true);
		}
	}

	public static void sort(tangible.RefObject<Integer> a, tangible.RefObject<Integer> b, int m, int n)
	{
		qsort(a.argValue, m, (Integer.SIZE / Byte.SIZE), compare);
		qsort(b.argValue, n, (Integer.SIZE / Byte.SIZE), compare);
	}

	public static void append(int[] a, int[] b, int[] c, int m, int n)
	{
		int i;
		for (i = 0; i < m; i++)
		{
			c[i] = a[i];
		}
		for (i = m; i < m + n; i++)
		{
			c[i] = b[i - m];
		}
	}

	public static void print(int[] a, int n)
	{
		int i;
		for (i = 0; i < n - 1; i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[i]);
	}


	public static void Main(String[] args)
	{
		//????????
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[m];
		int[] b = new int[n];
		initArrays(a, b, m, n);
	tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
	tangible.RefObject<Integer> tempRef_b = new tangible.RefObject<Integer>(b);
		sort(tempRef_a, tempRef_b, m, n);
		b = tempRef_b.argValue;
		a = tempRef_a.argValue;
		int[] c = new int[m + n];
		append(a, b, c, m, n);
		print(c, m + n);
	}

}

