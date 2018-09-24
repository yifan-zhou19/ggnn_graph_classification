package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] sz = new int[100][100];
		int i;
		int j;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int k;
		int kk;
		int kkk;
		int kkkk;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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
		while (true)
		{
			k = 0;
			kk = 0;
			kkk = 0;
			kkkk = 0;
			for (i = a + 1;i <= m - c;i++)
			{
				System.out.printf("%d\n",sz[b + 1 - 1][i - 1]);
				k = 1;
			}
			if (k == 0)
			{
				break;
			}
			c++;
			for (i = b + 2;i <= n - d;i++)
			{
				System.out.printf("%d\n",sz[i - 1][m - (c - 1) - 1]);
				kk = 1;
			}
			if (kk == 0)
			{
				break;
			}
			d++;
			for (i = m - c;i >= a + 1;i--)
			{
				System.out.printf("%d\n",sz[n - (d - 1) - 1][i - 1]);
				kkk = 1;
			}
			if (kkk == 0)
			{
				break;
			}
			a++;
			for (i = n - d;i >= b + 2;i--)
			{
				System.out.printf("%d\n",sz[i - 1][a - 1]);
				kkkk = 1;
			}
			b++;
			if (kkkk == 0)
			{
				break;
			}
		}
		return 0;
	}
}

