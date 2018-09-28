package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int[] b = new int[8];
		int[] c = new int[8];
		int m;
		int n;
		int i;
		int j;
		int k;
		int t = 0;
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
			k = 0;
			for (j = 0;j < n - 1;j++)
			{
				if (a[i][j] < a[i][j + 1])
				{
					k = j + 1;
				}
			}
			b[i] = a[i][k];

		}
		for (j = 0;j < n;j++)
		{
			k = 0;
			for (i = 0;i < m - 1;i++)
			{
				if (a[i][j] > a[i + 1][j])
				{
					k = i + 1;
				}
			}
			c[j] = a[k][j];

		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (b[i] == c[j])
				{
					System.out.printf("%d+%d",i,j);
					t = 1;
				}
			}
		}
	if (t == 0)
	{
		System.out.print("No");
	}
	}
}

