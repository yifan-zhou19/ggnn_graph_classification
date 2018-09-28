package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int n;
		int m;
		int i;
		int j;
		int e;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 4;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					(sz[i][j]) = Integer.parseInt(tempVar);
				}
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i][4] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
			for (i = 0;i < 5;i++)
			{
				e = sz[n][i];
				sz[n][i] = sz[m][i];
				sz[m][i] = e;
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",(sz[i][j]));
				}
				System.out.printf("%d\n",sz[i][4]);
			}
		}
		else
		{
			System.out.print("error");
			return 0;
		}

	}
}

