package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int max;
		int min;
		int c;
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
		int[][] a = new int[m][n];
		int[][] b = new int[m][n];
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
				b[i][j] = 0;
			}
		}
		for (i = 0;i < m;i++)
		{
			max = a[i][0];
			for (j = 0;j < n;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
				}
			}
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == max)
				{
					b[i][j]++;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			min = a[0][i];
			for (j = 0;j < m;j++)
			{
				if (a[j][i] < min)
				{
					min = a[j][i];
				}
			}
			for (j = 0;j < m;j++)
			{
				if (a[j][i] == min)
				{
					b[j][i]++;
				}
			}
		}
		c = 0;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (b[i][j] == 2)
				{
					System.out.printf("%d+%d\n",i,j);
					c++;
				}
			}
		}
		if (c == 0)
		{
		System.out.print("No");
		}
		return 0;
	}

}

