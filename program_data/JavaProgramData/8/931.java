package <missing>;

public class GlobalMembers
{
	/*
	 * moban.cpp
	 *?? - ????????????????????????
	 *  Created on: 2012-11-29
	 *      Author: ???
	 */
	public static int[] a = new int[500];
	public static int[] b = new int[500];
	public static int numbera;
	public static int numberb;
	public static int i;
	public static int j;
	public static int p;
	public static void input()
	{ //???????????????????????
		numbera = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		numberb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < numbera; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < numberb; i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void order()
	{ //???????????????
		for (i = 0; i < numbera - 1; i++)
		{
			for (j = numbera - 1; j > i; j--)
			{
				if (a[j] < a[j - 1])
				{
					p = a[j];
					a[j] = a[j - 1];
					a[j - 1] = p;
				}
			}
		}
		for (i = 0; i < numberb - 1; i++)
		{
			for (j = numberb - 1; j > i; j--)
			{
				if (b[j] < b[j - 1])
				{
					p = b[j];
					b[j] = b[j - 1];
					b[j - 1] = p;
				}
			}
		}
	}
	public static void stract()
	{ //??????????????
		for (i = numbera; i < numbera + numberb; i++)
		{
			a[i] = b[i - numbera];
		}
	}
	public static void output()
	{ //??????????????
		System.out.print(a[0]);
		for (i = 1; i < numbera + numberb; i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
	}
	public static int Main()
	{
		input(); //????
		order();
		stract();
		output();
		return 0;
	}

}

