package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[1000][1000];
		int n;
		int i;
		int j;
		int a1;
		int a2;
		int b1;
		int b2;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if ((sz[i][j] == 0) && (sz[i - 1][j] != 0) && (sz[i][j - 1] != 0))
				{
					a1 = i;
					b1 = j;
				}
			}
		}
		for (i = n;i > 0;i--)
		{
			for (j = n;j > 0;j--)
			{
				if ((sz[i][j] == 0) && (sz[i + 1][j] != 0) && (sz[i][j + 1] != 0))
				{
					a2 = i;
					b2 = j;
				}
			}
		}
		s = (a2 - a1 - 1) * (b2 - b1 - 1);
		System.out.printf("%d",s);
		return 0;
	}

}

