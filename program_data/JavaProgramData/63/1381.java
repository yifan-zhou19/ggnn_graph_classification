package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x1;
		int y1;
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
		int[][] a = new int[100][100];
		int i;
		int j;
		int k;
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int x2;
		int y2;
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
		int[][] b = new int[100][100];
		for (i = 0;i < x2;i++)
		{
			for (j = 0;j < y2;j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[i][j] = Integer.parseInt(tempVar6);
				}
			}
		}
		for (i = 0;i < x1;i++)
		{
			int c = 0;
			for (k = 0;k < y1;k++)
			{
				c = c + a[i][k] * b[k][0];
			}
			System.out.printf("%d",c);
			for (j = 1;j < y2;j++)
			{
				c = 0;
				for (k = 0;k < y1;k++)
				{
				c = c + a[i][k] * b[k][j];
				}
				System.out.printf(" %d",c);
			}
			System.out.printf("\n",c);
		}
	}
}

