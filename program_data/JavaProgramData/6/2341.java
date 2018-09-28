package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int s;
		int[][] a = new int[100][100];
		int j;
		int l;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (p = 0;p < k;p++)
		{
			s = 0;
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
			for (j = 0;j < m;j++)
			{
				for (l = 0;l < n;l++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[j][l] = Integer.parseInt(tempVar4);
					}
				}
			}
			if ((n > 1) && (m > 1))
			{
				for (i = 0;i < n;i++)
				{
					s += a[0][i];
					s += a[m - 1][i];
				}
				for (i = 1;i < m - 1;i++)
				{
					s += a[i][0];
					s += a[i][n - 1];
				}
			}
			else
			{
				if (n == 1)
				{
				for (i = 0;i < m;i++)
				{
					s += a[i][0];
				}
				}
			else
			{
				if (m == 1)
				{
					for (i = 0;i < n;i++)
					{
					s += a[0][i];
					}
				}
			}
			}
			System.out.printf("%d\n",s);
		}
		return 0;
	}


}

