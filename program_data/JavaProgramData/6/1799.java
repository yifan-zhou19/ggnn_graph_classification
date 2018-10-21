package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int m;
		int n;
		int j;
		int l;
		int[][] z = new int[100][100];
		int[] h = new int[100];
		for (i = 0;i < 100;i++)
		{
			h[i] = 0;
		}
		for (l = 0;l < k;l++)
		{
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
						(z[i][j]) = Integer.parseInt(tempVar4);
					}
				}
			}
			for (j = 0;j < n;j++)
			{
				h[l] += z[0][j];
			}
			i = m - 1;
			for (j = 0;j < n;j++)
			{
				h[l] += z[i][j];
			}
			for (i = 1;i < m - 1;i++)
			{
				h[l] += z[i][0];
			}
			j = n - 1;
			for (i = 1;i < m - 1;i++)
			{
				h[l] += z[i][j];
			}
		}
		for (l = 0;l < k;l++)
		{
			if (l == 0)
			{
			System.out.printf("%d",h[l]);
			}
			else
			{
				System.out.printf("\n%d",h[l]);
			}
		}
		return 0;
	}
}

