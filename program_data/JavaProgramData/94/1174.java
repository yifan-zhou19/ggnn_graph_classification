package <missing>;

public class GlobalMembers
{
	/*
	 * Oddsingleincreasingsequence.cpp
	 *
	 *  Created on: 2012-11-18
	 *      Author: ???
	 */
	public static int Main()
	{
		int n; //??int???
		int i;
		int j = 0;
		int temp;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n]; //????????
		int[] b = new int[n];
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		} //??????????
		for (i = 0; i < n; i++)
		{
			if (a[i] % 2 != 0)
			{
				b[j] = a[i];
				j++;
			}
			else
			{
				continue;
			}
		} //???????????????
		for (i = 0; i < j - 1; i++)
		{
			for (m = 0; m < j - i - 1; m++)
			{
				if (b[m] > b[m + 1])
				{
					temp = b[m];
					b[m] = b[m + 1];
					b[m + 1] = temp;
				}
			}
		} //???????????
		for (m = 0; m < j; m++)
		{
			if (m < j - 1)
			{
				System.out.print(b[m]);
				System.out.print(",");
			}
			else
			{
				System.out.print(b[m]);
			}
		}

	}

}

