package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int xa;
		int ya;
		int xb;
		int yb;
		xa = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ya = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[xa][ya];
		for (int i = 0;i < xa;i++)
		{
			for (int j = 0;j < ya;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		xb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		yb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] b = new int[xb][yb];
		for (int i = 0;i < xb;i++)
		{
			for (int j = 0;j < yb;j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		int[][] c = new int[xa][yb];
		for (int i = 0;i < xa;i++)
		{
			for (int j = 0;j < yb;j++)
			{
				c[i][j] = 0;
				for (int k = 0;k < xb;k++)
				{
					c[i][j] = a[i][k] * b[k][j] + c[i][j];
				}
			}
		}

		for (int i = 0;i < xa;i++)
		{
			System.out.print(c[i][0]);
			for (int j = 1;j < yb;j++)
			{
				System.out.print(" ");
				System.out.print(c[i][j]);
			}
			System.out.print("\n");
		}
	}
}

