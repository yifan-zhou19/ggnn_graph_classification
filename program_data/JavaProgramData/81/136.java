package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int z;
		int flag;
		int[][] sz = new int[5][5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
			for (i = 0;i < 5;i++)
			{
				z = sz[n][i];
				sz[n][i] = sz[m][i];
				sz[m][i] = z;
			flag = 1;
			}
		}
		else
		{
			flag = 0;
		}
		if (flag == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j == 0)
					{
						System.out.printf("%d",sz[i][j]);
					}
					else
					{
						System.out.printf(" %d",sz[i][j]);
					}
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}

