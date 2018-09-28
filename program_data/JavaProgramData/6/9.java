package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][][] a = new int[100][100][100];
		int[] b = new int[100];
		int[] c = new int[100];
		int[] sum = new int[100];
		int i;
		int j;
		int k;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (p = 0;p < k;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[p] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c[p] = Integer.parseInt(tempVar3);
			}
			for (i = 0;i < b[p];i++)
			{
				for (j = 0;j < c[p];j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[p][i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
		}
		for (p = 0;p < k;p++)
		{
			for (i = 0,j = 0;j < c[p];j++)
			{
				sum[p] = sum[p] + a[p][i][j];
			}
			for (i = b[p] - 1,j = 0;j < c[p];j++)
			{
				sum[p] = sum[p] + a[p][i][j];
			}
			for (j = 0,i = 1;i < b[p] - 1;i++)
			{
				sum[p] = sum[p] + a[p][i][j];
			}
			for (j = c[p] - 1,i = 1;i < b[p] - 1;i++)
			{
				sum[p] = sum[p] + a[p][i][j];
			}
		}
		for (p = 0;p < k - 1;p++)
		{
			System.out.printf("%d\n",sum[p]);
		}
		System.out.printf("%d",sum[k - 1]);
		return 0;
	}
}

