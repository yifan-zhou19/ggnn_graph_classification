package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		char[][] s = new char[200][200];
		int x;
		int y;
		int[][] use1 = new int[200][200];
		int[][] use2 = new int[200][200];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(use1,0,(Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				use1[i][j] = 3;
				s[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (s[i][j] == '#')
				{
					use1[i][j] = 1;
				}
				if (s[i][j] == '@')
				{
					use1[i][j] = 2;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i < m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				for (k = 1;k <= n;k++)
				{
				use2[j][k] = use1[j][k];
				}
			}
			for (j = 1;j <= n;j++)
			{
				for (k = 1;k <= n;k++)
				{
				if (use1[j][k] == 2)
				{
					if (use1[j + 1][k] == 3)
					{
						use2[j + 1][k] = 2;
					}
					if (use1[j - 1][k] == 3)
					{
						use2[j - 1][k] = 2;
					}
					if (use1[j][k + 1] == 3)
					{
						use2[j][k + 1] = 2;
					}
					if (use1[j][k - 1] == 3)
					{
						use2[j][k - 1] = 2;
					}
				}
				}
			}
			for (j = 1;j <= n;j++)
			{
				for (k = 1;k <= n;k++)
				{
					use1[j][k] = use2[j][k];
				}
			}
		}
		m = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
			if (use1[i][j] == 2)
			{
				m++;
			}
			}
		}
		System.out.print(m);
		System.out.print("\n");


		return 0;
	}


}

