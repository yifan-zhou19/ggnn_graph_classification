package <missing>;

public class GlobalMembers
{
	/*
	 * ModularizedProgramming.cpp
	 *
	 *  Created on: 2012-11-23
	 *      Author: Cui Zhaoxiong Class4 1200012931
	 */
	public static int[] a = new int[200];
	public static int[] b = new int[100];
	public static int lena = 0; //a?????
	public static int lenb = 0; //b?????
	public static void Input()
	{ //??
		lena = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		lenb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < lena; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0; i < lenb; i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void Sort()
	{ //??
		for (int i = 1; i <= lena - 1; i++)
		{
			for (int j = 0; j <= lena - 1 - i; j++)
			{
				if (a[j] > a[j + 1])
				{
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 1; i <= lenb - 1; i++)
		{
			for (int j = 0; j <= lenb - 1 - i; j++)
			{
				if (b[j] > b[j + 1])
				{
					int temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
	}
	public static void Catenate()
	{ //??
		for (int i = 0; i <= lenb - 1; i++)
		{
			a[lena + i] = b[i];
		}
	}
	public static void Output()
	{ //??
		System.out.print(a[0]);
		for (int i = 1; i <= lena + lenb - 1; i++)
		{
			System.out.print(' ');
			System.out.print(a[i]);
		}
	}
	public static int Main()
	{ //???
		Input();
		Sort();
		Catenate();
		Output();
		return 0;
	}

}

