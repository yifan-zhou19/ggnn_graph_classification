package <missing>;

public class GlobalMembers
{
	/*
	 * juzhenguiling.cpp
	 *
	 *  Created on: 2012-11-18
	 *      Author: ??
	 * ?????????
	 */


	public static int[][] a = new int[110][110];
	public static int n;
	public static int sum;
	public static void calculate(int t)
	{
		int i;
		int j;
		int minimum;
		for (i = 1; i <= n; i++)
		{
			minimum = a[i][1];
			for (j = t; j <= n; j++) //??????
			{
				if (minimum > a[i][j])
				{
					minimum = a[i][j];
				}
			}
			a[i][1] -= minimum; //??????
			for (j = t; j <= n; j++)
			{
				a[i][j] -= minimum;
			}

		}
		  for (i = 1; i <= n; i++)
		  { //??????
			minimum = a[1][i];
			for (j = t; j <= n; j++)
			{
				if (minimum > a[j][i])
				{
					minimum = a[j][i];
				}
			}

				a[1][i] -= minimum;
			for (j = t; j <= n; j++) //??????
			{
				a[j][i] -= minimum;
			}

		  }
		sum += a[t][t];
		if (t < n)
		{
			calculate(t + 1); //??
		}

	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k <= n; k++)
		{
			sum = 0; //????
			for (i = 1; i <= n; i++)
			{
			for (j = 1 ;j <= n; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			}
			}
			calculate(2);
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

