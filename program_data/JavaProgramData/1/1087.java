package <missing>;

public class GlobalMembers
{
	/*
	 * main.cpp
	 *
	 *  Created on: 2012-11-12
	 *      Author: ??
	 * 1090 ????
	
	 */


	public static int sum;
	public static int[] a = new int[100];
	public static void search(int t,int k)
	{
		int i;
		if (k == 1)
		{
			sum++;
		}
		else
		{
		for (i = a[t - 1];i <= k;i++)
		{
			if (k % i == 0)
			{
			a[t] = i;
			search(t + 1, k / i);
			}
		}
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = 0;
			a[0] = 2;
			search(1, k);
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

