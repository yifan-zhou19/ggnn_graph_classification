package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int k;
		int i;
		int j;
		int[][] num = new int[10][10];
		int[] line = new int[10];
		int[] column = new int[10];
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
		for (i = 0;i < m;++i)
		{
			for (j = 0;j < n;++j)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;++i)
		{
			k = num[i][0];
			line[i] = 0;
			for (j = 0;j < n;++j)
			{
				if (num[i][j] > k)
				{
					k = num[i][j];
					line[i] = j;
				}
			}
		}
		for (i = 0;i < n;++i)
		{
			k = num[0][i];
			column[i] = 0;
			for (j = 0;j < m;++j)
			{
				if (num[j][i] < k)
				{
					k = num[j][i];
					column[i] = j;
				}
			}
		}
		k = 0;
		for (i = 0;i < m;++i)
		{
			j = line[i];
			if (column[j] == i)
			{
				System.out.printf("%d+%d",i,j);
				k = 1;
			}
		}
		if (k == 0)
		{
			System.out.print("No");
		}

	}

}

