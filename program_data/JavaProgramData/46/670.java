package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int i;
		int j;
		int k;
		int te;

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
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		int u = 0;

		int tem = 0;
		for (i = 0;i < m * n;)
		{
			if (u % 4 == 0)
			{
				j = tem;
				for (k = 0;k < n;k++)
				{
					if (b[j][k] == 0)
					{
						System.out.printf("%d\n",a[j][k]);
						te = k;
						b[j][k] = 1;
						i++;
					}
				}
			}
			if (u % 4 == 1)
			{
				k = te;
				for (j = 0;j < m;j++)
				{
					if (b[j][k] == 0)
					{
						System.out.printf("%d\n",a[j][k]);
						tem = j;
						b[j][k] = 1;
						i++;
					}
				}
			}

			if (u % 4 == 2)
			{
				j = tem;
				for (k = n - 1;k >= 0;k--)
				{
					if (b[j][k] == 0)
					{
						System.out.printf("%d\n",a[j][k]);
						te = k;
						b[j][k] = 1;
						i++;
					}
				}
			}
			if (u % 4 == 3)
			{
				k = te;
				for (j = m - 1;j >= 0;j--)
				{
					if (b[j][k] == 0)
					{
						System.out.printf("%d\n",a[j][k]);
						tem = j;
						b[j][k] = 1;
						i++;
					}
				}
			}
			u++;


		}
	}
}

