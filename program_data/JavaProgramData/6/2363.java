package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum;
		int i;
		int j1;
		int j;
		int n;
		int c;
		int k;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] p = a;
		for (i = 1;i <= n;i++)
		{
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				k = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < c;j++)
			{
				for (j1 = 0;j1 < k;j1++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[j][j1] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (j = 1;j < k - 1;j++)
			{
			sum += *(p[0] + j) + *(p[c - 1] + j);
			}
			if (k > 1)
			{
			for (j = 0;j < c;j++)
			{
			sum += *(p[j]) + *(p[j] + k - 1);
			}
			}
			else
			{
			for (j = 0;j < c;j++)
			{
			sum += *(p[j]);
			}
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

