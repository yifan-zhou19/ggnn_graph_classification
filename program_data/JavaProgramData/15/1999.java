package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[n][n];
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
		int a1;
		int a2;
		int b1;
		int b2;
		int a;
		int b;
		int c;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (sz[i][j] == 0 && sz[i - 1][j] != 0 && sz[i][j - 1] != 0)
				{
					a1 = i,b1 = j;
				}
				if (sz[i][j] == 0 && sz[i + 1][j] != 0 && sz[i][j + 1] != 0)
				{
					a2 = i,b2 = j;
				}
			}
		}
		a = a2 - a1 - 1;
		b = b2 - b1 - 1;
		c = a * b;
		System.out.printf("%d\n",c);
		return 0;
	}

}

