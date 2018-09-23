package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] sz = new int[1000][1000];
		int a;
		int b;
		int c;
		int d;
		int g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
				for (int k = 0;k < n;k++)
				{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							sz[i][k] = Integer.parseInt(tempVar2);
						}
				}
		}
		for (int i = 0;i < n;i++)
		{
				for (int k = 0;k < n;k++)
				{
						if (sz[i][k] == 0)
						{
						a = i;
						b = k;
						}
				}
		}
		for (int i = n - 1;i >= 0;i--)
		{
				for (int k = n - 1;k >= 0;k--)
				{
						if (sz[i][k] == 0)
						{
										c = i;
										d = k;
						}
				}
		}
		g = (a - c - 1) * (b - d - 1);
		System.out.printf("%d",g);
		return 0;
	}
}

