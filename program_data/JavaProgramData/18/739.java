package <missing>;

public class GlobalMembers
{
	/*
	 * n2.cpp
	 *
	 *  Created on: 2011-11-12
	 *      Author: Administrator
	 */

	public static int[][] a = new int[100][100];

	public static int search1(int num,int n) //??n???num?????
	{
		int i;
		int min;
		min = a[num][0];
		for (i = 1;i < n;i++)
		{
			if (a[num][i] < min)
			{
				min = a[num][i];
			}
		}
		return min;
	}

	public static int search2(int num,int n) //??n???num?????
	{
		int j;
		int min;
		min = a[0][num];
		for (j = 1;j < n;j++)
		{
			if (a[j][num] < min)
			{
				min = a[j][num];
			}
		}
		return min;
	}

	public static void dele1(int num,int n,int x) //?n????num??????x
	{
		int i;
		for (i = 0;i <= n;i++)
		{
			a[num][i] = a[num][i] - x;
		}
	}

	public static void dele2(int num,int n,int x) //?n????num??????x
	{
		int j;
		for (j = 0;j <= n;j++)
		{
			a[j][num] = a[j][num] - x;
		}
	}

	public static void move(int n) //???2??2?
	{
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 1;j < n - 1;j++)
			{
				a[i][j] = a[i][j + 1];
			}
		}
		for (j = 0;j < n - 1;j++)
		{
			for (i = 1;i < n - 1;i++)
			{
				a[i][j] = a[i + 1][j];
			}
		}
	}

	public static int Main()
	{
		int n;
		int l;
		int i;
		int j;
		int m;
		int ans;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 1;l <= n;l++)
		{
			m = n; //?????
			ans = 0;
			for (i = 0;i < n;i++) //????
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}

			while (m > 1)
			{ //??????
				for (i = 0;i < m;i++)
				{
					dele1(i, m, search1(i, m));
				}
				for (j = 0;j < m;j++)
				{
					dele2(j, m, search2(j, m));
				}
				ans = ans + a[1][1];
				move(m);
				m = m - 1;
			}

			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}
}

