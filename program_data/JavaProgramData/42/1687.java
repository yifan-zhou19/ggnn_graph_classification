package <missing>;

public class GlobalMembers
{
	/*
	 * homework.cpp
	 *
	 *  Created on: 2013-10-21
	 *      Author: dyx
	 */
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] sum = new int[n];
		int i;
		for (i = 0;i < n;i++)
		{
			sum[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int k; //delete number?
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int j = 0;
		for (i = 0;i < n;i++)
		{
			if (sum[i] == k)
			{
				continue;
			}
			if (sum[i] != k && j == 0)
			{
				System.out.print(sum[i]);
				j++;
			}
			else
			{
			System.out.print(" ");
			System.out.print(sum[i]);
			}
		}



	return 0;






	}

}

