package <missing>;

public class GlobalMembers
{
	/*
	 * ?????.cpp
	 *
	 *  Created on: 2010-12-29
	 *      Author: wangwei
	 */
	public static int[] x = new int[2000];
	public static int[] y = new int[2000];
	public static String temp = new String(new char[2000]);
	//????????????
	public static int input(int[] a)
	{
		int i;
		int j = 0;
		for (i = 0;;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			temp = tangible.StringFunctions.changeCharacter(temp, i, System.in.read());
			j++;
			if (temp.charAt(i) == '\n')
			{
				break;
			}
		}
		return j;
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		int max;
		int[] count = new int[2000];
		//????
		j = input(x);
		j = input(y);
		max = 0;
		//???????
		for (i = 0;i <= 1000;i++)
		{
			for (k = 0;k < j;k++)
			{
				if (x[k] <= i != 0 && y[k]> i)
				{
					count[i]++;
				}
			}
			//????????????
			if (count[i] > max)
			{
				max = count[i];
			}
		}
		//???????????
		System.out.print(j);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

