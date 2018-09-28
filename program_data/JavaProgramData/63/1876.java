package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1 = 0;
		int y1 = 0;
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
		if (x1 == 0)
		{
		   ;
		}
		else
		{
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
		for (int i = 0;i < x1;i++)
		{
			for (int j = 0;j < y1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int x2 = 0;
		int y2 = 0;
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			y2 = Integer.parseInt(tempVar5);
		}
			  for (int i = 0;i < x2;i++)
			  {
				for (int j = 0;j < y2;j++)
				{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[i][j] = Integer.parseInt(tempVar6);
				}
				}
			  }
		for (int i = 0;i < x1;i++)
		{
			for (int j = 0;j < y2;j++)
			{
				for (int k = 0;k < x2;k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		for (int i = 0;i < x1;i++)
		{
			System.out.printf("%d",c[i][0]);
			for (int j = 1;j < y2;j++)
			{
				System.out.printf(" %d",c[i][j]);
			}
			System.out.print("\n");
		}
		}
	}
}

