package <missing>;

public class GlobalMembers
{
	/*
	 * 1111.cpp
	 *
	 *  Created on: 2012-11-9
	 *      Author: 12272
	 */
	public static int Main()
	{
		int N;
		int i;
		int j;
		int temp;
		int m = 0;
		int[] a = new int[501];
		int[] b = new int[501];
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < N; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < N; i++)
		{
			if (a[i] % 2 != 0)
			{
				b[m] = a[i];
				m++;
			}
		}
		for (i = 0; i < m - 1; i++)
		{
			for (j = 0; j < m - 1 - i; j++)
			{
				if (b[j] > b[j + 1])
				{
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < m; i++)
		{
			if (i == 0)
			{
				System.out.print(b[i]);
			}
			else
			{
				System.out.print(",");
				System.out.print(b[i]);
			}
		}
		return 0;
	}

}

