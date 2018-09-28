package <missing>;

public class GlobalMembers
{
	/*
	 * delete1.cpp
	 *
	 *  Created on: 2011-10-21
	 *      Author: Administrator
	 */


	public static int Main() //???
	{
		int n; //??????
		int i;
		int q;
		int s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100001]; //????
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int k;
		int j;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (q = 0;q < n;q++) //????
		{
			if (a[q] != k)
			{
				s = q;
			}
		}
		for (j = 0;j <= s - 1;j++)
		{
			if (a[j] != k) //????
			{
				System.out.print(a[j]);
				System.out.print(" ");

			}
		}
		System.out.print(a[s]);
		return 0;
	}

}

