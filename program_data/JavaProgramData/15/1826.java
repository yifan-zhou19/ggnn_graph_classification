package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int n;
		int i;
		int j;
		int a;
		int b;
		int c;
		int d;
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
		for (i = 1;i < n - 1;i++)
		{
			for (j = 1;j < n - 1;j++)
			{
				if (sz[i - 1][j] == 0 && sz[i][j - 1] == 0 && sz[i - 1][j - 1] == 0)
				{
					a = i;
					b = j;
				}
				if (sz[i][j + 1] == 0 && sz[i + 1][j] == 0 && sz[i + 1][j + 1] == 0)
				{
					c = i;
					d = j;
				}

			}
		}
		System.out.printf("%d", (c - a + 1) * (d - b + 1));
		return 0;

	}
}

