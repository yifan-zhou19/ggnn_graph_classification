package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[200][200];
	public static int row;
	public static int col;
	public static int f;

	public static void function(int r,int c)
	{
		int i;
		int j;
		f = 0;
			if (r == 1)
			{
				for (i = 1;i <= c;i++)
				{
					System.out.printf("%d\n", a[1][i]);
				}
				f = 1;
			}
			if (c == 1 && f == 0)
			{
				for (i = 1;i <= r;i++)
				{
					System.out.printf("%d\n", a[i][1]);
				}
			}
			if (r != 1 && c != 1)
			{
			for (i = 1;i <= c;i++)
			{
				System.out.printf("%d\n", a[1][i]);
			}
			for (i = 2;i <= r;i++)
			{
				System.out.printf("%d\n", a[i][c]);
			}
			for (i = c - 1;i >= 1;i--)
			{
				System.out.printf("%d\n", a[r][i]);
			}
			for (i = r - 1;i >= 2;i--)
			{
				System.out.printf("%d\n", a[i][1]);
			}
			}

			for (i = 2;i <= r - 1;i++)
			{
				for (j = 1;j <= c - 2;j++)
				{
					a[i][j] = a[i][j + 1];
				}
			}
			for (i = 1;i <= r - 2;i++)
			{
				for (j = 1;j <= c - 2;j++)
				{
					a[i][j] = a[i + 1][j];
				}
			}
			if (c - 2 >= 1 && r - 2 >= 1)
			{
				function(r - 2, c - 2);
			}

	}

	public static int Main()
	{
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= row;i++)
		{
			for (j = 1;j <= col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		function(row, col);
	}

}

