package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : Homework.cpp
	// Author      : ???
	// Version     :
	// Copyright   : Your copyright notice
	// Description : Hello World in C++, Ansi-style
	//============================================================================


	public static int Main()
	{
		int n;
		int d;
		int sum = 0;
		char r;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[n + 2][n + 2];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				r = ConsoleInput.readToWhiteSpace(true).charAt(0);
				switch (r)
				{
				case '.':
					a[i][j] = 1;
					break;
				case '@':
					a[i][j] = 100;
					break;
				default:
					break;
				}
			}
		}
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int day = 1;day < d;day++)
		{
			for (int i = 1;i <= n;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					if (a[i][j] >= 100)
					{
						a[i - 1][j] *= 2;
						a[i + 1][j] *= 2;
						a[i][j - 1] *= 2;
						a[i][j + 1] *= 2;
					}
				}
			}
			for (int i = 1;i <= n;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					if (a[i][j] >= 2)
					{
						a[i][j] = 100;
					}
				}
			}
		}
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				if (a[i][j] > 1)
				{
					sum++;
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}

}

