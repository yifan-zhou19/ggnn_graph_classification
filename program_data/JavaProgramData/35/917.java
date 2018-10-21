package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int[] max = new int[10];
		int[] sum = new int[10];
		int loop = 0;
		int[][] a = new int[10][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Integer.parseInt(tempVar3);
			}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] > max[i])
				{
				max[i] = a[i][j];
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == max[i])
				{
					for (k = 0;k < m;k++)
					{
						if (a[k][j] >= a[i][j])
						{
						sum[i] = sum[i] + 1;
						}
					}
					if (sum[i] == m)
					{
						loop = 1;
						System.out.printf("%d+%d",i,j);
						break;
					}
				}
			}
			if (loop == 1)
			{
			break;
			}
		}
		if (loop == 0)
		{
		System.out.print("No\n");
		}
		return 0;
	}



}

