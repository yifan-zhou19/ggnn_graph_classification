package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int t = 0;
		int[][] a = new int[5][5];
		int p;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			m = 0;
			for (j = 0;j < 5;j++)
			{
				if (a[i][m] <= a[i][j])
				{
					m = j;
					p = i;
				}
			}
			n = 0;
			for (j = 0;j < 5;j++)
			{
				if (a[n][m] >= a[j][m])
				{
					n = j;
				}
			}
			if (p == n)
			{
				t++;
				System.out.printf("%d %d %d",n + 1,m + 1,a[n][m]);
			}
		}
		if (t == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}

}

