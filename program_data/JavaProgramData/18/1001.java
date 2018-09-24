package <missing>;

public class GlobalMembers
{
	/*
	 * 6.cpp
	 *
	 *  Created on: 2011-12-31
	 *      Author: 2011
	 */

	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = n;
		while (m > 0)
		{
			m = m - 1;
			int[][] a = new int[n][n];
			int[] b = new int[n - 1];
			int s = 0;
			int[] p = null;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q=null;
			int q = null;
			p = a;
			q = b;
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			int imin;
			int jmin;
			for (int k = 0;k < n - 1;k++)
			{
			for (int i = 0;i < n - k;i++)
			{
				imin = (p[i] + 0);
				for (int j = 1;j < n - k;j++)
				{
					if (*(p[i] + j) < imin)
					{
						imin = (p[i] + j);
					}
				}
				for (int j = 0;j < n - k;j++)
				{
					*(p[i] + j) = *(p[i] + j) - imin;
				}
			}
			for (int i = 0;i < n - k;i++)
			{
				jmin = (p[0] + i);
				for (int j = 1;j < n - k;j++)
				{
					if (*(p[j] + i) < jmin)
					{
						jmin = (p[j] + i);
					}
				}
				for (int j = 0;j < n - k;j++)
				{
					*(p[j] + i) = *(p[j] + i) - jmin;
				}
			}
			*(q + k) = *(p[1] + 1);
			for (int i = 1;i < n - 1 - k;i++)
			{
				for (int j = 0;j < n - k;j++)
				{
					*(p[i] + j) = *(p[i + 1] + j);
				}
			}
			for (int i = 1;i < n - 1 - k;i++)
			{
				for (int j = 0;j < n - 1 - k;j++)
				{
					*(p[j] + i) = *(p[j] + i + 1);
				}
			}
			}
			for (int k = 0;k < n - 1;k++)
			{
				s = s + *(q + k);
			}
			System.out.print(s);
			System.out.print("\n");
		}
		return 0;
	}


}

