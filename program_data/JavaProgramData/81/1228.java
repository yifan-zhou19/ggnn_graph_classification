package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[][] sz = new int[5][5];
		int a = 0;
		int k;
		int[] s = new int[5];
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
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (m >= 0 && m < 5 && n >= 0 && n < 5)
		{
		a = 1;
		for (k = 0;k < 5;k++)
		{
		s[k] = sz[m][k];
		sz[m][k] = sz[n][k];
		sz[n][k] = s[k];
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
		if (a == 0)
		{
			System.out.print("error");
		}
	return 0;
	}
}

