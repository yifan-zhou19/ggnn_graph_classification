package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int p;
	int n;
	int m;
	int i;
	int k;
	int j;
	int[][] a = new int[100][100];
	int[] s = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Integer.parseInt(tempVar);
		}
		for (k = 0;k < p;k++)
		{
			s[k] = 0;
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
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[i][j] = Integer.parseInt(tempVar4);
					}
					if (i == 0)
					{
						s[k] += a[i][j];
					}
						else if ((m - i - 1) == 0)
						{
							s[k] += a[i][j];
						}
							else if (j == 0)
							{
								s[k] += a[i][j];
							}
								else if ((n - j - 1) == 0)
								{
									s[k] += a[i][j];
								}
				}
			}
		}
		for (k = 0;k < p;k++)
		{
			System.out.printf("%d\n",s[k]);
		}
	return 0;
	}
}

