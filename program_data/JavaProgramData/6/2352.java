package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int m;
		int n;
		int[][] a = new int[110][110];
		int i;
		int j;
		int l;
		int s = 0;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			for (j = 1;j <= m;j++)
			{
				for (l = 1;l <= n;l++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[j][l] = Integer.parseInt(tempVar4);
					}
				}
			}
			if (m == 1)
			{
				for (j = 1;j <= n;j++)
				{
					s = s + a[1][j];
				}
			}
			else if (n == 1)
			{
				for (j = i;j <= m;j++)
				{
					s = s + a[j][1];
				}
			}
			else
			{
				for (j = 1;j <= m;j++)
				{
				s = s + a[j][1] + a[j][n];
				a[j][1] = 0;
				a[j][n] = 0;
				}
			for (j = 2;j < n;j++)
			{
				s = s + a[1][j] + a[m][j];
				a[1][j] = 0;
				a[m][j] = 0;
			}
			}
			System.out.printf("%d\n",s);
			s = 0;
		}
	}
}

