package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int n;
		int i;
		int j;
		int[][] x = new int[20][20];
		int[] h = new int[400];
		int[] z = new int[400];
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
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
					x[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			if (i == 0)
			{
				for (j = 0;j < n;j++)
				{
				if (j == 0)
				{
					if (x[i][j] >= x[i + 1][j] != 0 && x[i][j] >= x[i][j + 1])
					{
						h[t] = i;
						z[t] = j;
						t++;
					}
				}
				else if (j < n - 1)
				{
					if (x[i][j] >= x[i][j - 1] != 0 && x[i][j] >= x[i][j + 1] != 0 && x[i][j] >= x[i + 1][j])
					{
						h[t] = i;
						z[t] = j;
						t++;
					}
				}
				else
				{
					if (x[i][j] >= x[i + 1][j] != 0 && x[i][j] >= x[i][j - 1])
					{
						h[t] = i;
						z[t] = j;
						t++;
					}
				}
				}
			}
			else if (i < m - 1)
			{
				for (j = 0;j < n;j++)
				{
				if (j == 0)
				{
					if (x[i][j] >= x[i - 1][j] != 0 && x[i][j] >= x[i + 1][j] != 0 && x[i][j] >= x[i][j + 1])
					{
						h[t] = i;
						z[t] = j;
						t++;
					}
				}
				else if (j < n - 1)
				{
					if (x[i][j] >= x[i][j - 1] != 0 && x[i][j] >= x[i][j + 1] != 0 && x[i][j] >= x[i - 1][j] != 0 && x[i][j] >= x[i + 1][j])
					{
						h[t] = i;
						z[t] = j;
						t++;
					}
				}
				else
				{
					if (x[i][j] >= x[i - 1][j] != 0 && x[i][j] >= x[i + 1][j] != 0 && x[i][j] >= x[i][j - 1])
					{
						h[t] = i;
						z[t] = j;
						t++;
					}
				}
				}
			}
			else
			{
				for (j = 0;j < n;j++)
				{
				if (j == 0)
				{
					if (x[i][j] >= x[i - 1][j] != 0 && x[i][j] >= x[i][j + 1])
					{
						h[t] = i;
						z[t] = j;
						t++;
					}
				}
				else if (j < n - 1)
				{
					if (x[i][j] >= x[i - 1][j] != 0 && x[i][j] >= x[i][j - 1] != 0 && x[i][j] >= x[i][j + 1])
					{
						h[t] = i;
						z[t] = j;
						t++;
					}
				}
				else
				{
					if (x[i][j] >= x[i - 1][j] != 0 && x[i][j] >= x[i][j - 1])
					{
						h[t] = i;
						z[t] = j;
						t++;
					}
				}
				}
			}
		}
		for (i = 0;i < t;i++)
		{
			System.out.printf("%d %d\n",h[i],z[i]);
		}
	}


}

