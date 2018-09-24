package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[][] a = new int[100][100];
		int i;
		int j;
		int sum;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (t-- != 0)
		{
			sum = 0;
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
			if (m > 1)
			{
				for (i = 0;i < m;i++)
				{
					sum += a[i][0] + a[i][n - 1];
				}
			}
			else
			{
				for (i = 0;i < m;i++)
				{
					sum += a[i][0];
				}
			}
			if (n > 1)
			{
				for (i = 1;i < n - 1;i++)
				{
					sum += a[0][i] + a[m - 1][i];
				}
			}
			else
			{
				for (i = 1;i < n - 1;i++)
				{
					sum += a[0][i];
				}
			}
			System.out.printf("%d\n",sum);
		}
	}
}

