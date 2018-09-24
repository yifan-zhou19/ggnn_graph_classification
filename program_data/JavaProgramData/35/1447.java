package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] sz = new int[8][8];
		int i;
		int j;
		int[] o = new int[8];
		int q = 0;
		int z = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 1;j < m;j++)
			{
				if (sz[i][o[i]] < sz[i][j])
				{
					o[i] = j;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (sz[j][o[i]] > sz[i][o[i]])
				{
					z++;
				}
			}
			if (z == n - 1)
			{
				q++;
				break;
			}
			else
			{
				z = 0;
			}
		}
		if (q == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d+%d",i,o[i]);
		}
		return 0;
	}
}

