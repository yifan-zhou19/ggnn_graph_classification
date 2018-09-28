package <missing>;

public class GlobalMembers
{
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
					*(a + i) + j = tempVar;
				}
			}
		}
	}

	public static void mult(int[][] a, int[][] b, int m, int n, int q)
	{
		int i;
		int j;
		int k;
		int t;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				t = 0;
				for (k = 0;k < q;k++)
				{
					t += a[i][k] * b[k][j];
				}
				if (j == n - 1)
				{
					System.out.printf("%d\n",t);
				}
				else
				{
					System.out.printf("%d ",t);
				}
			}
		}
	}

	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int x1;
		int y1;
		int x2;
		int y2;
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
		mult(a, b, x1, y2, y1);
	}
}

