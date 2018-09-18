package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][1000];
		int t;
		int i;
		int j;
		int x = 0;
		int b = 0;
		int m = 0;
		int n = 0;
		int s;
		int s1;
		int s2;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			for (j = 0;j < t;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < t;i++)
		{
			for (j = 0;j < t;j++)
			{
				if (a[i][j] == 0)
				{
					x = i;
					b = j;
				   break;
				}

			}
			if (a[x][b] == 0)
			{
				break;
			}
		}
		for (i = t - 1;i >= 0;i--)
		{
			for (j = t - 1;j >= 0;j--)
			{
				if (a[i][j] == 0)
				{
					m = i;
					n = j;

					break;
				}

			}
			if (a[m][n] == 0)
			{
					break;
			}
		}
		s1 = m - x - 1;
		s2 = n - b - 1;
		s = s1 * s2;
		System.out.printf("%d\n",s);
		return 0;
	}


}

