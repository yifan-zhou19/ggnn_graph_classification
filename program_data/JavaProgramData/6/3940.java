package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			int[][] a = new int[m][n];
			s = 0;
			for (j = 0;j < m;j++)
			{
				for (l = 0;l < n;l++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						(a[j][l]) = Integer.parseInt(tempVar4);
					}
				}
			}
			if (m == 1)
			{
				for (j = 0;j < n;j++)
				{
					s += a[0][j];
				}
			}
			else if (n == 1)
			{
				for (j = 0;j < m;j++)
				{
					s += a[j][0];
				}
			}
			else
			{
				for (j = 0;j < n;j++)
				{
					s = s + a[0][j] + a[m - 1][j];
				}
				for (j = 0;j < m;j++)
				{
					s = s + a[j][0] + a[j][n - 1];
				}
				s = s - a[0][0] - a[0][n - 1] - a[m - 1][0] - a[m - 1][n - 1];
			}
			System.out.printf("%d\n",s);
		}
		return 0;
	}
}

