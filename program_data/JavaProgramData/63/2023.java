package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int q;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			q = Integer.parseInt(tempVar2);
		}

		for (int i = 0;i < x;i++)
		{
			for (int j = 0;j < q;j++)
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
			q = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			y = Integer.parseInt(tempVar5);
		}

		for (int i = 0;i < q;i++)
		{
			for (int j = 0;j < y;j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[i][j] = Integer.parseInt(tempVar6);
				}
			}
		}
		for (int i = 0;i < x;i++)
		{
			for (int j = 0;j < y;j++)
			{
				c[i][j] = 0;
				for (int s = 0;s < q;s++)
				{
					c[i][j] = c[i][j] + a[i][s] * b[s][j];
				}
			}
		}
		for (int i = 0;i < x;i++)
		{
			for (int j = 0;j < y;j++)
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

