package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		int p = -1;
		int q = -1;
		int b;
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
		int[][] a = new int[20][20];
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
				b = 1;
				for (k = 0;k < n;k++)
				{
					if (a[i][j] < a[i][k])
					{
						b = 0;
					}
				}
				for (k = 0;k < m;k++)
				{
					if (a[i][j] > a[k][j])
					{
						b = 0;
					}
				}
				if (b != 0)
				{
					p = i;
					q = j;
				}
			}
		}
		if (p < 0 && q < 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d+%d", p, q);
		}
	}
}

