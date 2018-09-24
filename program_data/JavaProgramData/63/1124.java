package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int i;
		int j;
		int m;
		int n;
		int p;
		int q;
		int r = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			q = Integer.parseInt(tempVar5);
		}
		for (i = 0;i < p;i++)
		{
			for (j = 0;j < q;j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[i][j] = Integer.parseInt(tempVar6);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < q;j++)
			{
				r = 0;
				while (r < n)
				{
					c[i][j] += a[i][r] * b[r][j];
					r++;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < q;j++)
			{
				if (j == 0)
				{
					System.out.printf("%d",c[i][j]);
				}
				else
				{
					System.out.printf(" %d",c[i][j]);
				}
			}
			System.out.print("\n");
		}
	}


}

