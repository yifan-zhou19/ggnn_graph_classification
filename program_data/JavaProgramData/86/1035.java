package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int[][] a = new int[100][100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m > 0)
			{
				for (j = 0;j <= m - 1;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a[i][j] = Integer.parseInt(tempVar3);
					}
				}
				if (60 - 3 * m >= a[i][m - 1] + 3)
				{
					b[i] = 60 - 3 * m;
				}
				if (60 - 3 * m >= a[i][m - 1] != 0 && 60 - 3 * m < a[i][m - 1] + 3)
				{
					b[i] = a[i][m - 1];
				}
				if (60 - 3 * m < a[i][m - 1])
				{
					for (j = m - 1;j >= 0;j--)
					{
						if (60 - 3 * (j + 1) >= a[i][j] + 3)
						{
							b[i] = 60 - 3 * (j + 1);
							break;
						}
						if (60 - 3 * j >= a[i][j] != 0 && 60 - 3 * j < a[i][j] + 3)
						{
							b[i] = a[i][j];
							break;
						}
					}
				}
			}
			if (m == 0)
			{
				b[i] = 60;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		return 0;
	}






}

