package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int[][] a = new int[100][100];
		int i;
		int j;
		int r;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
					int b = 0;
					int c = 0;
					int d = 0;
					int e = 0;
					int sum = 0;
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
			for (j = 0;j < m;j++)
			{
				for (r = 0;r < n;r++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[j][r] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (j = 0;j < m;j++)
			{
				b += a[j][0];
				d += a[j][n - 1];
			}
			for (r = 1;r < n - 1;r++)
			{
				c += a[m - 1][r];
				e += a[0][r];
			}
			sum = b + c + d + e;
			System.out.printf("%d\n",sum);
		}
		return 0;
	}

}

