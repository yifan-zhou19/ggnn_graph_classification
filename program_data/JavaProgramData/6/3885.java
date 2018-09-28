package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		while (k-- != 0)
		{
			int m;
			int n;
			int sum = 0;
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
			int i;
			int j;
			int[][] a = new int[100][100];
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
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					if ((i == 0) || (i == m - 1) || (j == 0) || (j == n - 1))
					{
						sum = sum + a[i][j];
					}
					else
					{
						continue;
					}
				}
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

