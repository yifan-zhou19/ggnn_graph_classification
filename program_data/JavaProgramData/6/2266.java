package <missing>;

public class GlobalMembers
{
	/*
	 * juzhenbianyuanhe.cpp
	 *????????
	 *  Created on: 2012-12-12
	 *      Author: ???
	 */
	public static int Main()
	{
		int k; //??  ???????
		int m;
		int n;
		int[][] a = new int[100][100];
		int i;
		int p;
		int q;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= k;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (p = 0;p < m;p++) //??
			{
				for (q = 0;q < n;q++)
				{
				a[p][q] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			int sum = 0;
			if (m <= 2 || n <= 2)
			{ //??3??3?????????
				for (p = 0;p < m;p++)
				{
					for (q = 0;q < n;q++)
					{
						sum = sum + a[p][q];
					}
				}
				System.out.print(sum);
				System.out.print("\n");
			}
			else
			{ //???????????????????
				int sum1 = 0;
				int sum2 = 0;
				sum = 0; //??????????
				for (p = 0;p < m;p++)
				{
					sum1 = a[p][0] + a[p][n - 1] + sum1;
				}
				for (q = 0;q < n;q++)
				{
					sum2 = sum2 + a[0][q] + a[m - 1][q];
				}
				sum = sum1 + sum2 - (a[0][0] + a[0][n - 1] + a[m - 1][0] + a[m - 1][n - 1]); //?????????????
				System.out.print(sum);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

