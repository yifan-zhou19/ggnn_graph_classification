package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int X;
		int Y;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y1 = Integer.parseInt(tempVar2);
		}
		int[][] a = new int[100][100];
		for (X = 0;X < x1;X++)
		{
			for (Y = 0;Y < y1;Y++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[X][Y] = Integer.parseInt(tempVar3);
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
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			y2 = Integer.parseInt(tempVar5);
		}
		int[][] b = new int[100][100];
		for (X = 0;X < x2;X++)
		{
			for (Y = 0;Y < y2;Y++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[X][Y] = Integer.parseInt(tempVar6);
				}
			}
		}
		int[][] c = new int[100][100];
			for (X = 0;X < 100;X++)
			{
			for (Y = 0;Y < 100;Y++)
			{
				c[X][Y] = 0;
			}
			}
		for (X = 0;X < x1;X++)
		{
			for (Y = 0;Y < y2;Y++)
			{
				for (i = 0;i < x2;i++)
				{
				c[X][Y] += (a[X][i] * b[i][Y]);
				}
			}
		}
		for (X = 0;X < x1;X++)
		{
			for (Y = 0;Y < y2;Y++)
			{
				if ((Y + 1) % y2 != 0)
				{
					System.out.printf("%d ",c[X][Y]);
				}
				else
				{
					System.out.printf("%d\n",c[X][Y]);
				}
			}
		}
		return 0;
	}
}

