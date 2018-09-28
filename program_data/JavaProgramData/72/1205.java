package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int j;
		int m;
		int n;
		int e = 0;
		int[][] sz = new int[102][102];
		int[][] s = new int[100][2];
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
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (sz[i][j] >= sz[i - 1][j] != 0 && sz[i][j] >= sz[i + 1][j] != 0 && sz[i][j] >= sz[i][j + 1] != 0 && sz[i][j] >= sz[i][j - 1])
				{
					s[e][0] = i - 1;
					s[e][1] = j - 1;
					e++;
				}
			}
		}
		for (i = 0;i < e;i++)
		{
			System.out.printf("%d %d\n",s[i][0],s[i][1]);
		}
		return 0;

	}
}

