package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[50001][2];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar3);
			}
		}
		int j;
		int k;
		int t1;
		int t2;
		for (j = n - 1;j > 0;j--)
		{
			for (k = 0;k < j;k++)
			{
				if (sz[k][0] >= sz[k + 1][0])
				{
					t1 = sz[k][0];
					sz[k][0] = sz[k + 1][0];
					sz[k + 1][0] = t1;
					t2 = sz[k][1];
					sz[k][1] = sz[k + 1][1];
					sz[k + 1][1] = t2;
				}
			}
		}
		int p = 0;
		for (j = 1;j < n;j++)
		{
			for (i = 0;i < j;i++)
			{
				if (sz[i][1] >= sz[j][0])
				{
					p++;
					break;
				}
			}
		}
		for (j = n - 1;j > 0;j--)
		{
			for (k = 0;k < j;k++)
			{
				if (sz[k][1] >= sz[k + 1][1])
				{
					t1 = sz[k][1];
					sz[k][1] = sz[k + 1][1];
					sz[k + 1][1] = t1;
				}
			}
		}
		if (p == n - 1)
		{
			System.out.printf("%d %d",sz[0][0],sz[n - 1][1]);
		}
		else
		{
			System.out.print("no");
		}
	return 0;
	}


}

