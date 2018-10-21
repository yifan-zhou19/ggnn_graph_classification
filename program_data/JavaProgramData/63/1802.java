package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[110][110];
		int[][] b = new int[110][110];
		int[][] c = new int[110][110];
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int n = 0;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y1 = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= x1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
			for (j = 2;j <= y1;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					a[i][j] = Integer.parseInt(tempVar4);
				}
			}
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			x2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			y2 = Integer.parseInt(tempVar6);
		}
		for (i = 1;i <= x2;i++)
		{
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				b[i][1] = Integer.parseInt(tempVar7);
			}
			for (j = 2;j <= y2;j++)
			{
				String tempVar8 = ConsoleInput.scanfRead(" ");
				if (tempVar8 != null)
				{
					b[i][j] = Integer.parseInt(tempVar8);
				}
			}
		}
		for (i = 1;i <= x1;i++)
		{
			for (j = 1;j <= y2;j++)
			{
				n = 0;
				for (m = 1;m <= y1;m++)
				{
					n = n + a[i][m] * b[m][j];
				}
				c[i][j] = n;
			}
		}
		for (i = 1;i <= x1;i++)
		{
			System.out.printf("%d",c[i][1]);
			for (j = 2;j <= y2;j++)
			{
				System.out.printf(" %d",c[i][j]);
			}
			System.out.print("\n");
		}
	}
}

