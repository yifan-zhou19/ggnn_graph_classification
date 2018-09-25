package <missing>;

public class GlobalMembers
{
	/*
	 * model.cpp
	 *
	 *  Created on: 2012-11-25
	 *      Author: ???
	 */
	public static int[] a = new int[100]; //??????
	public static int[] b = new int[100];
	public static int x = 0;
	public static int y = 0;
	public static void in()
	{
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < x;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < y;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void sortnum()
	{ //??
		sort(a,a + x);
		sort(b,b + y);
	}
	public static void cat()
	{
		for (int i = x;i < 100;i++)
		{
			a[i] = b[i - x]; //??
		}
	}
	public static void out()
	{
		System.out.print(a[0]);
		for (int i = 1;i < x + y;i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
	}
	public static int Main() //???
	{
		in();
		sortnum();
		cat();
		out();
		return 0;
	}
}

