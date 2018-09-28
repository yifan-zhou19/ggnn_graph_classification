package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int k;
		int p;
		int[][] a = new int[101][101];
		int l;
		int h;
		int n;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		l = col,h = row,p = 0,n = 0;
		while (true)
		{
			for (j = p;j < l - p;j++)
			{
					System.out.print(a[p][j]);
					System.out.print("\n");
					n++;
			}
			if (n == row * col)
			{
				break;
			}
			for (i = p + 1;i < h - p;i++)
			{
				System.out.print(a[i][l - p - 1]);
				System.out.print("\n");
				n++;
			}
			if (n == row * col)
			{
				break;
			}
			for (j = l - 2 - p;j >= p;j--)
			{
				System.out.print(a[h - p - 1][j]);
				System.out.print("\n");
				n++;
			}
			if (n == row * col)
			{
				break;
			}
			for (i = h - 2 - p;i > p;i--)
			{
				System.out.print(a[i][p]);
				System.out.print("\n");
				n++;
			}
			if (n == row * col)
			{
				break;
			}
			p++;
		}
		return 0;
	}

}

