package <missing>;

public class GlobalMembers
{
	public static int Main()
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
		int[][] a = new int[x1][y1];
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
		int[][] b = new int[x2][y2];
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
		int[][] c = new int[x1][y2];
		int m;
		m = 0;
		for (int i = 0;i < x1;i++)
		{
			for (int j = 0;j < y2;j++)
			{
				for (int q = 0;q < y1;q++)
				{
				   m = m + (a[i][q]) * (b[q][j]);
				}
				   c[i][j] = m;
				   m = 0;
			}
		}
		int n;
		n = 0;
		for (int i = 0;i < x1;i++)
		{
			for (int j = 0;j < y2;j++)
			{
			n++;
			if (n % y2 == 0)
			{
			System.out.printf("%d\n",c[i][j]);
			}
			else
			{
			System.out.printf("%d ",c[i][j]);
			}
			}
		}
	}

}

