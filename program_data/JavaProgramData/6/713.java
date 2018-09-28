package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sum = new int[100];
		int i;
		int j;
		int k;
		int h;
		int[] a = new int[100];
		int[] b = new int[100];
		int[][] juzhen = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (h = 0;h < k;h++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[h]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(b[h]) = Integer.parseInt(tempVar3);
			}
			for (i = 0;i < a[h];i++)
			{
				for (j = 0;j < b[h];j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						(juzhen[i][j]) = Integer.parseInt(tempVar4);
					}
				}
			}
			for (i = 0;i < a[h];i++)
			{
				sum[h] = sum[h] + juzhen[i][0] + juzhen[i][b[h] - 1];
			}
			for (j = 1;j < b[h] - 1;j++)
			{
				sum[h] = sum[h] + juzhen[0][j] + juzhen[a[h] - 1][j];
			}
		}
		for (h = 0;h < k;h++)
		{
			System.out.printf("%d\n",sum[h]);
		}
		return 0;
	}

}

