package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int t;
		int k = 0;
		int p;
		int ans;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		while (k < m)
		{
			n = m;
			ans = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						*(a + i) + j = tempVar2;
					}
				}
			}
	   p = 1;
				while (n > p)
				{
					for (i = 0;i < n;i++)
					{
						if (i != 0 && i < p)
						{
							continue;
						}
						t = (*(a + i) + 0);
						for (j = p;j < n;j++)
						{
							t = t > *(*(a + i) + j)?*(*(a + i) + j):t;
						}
						for (j = 0;j < n;j++)
						{
							*(*(a + i) + j) -= t;
						}
					}
					for (i = 0;i < n;i++)
					{
						if (j != 0 && j < p)
						{
							continue;
						}
							t = (*(a + 0) + i);
							for (j = p;j < n;j++)
							{
								t = t > *(*(a + j) + i)?*(*(a + j) + i):t;
							}
							for (j = 0;j < n;j++)
							{
								*(*(a + j) + i) -= t;
							}
					}
					ans += *(*(a + p) + p);
					p++;
				}
				System.out.printf("%d\n",ans);
				k++;
		}
	}

}

