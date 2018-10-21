package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int[] a = new int[5];
		int n;
		int m;
		int i;
		int j;
		int f;
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
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
			f = 1;
		}
		else
		{
			f = 0;
		}
		if (f == 1)
		{
			for (i = 0;i < 5;i++)
			{
			a[i] = sz[n][i];
			sz[n][i] = sz[m][i];
			sz[m][i] = a[i];
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
		if (f == 0)
		{
			System.out.print("error");
		}
	return 0;
	}

}

