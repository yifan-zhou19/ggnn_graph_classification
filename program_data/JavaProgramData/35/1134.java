package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int b;
		int a;
		int[][] sz = new int[10][10];
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			a = 0;
			for (j = 0;j < n - 1;j++)
			{
				if (sz[i][a] < sz[i][j + 1])
				{
					a = j + 1;
				}
			}
			b = 0;
			for (k = 0;k < m - 1;k++)
			{
				if (sz[b][a] > sz[k + 1][a])
				{
					b = k + 1;
				}
			}
			if (b == i)
			{
				System.out.printf("%d+%d", i,a);
				break;
			}
		}
		if (i == m)
		{
			System.out.print("No");
		}
		return 0;
	}

}

