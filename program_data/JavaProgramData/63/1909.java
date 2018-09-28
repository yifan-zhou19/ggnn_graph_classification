package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int i;
		int j;
		int h;
		int l;
		int[][] c = new int[101][101];
		int x1;
		int y1;
		int x2;
		int y2;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= x1; i++)
		{
			for (j = 1; j <= y1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= x2; i++)
		{
			for (j = 1; j <= y2; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1; i <= x1; i++)
		{
			for (j = 1; j <= y2; j++)
			{
				c[i][j] = 0;
				for (h = 1,l = 1; l <= y1; l++,h++)
				{
					c[i][j] = c[i][j] + a[i][l] * b[h][j];
				}
			}
		}
		for (i = 1; i <= x1; i++)
		{
			for (j = 1; j <= y2; j++)
			{
				System.out.print(c[i][j]);
				if (j < y2)
				{
				  System.out.print(" ");
				}
				else
				{
				  System.out.print("\n");
				}
			}
		}
		int f;
		f = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;



	}

}

