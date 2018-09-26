package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[8][8];
		int m;
		int n;
		int i;
		int j;
		int k;
		int[] b = new int[8];
		int[] x = new int[8];
		int[] y = new int[8];
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
			b[i] = a[i][0];
			x[i] = 1;
			y[i] = i + 1;
			for (j = 1;j < n;j++)
			{
				if (a[i][j] - b[i] > 0)
				{
					b[i] = a[i][j];
					x[i] = j + 1;
				}
			}
		}

		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (b[i] - a[j][x[i] - 1] > 0)
				{
					b[i] = -1;
				}
			}
		}
		k = 0;
		for (i = 0;i < m;i++)
		{
			k += b[i];
		}
		if (k + m == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < m;i++)
			{
				if (b[i] != -1)
				{
					System.out.printf("%d+%d\n",y[i] - 1,x[i] - 1);
				}
			}
		}
		return 0;
	}
}

