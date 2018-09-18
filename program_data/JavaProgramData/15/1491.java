package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int s;
		int n;
		int[] b = new int[2];
		int[] c = new int[2];
		int q = 0;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			s = 0;
			for (j = 0;j <= n - 1;j++)
			{
				if (a[i][j] == 0)
				{
					s += 1;
				}
			}
			if (s > 2)
			{
				b[p] = i;
				p += 1;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			s = 0;
			for (j = 0;j <= n - 1;j++)
			{
				if (a[j][i] == 0)
				{
					s += 1;
				}
			}
			if (s > 2)
			{
				c[q] = i;
				q += 1;
			}
		}
		System.out.printf("%d",(b[1] - b[0] - 1) * (c[1] - c[0] - 1));
		return 0;
	}
}

