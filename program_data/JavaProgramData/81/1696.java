package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[5][5];

		for (int a = 0;a < 5;a++)
		{
			for (int b = 0;b < 5;b++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[a][b] = Integer.parseInt(tempVar);
				}
			}
		}
		int m;
		int n;
		int e;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (m <= 4 && m >= 0 && n <= 4 && n >= 0)
		{
			for (int b = 0;b < 5;b++)
			{
			   e = sz[n][b];
				sz[n][b] = sz[m][b];
				sz[m][b] = e;
			}
			for (int a = 0;a < 5;a++)
			{
				for (int b = 0;b < 4;b++)
				{
					System.out.printf("%d ",sz[a][b]);
				}
					System.out.printf("%d\n",sz[a][4]);
			}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}

}

