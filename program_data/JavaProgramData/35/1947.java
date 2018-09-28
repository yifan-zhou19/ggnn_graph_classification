package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10][10];
		int[] e = new int[1000];
		int[] f = new int[1000];
		int[] k = new int[1000];
		int i;
		int j;
		int n;
		int m;
		int t = 0;
		int x = 0;
		for (i = 0;i < 10;i++)
		{
			k[i] = 0;
		}
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
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (a[i][j] > k[t])
				{
					k[t] = a[i][j];
					e[t] = i;
					f[t] = j;
				}
			}
			t++;
		}
		for (j = 0;j < m;j++)
		{
			for (t = 0;t < 10;t++)
			{
				if (f[t] == j)
				{
					break;
				}
			}
			for (i = 0;i < n;i++)
			{
				if (a[e[t]][f[t]] > a[i][j])
				{
					break;
				}
				if (i == n - 1)
				{
					System.out.printf("%d+%d",e[t],f[t]);
					x++;
				}
			}
			if (x == 1)
			{
				break;
			}
		}
		if (x == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

