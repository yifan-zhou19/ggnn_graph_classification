package <missing>;

public class GlobalMembers
{
	/*
	 * nixu.cpp
	 *
	 *  Created on: 2012-11-5
	 *      Author: alias
	 */
	public static int Main()
	{ //???
		int n; //????n
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n]; //????
		for (int i = 0;i < n;i++) //????????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int m;
		for (int j = 0;j < n / 2;j++)
		{ //?n/2??????????
			m = a[j];
			a[j] = a[n - j - 1];
			a[n - j - 1] = m;
		}
		for (int k = 0;k < n;k++)
		{ //??????????
			if (k == 0)
			{
				System.out.print(a[k]);
			}
			else
			{
				System.out.print(" ");
				System.out.print(a[k]);
			}
		}
		return 0;
	}


}

