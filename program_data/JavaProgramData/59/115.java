package <missing>;

public class GlobalMembers
{
	// test.cpp : Defines the entry point for the console application.
	//

	///#include "stdafx.h"

	public static final int[] dx = {0, -1, 1, 0};
	public static final int[] dy = {-1, 0, 0, 1};
	public static int Main()
	{
	//int _tmain(int argc, _TCHAR* argv[])
		int n;
		char[][] a = new char[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
			a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int t = 0;t < m - 1;t++)
		{
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
				if (a[i][j] == '@')
				{
					for (int k = 0;k < 4;k++)
					{
						if ((i + dx[k] < n) && (i + dx[k] >= 0) && (j + dy[k] < n) && (j + dy[k] >= 0) && (a[i + dx[k]][j + dy[k]] == '.'))
						{
							a[i + dx[k]][j + dy[k]] = 'N';
						}
					}
				}
				}
			}
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					if (a[i][j] == 'N')
					{
						a[i][j] = '@';
					}
				}
			}
		}
		int sum = 0;
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
			if (a[i][j] == '@')
			{
				sum++;
			}
			}
		}
			System.out.print(sum);
			System.out.print("\n");
	}


}

