package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int m;
		int n;
		int q;
		int p;
		int c;
		int[][] a = new int[8][8];
		int[] max = new int[8];
		int[] k = new int[8];
		q = 0;
		p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= m;j++)
			{
				if (a[i][j] > max[i])
				{
					max[i] = a[i][j];
					k[i] = j;
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			q = 0;
			c = k[i];
			for (j = 1;j <= n;j++)
			{
				if (max[i] > a[j][c])
				{
					q = 1;
				}
			}
			if (q == 0)
			{
				System.out.printf("%d+%d",i - 1,c - 1);
				p = 1;
			}
		}

		if (p == 0)
		{
			System.out.print("No");
		}
	}
}

