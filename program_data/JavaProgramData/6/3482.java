package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int m;
		int n;
		int sum;
		int i;
		int j;
		int[][] jz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (;k > 0;k--)
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
			sum = 0;
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						jz[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (i = 0;i < m;i++)
			{
				sum += (jz[i][0] + jz[i][n - 1]);
			}
			for (i = 0;i < n;i++)
			{
				sum += (jz[0][i] + jz[m - 1][i]);
			}
			sum -= (jz[0][0] + jz[m - 1][n - 1] + jz[0][n - 1] + jz[m - 1][0]);
			System.out.printf("%d\n",sum);
		}

	}
}

