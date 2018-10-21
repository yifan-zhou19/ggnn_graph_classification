package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2012-11-3
	 *      Author: AK
	 */
	public static int Main()
	{
		int[] a = new int[510]; //????
		int n;
		int x;
		int i = 0;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;n >= 1;n--)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (x % 2 == 1)
			{
				a[i] = x;
				i++;
			} //??????????
		}
		for (x = 1;x <= i - 1;x++) //??????????
		{
			for (j = i - 1;j >= x;j--)
			{
				if (a[j] < a[j - 1])
				{
					n = a[j - 1];
					a[j - 1] = a[j];
					a[j] = n;
				}
			}
		}
		System.out.print(a[0]);
		for (j = 1;j <= i - 1;j++)
		{
			System.out.print(',');
			System.out.print(a[j]);
		}
		return 0;
	}
}

