package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[][] a = new int[8][8];
		int i;
		int j;
		int[][] ln = new int[8][2];
		int[][] col = new int[8][2];
		int max;
		int min;
		int k;
		int p = 0;
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
			max = a[i][0];
			k = 0;
			for (j = 0;j < n;j++)
			{
				if (max < a[i][j])
				{
				max = a[i][j];
				k = j;
				}
			}
			ln[i][0] = max;
			ln[i][1] = k;
		}
		for (j = 0;j < n;j++)
		{
			min = a[0][j];
			k = 0;
			for (i = 0;i < m;i++)
			{
				if (min > a[i][j])
				{
				min = a[i][j];
				k = i;
				}
			}
			col[j][0] = min;
			col[j][1] = k;
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (ln[i][0] == col[j][0])
				{
				System.out.printf("%d+%d\n",col[j][1],ln[i][1]);
				p = 1;
				}
			}
		}
		if (p == 0)
		{
			System.out.print("No\n");
		}
	}

}

