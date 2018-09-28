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
		int[][] a = new int[8][8];
		int[] max = new int[8];
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
					k = j;
				}
			}
			int p = 0;
			for (j = 0;j < m;j++)
			{
				if (max[i] < a[j][k])
				{
					p++;
				}
			}
			if (p == m - 1)
			{
				System.out.printf("%d+%d", i, k);
				return 0;
			}
		}
		System.out.print("No");
		return 0;
	}
}

