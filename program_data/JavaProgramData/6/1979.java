package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s;
		int m;
		int n;
		int i;
		int j;
		int k;
		int sum = 0;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}
		for (k = 0;k < s;k++)
		{
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
			for (i = 0;i < n;i++)
			{
				sum += a[0][i];
			}
			if (m > 2)
			{
				for (i = 1;i < m - 1;i++)
				{
					sum += a[i][0];
					sum += a[i][n - 1];
				}
			}
			if (m > 1)
			{
			for (i = 0;i < n;i++)
			{
				sum += a[m - 1][i];
			}
			}
			System.out.printf("%d\n",sum);
			sum = 0;
		}
		return 0;
	}

}

