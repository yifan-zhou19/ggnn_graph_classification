package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int a;
		int b;
		int c;
		int d;
		int[][] sz = new int[1000][1000];
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
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (sz[i][j] == 0 && sz[i][j + 1] == 0 && sz[i + 1][j] == 0)
				{
					a = i;
					b = j;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (sz[i][j] == 0 && sz[i][j - 1] == 0 && sz[i - 1][j] == 0)
				{
					c = i;
					d = j;
				}
			}
		}
		s = (c - a - 1) * (d - b - 1);
		System.out.printf("%d",s);
		return 0;
	}

}

