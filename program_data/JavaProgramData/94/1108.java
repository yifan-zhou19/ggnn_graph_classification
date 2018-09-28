package <missing>;

public class GlobalMembers
{
	/*
	 * shuzujishu.cpp
	 *
	 *  Created on: 2012-11-9
	 *      Author: alias
	 */
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		/*
		 * ??a[n],??????????b[n]
		 *
		 */
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int[] b = new int[n];
		int m = 0;
		for (int j = 0; j < n; j++)
		{
			if (a[j] % 2 != 0)
			{
				b[m] = a[j];
				m++;
			}
		}
		/*
		 * ??????b???m?????
		 */
		int temp;
		int k;
		for (int p = 0;p < m - 1;p++)
		{
			for (k = 0;k < m - 1 - p;k++)
			{
				if (b[k] > b[k + 1])
				{
					temp = b[k];
					b[k] = b[k + 1];
					b[k + 1] = temp;
				}
			}
		}
		/*
		 * ??b???m?
		 */
		for (int q = 0; q < m; q++)
		{
			if (q == 0)
			{
				System.out.print(b[q]);
			}
			else
			{
				System.out.print(",");
				System.out.print(b[q]);
			}
		}
	}


}

