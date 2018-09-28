package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int sum1;
		int sum2;
		int sum3;
		int sum4;
		int i;
		int j;
		int l;
		int[][] a = new int[100][100];
		int[] b = new int[100];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (l = 1;l <= k;l++)
		{
			sum1 = 0;
			sum2 = 0;
			sum3 = 0;
			sum4 = 0;
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
			for (j = 0;j < n;j++)
			{
				sum1 = sum1 + a[0][j];
			}
			for (i = 1;i < m;i++)
			{
				sum2 = sum2 + a[i][n - 1];
			}
			for (j = 0;j < n - 1;j++)
			{
				sum3 = sum3 + a[i - 1][j];
			}
			for (i = 1;i < m - 1;i++)
			{
				sum4 = sum4 + a[i][0];
			}
			b[l] = sum1 + sum2 + sum3 + sum4;
		}
		for (l = 1;l <= k;l++)
		{
			System.out.printf("%d\n",b[l]);
		}
		return 0;


	}
}

