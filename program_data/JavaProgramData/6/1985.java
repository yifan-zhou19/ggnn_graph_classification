package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int count;
		int m;
		int n;
		int[][] array = new int[100][100];
		int[] sum = new int[100];
		int i;
		int j;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			count = Integer.parseInt(tempVar);
		}
		for (i = 0;i < count;i++)
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
			for (j = 0;j < m;j++)
			{
				for (p = 0;p < n;p++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						array[j][p] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (j = 0;j < n;j++)
			{
				sum[i] = sum[i] + array[0][j];
				if (m > 1)
				{
				sum[i] = sum[i] + array[m - 1][j];
				}
			}
			for (j = 1;j < m - 1;j++)
			{
				sum[i] = sum[i] + array[j][0];
				sum[i] = sum[i] + array[j][n - 1];
			}
		}
		for (i = 0;i < count;i++)
		{
		System.out.printf("%d\n",sum[i]);
		}
		return 0;
	}


}

