package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int a;
		int b;
		a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[][] sg = new int[100][100];
		int[] sz1 = new int[1000];
		int[] sz2 = new int[1000];
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(sg[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}
		if (sg[0][0] >= sg[0][1] != 0 && sg[0][0] >= sg[1][0])
		{
			sz1[a] = 0;
			sz2[a] = 0;
			a++;
		}
		if (sg[0][n - 1] >= sg[0][n - 2] != 0 && sg[0][n - 1] >= sg[1][n - 1])
		{
			sz1[a] = 0;
			sz2[a] = n - 1;
			a++;
		}
		if (sg[m - 1][0] >= sg[m - 1][1] != 0 && sg[m - 1][0] >= sg[m - 2][0])
		{
			sz1[a] = m - 1;
			sz2[a] = 0;
			a++;
		}
		if (sg[m - 1][n - 1] >= sg[m - 1][n - 2] != 0 && sg[m - 1][n - 1] >= sg[m - 2][n - 1])
		{
			sz1[a] = m - 1;
			sz2[a] = n - 1;
			a++;
		}
		if (n > 1)
		{
			for (j = 1;j < n - 1;j++)
			{
				if (sg[0][j] >= sg[0][j + 1] != 0 && sg[0][j] >= sg[1][j] != 0 && sg[0][j] >= sg[0][j - 1])
				{
					sz1[a] = 0;
					sz2[a] = j;
					a++;
				}
			}
		}
		if (m > 1 && n > 1)
		{
			for (j = 1;j < n - 1;j++)
			{
				if (sg[m - 1][j] >= sg[m - 1][j + 1] != 0 && sg[m - 1][j] >= sg[m - 2][j] != 0 && sg[m - 1][j] >= sg[m - 1][j - 1])
				{
					sz1[a] = m - 1;
					sz2[a] = j;
					a++;
				}
			}
		}
		 if (m > 1)
		 {
			for (i = 1;i < m - 1;i++)
			{
				if (sg[i][0] >= sg[i + 1][0] != 0 && sg[i][0] >= sg[i - 1][0] != 0 && sg[i][0] >= sg[i][1])
				{
					sz1[a] = i;
					sz2[a] = 0;
					a++;
				}
			}
		 }
		if (m > 1 && n > 1)
		{
			for (i = 1;i < m - 1;i++)
			{
				if (sg[i][n - 1] >= sg[i + 1][n - 1] != 0 && sg[i][n - 1] >= sg[i - 1][n - 1] != 0 && sg[i][n - 1] >= sg[i][n - 2])
				{
					sz1[a] = i;
					sz2[a] = j = n - 1;
					a++;
				}
			}
		}
		if (m > 1 && n > 1)
		{
			for (i = 1;i < m - 1;i++)
			{
				for (j = 1;j < n - 1;j++)
				{
					if (sg[i][j] >= sg[i - 1][j] != 0 && sg[i][j] >= sg[i + 1][j] != 0 && sg[i][j] >= sg[i][j - 1] != 0 && sg[i][j] >= sg[i][j + 1])
					{
						sz1[a] = i;
						sz2[a] = j;
						a++;
					}
				}
			}
		}

		for (int k = 0;k < a - 1;k++)
		{
			int e;
			for (b = 1;b < a - k;b++)
			{
				if (sz1[b - 1] > sz1[b] || (sz1[b - 1] == sz1[b] && sz2[b - 1] > sz2[b]))
				{
					e = sz1[b];
					sz1[b] = sz1[b - 1];
					sz1[b - 1] = e;

					e = sz2[b];
					sz2[b] = sz2[b - 1];
					sz2[b - 1] = e;
				}

			}

		}
	for (b = 0;b < a;b++)
	{
		System.out.printf("%d %d\n",sz1[b],sz2[b]);
	}
	return 0;
	}


}

