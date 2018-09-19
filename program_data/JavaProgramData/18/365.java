package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012795-?????????.cpp
	 *
	 *  Created on: 2010-12-29
	 *      Author: Administrator
	 */
	public static int[][] a = new int[1000][1000];
	public static int sum = 0;
	public static void cut(int n)
	{
		int i;
		int j;
		int k;
		int min = 10000;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{

			   if (min > a[i][j])
			   {
				   min = a[i][j];
			   }
			}
			for (k = 0;k < n;k++)
			{
				a[i][k] = a[i][k] - min;
			}
			min = 10000;
		}
		min = 10000;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (min > a[j][i])
				{
					min = a[j][i];
				}
			}
			for (k = 0;k < n;k++)
			{
				a[k][i] = a[k][i] - min;
			}
			min = 10000;
		}
		sum = sum + a[1][1];
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (p = 1;p < n;p++)
			{
			 cut(n - p + 1);
			 for (j = 1;j < n - p;j++)
			 {
				 for (k = 1;k < n - p;k++)
				 {
					 a[j][k] = a[j + 1][k + 1];
				 }
			 }
			 for (k = 1;k < (n - p);k++)
			 {
				 a[0][k] = a[0][k + 1];
			 }
			 for (k = 1;k < (n - p);k++)
			 {
				 a[k][0] = a[k + 1][0];
			 }
			}
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
		}
		return 0;
	}



}

