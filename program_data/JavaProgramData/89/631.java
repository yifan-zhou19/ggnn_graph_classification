package <missing>;

public class GlobalMembers
{
	/*
	 * xiaoceyan5.4.cpp
	 * ?????????
	 *  Created on: 2011-1-8
	 *      Author: william
	 */
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int num;
		int mingliu = -1;
		int[][] b = new int[100000][2];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ;; i++)
		{
			b[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (b[i][0] == 0 && b[i][1] == 0)
			{
				break;
			}
		}
		num = i;
		for (i = 0; i < n; i++)
		{
			int q = 0;
			for (j = 0; j < num; j++)
			{
				if (b[j][0] == i)
				{
					break;
				}
			}
			if (j == num)
			{
				for (k = 0; k < num; k++)
				{
					if (b[k][1] == i)
					{
						q++;
					}
				}
				if (q == n - 1)
				{
					mingliu = i;
				}
			}
		}
		if (mingliu == -1)
		{
			System.out.print("NOT FOUND");
		}
		else
		{
			System.out.print(mingliu);
		}
		return 0;
	}

}

