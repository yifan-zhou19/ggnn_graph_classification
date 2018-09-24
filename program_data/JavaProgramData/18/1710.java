package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  hw
	//array initializer must be an initializer list
	//  Created by ? ? on 12-12-19.
	//  Copyright (c) 2012? ? ?. All rights reserved.
	//

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int c = 0;c < n;c++)
		{
		int[][] a = new int[100][100];
		int[] rmin = new int[100];
		int[] cmin = new int[100];
		int sum = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			cmin[i] = a[0][i];
			rmin[i] = a[i][0];
		}
		for (int k = 0;k < n - 1;k++)
		{
		for (int i = 0; i < n - k; i++)
		{
			cmin[i] = a[0][i];
			rmin[i] = a[i][0];
		}
		for (int i = 0; i < n - k; i++)
		{
			for (int j = 0; j < n - k; j++)
			{
				if (rmin[i] > a[i][j])
				{
					rmin[i] = a[i][j];
				}
			}
			for (int j = 0; j < n - k; j++)
			{
				a[i][j] -= rmin[i];
			}
		}

		for (int i = 0; i < n - k; i++)
		{
			for (int j = 0; j < n - k; j++)
			{
				if (cmin[i] > a[j][i])
				{
					cmin[i] = a[j][i];
				}
			}
			for (int j = 0; j < n - k; j++)
			{
				a[j][i] -= cmin[i];
			}
		}
		sum += a[1][1];
			for (int i = 2; i < n - k; i++)
			{
				for (int j = 0; j < n - k; j++)
				{
					a[i - 1][j] = a[i][j];
				}
			}
			for (int j = 2; j < n - k; j++)
			{
				for (int i = 0; i < n - k; i++)
				{
					a[i][j - 1] = a[i][j];
				}
			}

		}
		System.out.print(sum);
		System.out.print("\n");
		}
	}

}

