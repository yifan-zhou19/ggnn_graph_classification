package <missing>;

public class GlobalMembers
{
	/*
	 * ?????????.cpp
	 *
	 *  Created on: 2011-12-31
	 *      Author: ???
	 */

	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[10000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int k = 0;
			p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k < n)
		{
			int total = 0;
			int m = n;
			k++;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					*(p + i * n + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			while (m > 1)
			{
				int min = 100000;
				for (i = 0;i < m;i++)
				{
					for (j = 0;j < m;j++)
					{
						if (*(p + i * m + j) < min)
						{
							min = (p + i * m + j);
						}
					}
					for (j = 0;j < m;j++)
					{
						*(p + i * m + j) -= min;
					}
					min = 10000;
				}
				min = 10000;
				for (j = 0;j < m;j++)
				{
					for (i = 0;i < m;i++)
					{
						if (*(p + i * m + j) < min)
						{
							min = (p + i * m + j);
						}
					}
					for (i = 0;i < m;i++)
					{
						*(p + i * m + j) -= min;
					}
					min = 10000;
				}
				total += *(p + m + 1);
				for (j = 2;j < m;j++)
				{
					*(p + j - 1) = *(p + j);
				}
				for (i = 2;i < m;i++)
				{
					*(p + (i - 1) * (m - 1)) = *(p + i * m);
					for (j = 2;j < m;j++)
					{
						*(p + (i - 1) * (m - 1) + j - 1) = *(p + i * m + j);
					}
				}
				m--;
			}
			System.out.print(total);
			System.out.print("\n");
		}
		return 0;
	}

}

