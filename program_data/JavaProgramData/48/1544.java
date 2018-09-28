package <missing>;

public class GlobalMembers
{
	//
	//  main.c
	//  aa
	//
	//  Created by Duan on 12-11-27.
	//  Copyright (c) 2012? __MyCompanyName__. All rights reserved.
	//

	public static void nextday(int[][] a, int[][] b)
	{
		int i;
		int j;
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				b[i][j] = 0;
			}
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				b[i][j] += a[i][j] * 2;
				b[i + 1][j] += a[i][j];
				b[i - 1][j] += a[i][j];
				b[i + 1][j + 1] += a[i][j];
				b[i + 1][j - 1] += a[i][j];
				b[i - 1][j + 1] += a[i][j];
				b[i - 1][j - 1] += a[i][j];
				b[i][j + 1] += a[i][j];
				b[i][j - 1] += a[i][j];
			}
		}
	}
	public static void printarray(int[][] a)
	{
		int i;
		int j;
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				System.out.printf("%d",a[i][j]);
				if (j != 9)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("\n");
				}
			}
		}
	}

	public static int Main()
	{
		int m;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[][] a = new int[11][11];
		int[][] b = new int[11][11];
		a[5][5] = m;
		for (i = 0;i <= n;i++)
		{
			if (i % 2 == 0)
			{
				nextday(a, b);
			}
			else
			{
				nextday(b, a);
			}
		}
		if (i % 2 == 0)
		{
			printarray(b);
		}
		else
		{
			printarray(a);
		}
	}
}

