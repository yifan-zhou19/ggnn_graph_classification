package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[10000][2];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			a[i][0] = 0;
			a[i][1] = 0;
		}
		while (scanf("%d%d", i, j))
		{
			if (i == 0 && j == 0)
			{
				break;
			}
			a[i][0] += 1;
			a[j][1] += 1;
		}
		for (i = 0; i < n; i++)
		{
			if (a[i][0] == 0 && a[i][1] == n - 1)
			{
				System.out.printf("%d\n", i);
				break;
			}
		}
		if (i == n)
		{
			System.out.print("NOT FOUND\n");
		}
		return 0;
	}

}

