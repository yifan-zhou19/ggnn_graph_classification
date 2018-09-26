package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[111][111];
		int[][] b = new int[111][111];
		int[][] c = new int[111][111];
		int i;
		int j;
		int m;
		int n;
		int ax;
		int ay;
		int bx;
		int by;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ax = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			ay = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= ax;i++)
		{
			for (j = 1;j <= ay;j++)
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
			bx = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			by = Integer.parseInt(tempVar5);
		}
		for (i = 1;i <= bx;i++)
		{
			for (j = 1;j <= by;j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[i][j] = Integer.parseInt(tempVar6);
				}
			}
		}
			for (m = 1;m <= ax;m++)
			{
				for (n = 1;n <= by;n++)
				{
				 for (i = 1;i <= ay;i++)
				 {
				c[m][n] += a[m][i] * b[i][n];
				 }
				}
			}
		for (m = 1;m <= ax;m++)
		{
			System.out.printf("%d",c[m][1]);
			for (n = 2;n <= by;n++)
			{
			System.out.printf(" %d",c[m][n]);
			}
					  System.out.print("\n");
		}
		return 0;
	}



}

