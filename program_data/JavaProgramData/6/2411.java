package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int p;
		int ans = 0;
		int[] m = new int[100];
		int[] n = new int[100];
		int[][][] r = new int[100][100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < m[i];j++)
			{
				for (p = 0;p < n[i];p++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						r[i][j][p] = Integer.parseInt(tempVar4);
					}
				}
			}
		}
		for (p = 0;p < k;p++)
		{
			ans = 0;
			for (i = 0;i < n[p];i++)
			{
				for (j = 0;j < m[p];j++)
				{
					if ((i == 0) || (i == n[p] - 1) || (j == 0) || (j == m[p] - 1))
					{
						ans += r[p][j][i];
					}
					else
					{
						continue;
					}
				}
			}
			System.out.printf("%d\n",ans);
		}
		return 0;
	}

}

