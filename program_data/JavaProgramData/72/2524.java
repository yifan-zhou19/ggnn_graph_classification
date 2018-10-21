package <missing>;

public class GlobalMembers
{
	// ????.cpp : ??????????????
	//
	///#include "stdafx.h"

	public static final int minn = -10000;
	public static int Main()
	{
	//int _tmain(int argc, _TCHAR* argv[])
		int[][] a = new int[100][100];
		int m;
		int n;
		int sum = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= m;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				*(*(a + j) + i) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (int i = 1;i <= n;i++)
		{
			**(a + i) = minn;
			*(*(a + i) + m + 1) = minn;
		}
		for (int i = 1;i <= m;i++)
		{
			*(a + i) = minn;
			*(*(a + n + 1) + i) = minn;
		}

		for (int i = 1;i <= m;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				if (*(*(a + j - 1) + i) - *(*(a + j) + i) <= 0 && *(*(a + j + 1) + i) - *(*(a + j) + i) <= 0 && *(*(a + j) + i - 1) - *(*(a + j) + i) <= 0 && *(*(a + j) + i + 1) - *(*(a + j) + i) <= 0)
				{
				System.out.print(i - 1);
				System.out.print(' ');
				System.out.print(j - 1);
				System.out.print("\n");
				}
			}
		}

		return 0;
	}


}

