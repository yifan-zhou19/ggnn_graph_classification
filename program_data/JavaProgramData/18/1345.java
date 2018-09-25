package <missing>;

public class GlobalMembers
{
	/*
	 * Matrix to zero.cpp
	 *??:????
	 *  Created on: 2012-11-27
	 *      Author: ???
	 */


	public static int sum = 0; //????sum
	public static void change(int n)
	{
		int m;
		m = n;
		int min; //???
		if (m == 1) //?????
		{
			System.out.print(sum);
			System.out.print("\n");
		}
		else
		{
		int i = 0;
		int j = 0;
		for (i = 0;i < m;i++) //???
		{
			min = number[i][0];
			for (j = 0;j < m;j++)
			{
				if (min > number[i][j])
				{
					min = number[i][j];
				}
			}
			for (j = 0;j < n;j++)
			{
				number[i][j] = number[i][j] - min;
			}
		}
		for (i = 0;i < m;i++) //???
		{
			min = number[0][i];
			for (j = 0;j < m;j++)
			{
				if (min > number[j][i])
				{
					min = number[j][i];
				}
			}
			for (j = 0;j < m;j++)
			{
				number[j][i] = number[j][i] - min;
			}
		}

		sum = sum + number[1][1]; //??
		for (j = 0;j < m;j++) //??
		{
			for (i = 1;i < m - 1;i++)
			{
				number[i][j] = number[i + 1][j];
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			for (j = 1;j < m - 1;j++)
			{
				number[i][j] = number[i][j + 1];
			}
		}
		m = m - 1;
		change(m); //??
		}
	}
	public static int[][] number = new int[100][100]; //????number
	public static int Main()
	{
		int n; //????
		int k;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			for (k = 0;k < n;k++)
			{
				for (j = 0;j < n;j++)
				{
				number[k][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			sum = 0;
			change(n); //???? change
		}
		return 0;
	}
}

