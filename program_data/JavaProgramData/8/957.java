package <missing>;

public class GlobalMembers
{
	/*
	 * Function2.7FourParts.cpp
	 *
	 *  Created on: 2012-11-30
	 *      Author: ???
	 *      ??:??????????
	 */
	public static int a;
	public static int b;
	public static int[] a1 = new int[20];
	public static int[] b1 = new int[20];
	public static int[] c = new int[40];
	public static void input()
	{ //????
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < a;i++)
		{
			a1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 0;j < b;j++)
		{
			b1[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void select_sort(int[] array, int n) //????
	{
		int i;
		int j;
		int k;
		int t;
		for (i = 0;i < n - 1;i++)
		{
		   k = i;
		   for (j = i + 1;j < n;j++)
		   {
		   if (array[j] < array[k])
		   {
			   k = j;
		   }
		   }
		   t = array[k];
		   array[k] = array[i];
		   array[i] = t;
		}
	}

	public static void combine(int[] array1, int[] array2) //????
	{
		for (int i = 0;i < a;i++)
		{
			c[i] = array1[i];
		}
		for (int j = 0;j < b;j++)
		{
			c[j + a] = array2[j];
		}
	}
	public static void output()
	{ //????
		for (int i = 0;i < a + b - 1;i++)
		{
			System.out.print(c[i]);
			System.out.print(" ");
		}
		System.out.print(c[a + b - 1]);
		System.out.print("\n");
	}
	public static int Main()
	{
		input();
		select_sort(a1, a);
		select_sort(b1, b);
		combine(a1, b1);
		output();
		return 0;
	}

}

