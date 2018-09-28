package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static int[][] b = new int[100][100];

	public static void input(int[][] a, int x, int y)
	{
		int i;
		int j;
		for (i = 0;i < x;i++)
		{
			for (j = 0;j < y;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] + j = Integer.parseInt(tempVar);
				}
			}
		}
	}

	public static int c(int i,int j,int q)
	{
		int x = 0;
		int k;
		for (k = 0;k < q;k++)
		{
			x += a[i][k] * b[k][j];
		}
		return x;
	}

	public static int Main()
	{
		int x1;
		int x2;
		int y1;
		int y2;
		int i;
		int j;
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
		input(a, x1, y1);
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			x2 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		input(b, x2, y2);
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y2 - 1;j++)
			{
				System.out.printf("%d ",c(i, j, y1));
			}
			System.out.printf("%d\n",c(i, j, y1));
		}
	}
}

