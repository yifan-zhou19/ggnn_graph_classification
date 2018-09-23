package <missing>;

public class GlobalMembers
{
	/*
	 * 006.cpp
	 * name:
	 *  Created on: 2011-12-31
	 *      Author: 1100012729
	 */
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int p;
		int ans;
		int[][] a = new int[101][101];
		int g;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = n;

		while (k-- != 0)
		{
			ans = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			p = n;
			while (p - .1.getValue() != 0)
			{
			for (i = 0;i <= p;i++)
			{
				g = (*(a + i));
				for (j = 0;j <= p;j++)
				{
					if (*(*(a + i) + j) < g)
					{
						g = (*(a + i) + j);
					}
				}
				for (j = 0;j <= p;j++)
				{
					*(*(a + i) + j) -= g;
				}
			}
			for (j = 0;j <= p;j++)
			{
				g = ((a) + j);
				for (i = 0;i <= p;i++)
				{
					if (*(*(a + i) + j) < g)
					{
						g = (*(a + i) + j);
					}
				}
				for (i = 0;i <= p;i++)
				{
					*(*(a + i) + j) -= g;
				}
			}
			ans += *(*(a + 1) + 1);
			for (i = 2;i <= p;i++)
			{
				*(*(a + i - 1)) = *(*(a + i));
			}
			for (j = 2;j <= p;j++)
			{
				*((a) + j - 1) = *((a) + j);
			}
			for (i = 2;i <= p;i++)
			{
				for (j = 2;j <= p;j++)
				{
					*(*(a + i - 1) + j - 1) = *(*(a + i) + j);
				}
			}
			}
			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}

}

