package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[][] a = new int[100][100];
		int n;
		int m;
		int i;
		int j;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (;k > 0;k--)
		{
			sum = 0;
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
				}
			}
			if (m == 1 && n != 1)
			{
				for (i = 0;i < n;i++)
				{
					sum += a[0][i];
				}
			}
			if (n == 1 && m != 1)
			{
				for (i = 0;i < m;i++)
				{
					sum += a[i][0];
				}
			}
			if (n == 1 && m == 1)
			{
				sum = a[0][0];
			}
			else
			{
				for (i = 0;i < n - 1;i++)
				{
				sum += a[0][i] + a[m - 1][i + 1];
				}
			for (i = 0;i < m - 1;i++)
			{
				sum += a[i + 1][0] + a[i][n - 1];
			}
			}
			System.out.printf("%d\n",sum);

		}
		return 0;
	}
}

