package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int n;
		int i;
		int j;
		int[][] high = new int[80][80];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					high[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		//???
		i = 0;
		j = 0;
		if ((high[0][0] >= high[0][1]) && (high[0][0] >= high[1][0]))
		{
			System.out.printf("%d %d\n",i,j);
		}
		for (j = 1;j < n - 1;j++)
		{
			if ((high[0][j] >= high[0][j - 1]) && (high[0][j] >= high[0][j + 1]) && (high[0][j] >= high[1][j]))
			{
				System.out.printf("%d %d\n",i,j);
			}
		}
		j = n - 1;
		if ((high[0][j] > high[0][j - 1]) && (high[0][j] >= high[1][j]))
		{
			System.out.printf("%d %d\n",i,j);
		}

		//????
		for (i = 1;i <= m - 2;i++)
		{
			j = 0;

			if ((high[i][0] >= high[i][1]) && (high[i][0] >= high[i + 1][0]) && (high[i][0] >= high[i - 1][0]))
			{
				System.out.printf("%d %d\n",i,j);
			}

			for (j = 1;j < n - 1;j++)
			{
				if ((high[i][j] >= high[i][j - 1]) && (high[i][j] >= high[i][j + 1]) && (high[i][j] >= high[i - 1][j]) && (high[i][j] >= high[i + 1][j]))
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
			j = n - 1;

				if ((high[i][j] > high[i][j - 1]) && (high[i][j] >= high[i - 1][j]) && (high[i][j] >= high[i + 1][j]))
				{
					System.out.printf("%d %d\n",i,j);
				}


		}

		//????
		i = m - 1;
		j = 0;
		if ((high[i][0] >= high[i][1]) && (high[i][0] >= high[i - 1][0]))
		{
			System.out.printf("%d %d\n",i,j);
		}
		for (j = 1;j <= n - 2;j++)
		{
			if ((high[i][j] >= high[i][j - 1]) && (high[i][j] >= high[i][j + 1]) && (high[i][j] >= high[i - 1][j]))
			{
				System.out.printf("%d %d\n",i,j);
			}
		}
		j = n - 1;
		if ((high[i][j] >= high[i][j - 1]) && (high[i][j] >= high[i - 1][j]))
		{
			System.out.printf("%d %d\n",i,j);
		}
	}

}

