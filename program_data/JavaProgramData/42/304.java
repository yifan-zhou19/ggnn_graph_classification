package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012786_25.cpp
	 *
	 *  Created on: 2010-10-29
	 *      Author: ??
	 */
	public static int Main()
	{
		int n; //??????????n
		int b = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int i = n; //?????i???n????i
		int[] a = new int[i]; //????a[i]
		for (b = 0;b < i;b++)
		{
			a[b] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int d; //????????
		int h = 0;
		int c;
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (b = i - 1;b >= 0;b--)
		{
			if (a[b] == d)
			{
				for (c = b;c <= i - 1;c++)
				{
					a[c] = a[c + 1];
				}
				h++;
			} //???????????????
		}
			 int f = i - h;
		for (b = 0;b < f - 1;b++)
		{
			System.out.print(a[b]);
			System.out.print(" ");
		} //????????
			 System.out.print(a[f - 1]);
		return 0;
	}

}

