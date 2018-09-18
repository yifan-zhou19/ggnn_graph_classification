package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  juzhen
	//
	//  Created by blues cookie on 12-11-21.
	//  Copyright (c) 2012? blues cookie. All rights reserved.
	//

	public static int[][] a = new int[100][100];
	public static int result = 0;
	public static int min1;
	public static int minh(int n,int j) //???J?n?????????
	{
		int i;
		int min_a;
		min_a = a[j][0];
		for (i = 0;i < n;i++)
		{
			if (min_a > a[j][i])
			{
				min_a = a[j][i];
			}
		}
		return min_a;
	}
	public static int minl(int n,int j) //????
	{
		int i;
		int min_a;
		min_a = a[0][j];
		for (i = 0;i < n;i++)
		{
			if (min_a > a[i][j])
			{
				min_a = a[i][j];
			}
		}
		return min_a;
	}
	public static int dec(int n) //??
	{
		int m;
		int p;
		int q;
		if (n == 1)
		{
			System.out.print(result);
			System.out.print("\n");
			return 0;
		}
		if (n > 1)
		{
			for (m = 0;m < n;m++) //???????
			{
				min1 = minh(n, m);
			   for (p = 0;p < n;p++)
			   {
				   a[m][p] = a[m][p] - min1;
			   }
			}
			for (m = 0;m < n;m++) //???????
			{
				min1 = minl(n, m);
				for (p = 0;p < n;p++)
				{
					a[p][m] = a[p][m] - min1;

				}
			}
			result = result + a[1][1];
			for (m = 0;m < n;m++) //?????
			{
				for (p = 1;p < n - 1;p++)
				{
				  a[m][p] = a[m][p + 1];
				}
			}
		   for (m = 0;m < n - 1;m++) //?????
		   {
				for (p = 1;p < n - 1;p++)
				{
				  a[p][m] = a[p + 1][m];
				}
		   }
			dec(n - 1);
		}
	}
	public static void Main(String[] args)
	{

		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int w;
		int s;
		int t;
		for (w = 1;w <= n;w++)
		{
			for (s = 0;s < n;s++) //????
			{

				for (t = 0;t < n;t++)
				{
					a[s][t] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			result = 0;
			dec(n);
		}
	}

}

