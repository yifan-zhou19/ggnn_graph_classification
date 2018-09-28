package <missing>;

public class GlobalMembers
{
	/*
	 * patient.cpp
	 *
	 *  Created on: 2012-11-12
	 *      Author: ThinkPad
	 */
	public static int Main()
	{
		char[][] a = new char[100][100];
		int[] line = new int[10000];
		int[] row = new int[10000];
		int i;
		int n;
		int j;
		int day;
		int m;
		int k;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (day = 1;day <= m - 1;day++)
		{
			k = 0;
			sum = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == '@')
					{
						line[k] = i;
						row[k] = j;
					k = k + 1;
					}
				}
			}
			for (i = 0;i < k;i++)
			{

				if (a[line[i] - 1][row[i]] != '#')
				{
					a[line[i] - 1][row[i]] = '@';
				}
				if (a[line[i] + 1][row[i]] != '#')
				{
					a[line[i] + 1][row[i]] = '@';
				}
				if (a[line[i]][row[i] - 1] != '#')
				{
					a[line[i]][row[i] - 1] = '@';
				}
				if (a[line[i]][row[i] + 1] != '#')
				{
					a[line[i]][row[i] + 1] = '@';
				}

			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == '@')
					{
						sum = sum + 1;
					}
				}
			}
		}
		if (m == 1)
		{
			for (i = 0;i < n;i++)
			{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					line[k] = i;
					row[k] = j;
				k = k + 1;
				}
			}
			}
			System.out.print(k);
		}
		else
		{
			System.out.print(sum);
		}
		return 0;
	}

}

