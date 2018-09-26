package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int i;
		int j;
		int n;
		int m;
		int e;
		int s;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (n <= 4 && m <= 4)
		{
			for (j = 0;j < 5;j++)
			{
				e = sz[n][j];
				sz[n][j] = sz[m][j];
				sz[m][j] = e;
			}
			for (i = 0;i < 5;i++)
			{
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",sz[i][j]);
			}
				System.out.printf("%d\n",sz[i][4]);
			}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}

}

