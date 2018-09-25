package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  square
	//
	//  Created by blues cookie on 13-1-12.
	//  Copyright (c) 2013? blues cookie. All rights reserved.
	//

	public static int[][] a = new int[100][100];
	public static int findmin(int c,int low,int n)
	{
		int min;
		if (c == 1) //?hang??
		{
			int i;
			min = a[low][0];
			for (i = 0;i < n;i++)
			{
				if (a[low][i] < min)
				{
					min = a[low][i];
				}
			}
		}
		if (c == 0) //min lie
		{
			int i;
			min = a[0][low];
			for (i = 0;i < n;i++)
			{
				if (a[i][low] < min)
				{
					min = a[i][low];
				}
			}
		}
		return min;
	}
	public static int dec(int n,int sum)
	{
		if (n == 1)
		{
			return sum;
		}
		int i;
		int j;
		int k;
		int min;
		for (i = 0;i < n;i++)
		{
			min = findmin(1, i, n);
			for (j = 0;j < n;j++)
			{
				a[i][j] = a[i][j] - min;
			}
		}
		for (i = 0;i < n;i++)
		{
			min = findmin(0, i, n);
			for (j = 0;j < n;j++)
			{
				a[j][i] = a[j][i] - min;
			}
		} //??????
		sum = sum + a[1][1];
		for (i = 0;i < n;i++)
		{
			for (j = 1;j < n - 1;j++)
			{
				a[j][i] = a[j + 1][i];
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 1;j < n - 1;j++)
			{
				a[i][j] = a[i][j + 1];
			}
		}
		return dec(n - 1, sum);
	}
	public static void Main(String[] args)
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int s;
		int t;
		for (int k = 1;k <= n;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			System.out.print(dec(n, 0));
			System.out.print("\n");
		}

	}

}

