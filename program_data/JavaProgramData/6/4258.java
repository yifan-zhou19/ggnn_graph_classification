package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int j;
		int sum;
		int[][] a = new int[100][100];
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
			for (i = 0,j = 0;j < n;j++)
			{
			sum = sum + a[i][j];
			}
			for (i = m - 1,j = 0;j < n;j++)
			{
			sum = sum + a[i][j];
			}
			for (i = 0,j = 0;i < m;i++)
			{
			sum = sum + a[i][j];
			}
			for (i = 0,j = n - 1;i < m;i++)
			{
			sum = sum + a[i][j];
			}
			sum = sum - a[0][0] - a[m - 1][0] - a[0][n - 1] - a[m - 1][n - 1];
			System.out.printf("%d\n",sum);
		}
	}

}

