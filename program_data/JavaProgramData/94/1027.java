package <missing>;

public class GlobalMembers
{
	/*
	 * jishu.cpp
	 *
	 *  Created on: 2012-11-3
	 *      Author: ???
	 */

	public static int Main()
	{
		int n = 0; //??????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n]; //????
		int[] b = new int[n];
		int i = 0;
		int j = 0;
		int sum = 0;
		for (i = 0; i < n; i++)
		{ //???
			b[i] = 0;
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++)
		{ //???????????b?
			if (a[i] % 2 == 1)
			{
				b[j] = a[i];
				j++;
				sum++;
			}
		}
		sort(b, b + sum); //??
		System.out.print(b[0]);
		for (i = 1; i < sum; i++)
		{
			System.out.print(",");
			System.out.print(b[i]);
		}
		return 0;
	}

}

