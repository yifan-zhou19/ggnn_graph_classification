package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int r;
		int c;
		int[][] a = new int[100][100];
		int s;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		s = 0;
		for (r = 0;r < row;r++)
		{
			for (c = 0;c < col;c++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[r][c] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (n = 0;n < 100;n++)
		{
			for (c = n;c < col - n;c++)
			{
				System.out.printf("%d\n",a[n][c]);
				s++;
			}
			System.out.print("\n");
			if (s == row * col)
			{
				break;
			}
			for (r = n + 1;r < row - n;r++)
			{
				System.out.printf("%d\n",a[r][col - 1 - n]);
				s++;
			}
			System.out.print("\n");
			if (s == row * col)
			{
			break;
			}
			for (c = col - 2 - n;c >= n;c--)
			{
				System.out.printf("%d\n",a[row - 1 - n][c]);
				s++;
			}
			System.out.print("\n");
			if (s == row * col)
			{
			break;
			}
			for (r = row - 2 - n;r > n;r--)
			{
				System.out.printf("%d\n",a[r][n]);
				s++;
			}
			System.out.print("\n");
			if (s == row * col)
			{
				break;
			}
		}
		return 0;
	}
}

