package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int[][] a = new int[102][102];
		int[][] b = new int[102][102];
		int[][] c = new int[102][102];
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1 ;i <= x1 ;i++)
		{
			for (int j = 1 ; j <= y1 ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			System.out.print("\n");
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int p = 1 ;p <= x2 ;p++)
		{
			for (int d = 1 ; d <= y2 ; d++)
			{
				b[p][d] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			System.out.print("\n");
		}
		for (int e = 1 ;e <= x1 ;e++)
		{
			for (int f = 1 ; f <= y2 ; f++)
			{
			for (int k = 1 ; k <= y1 ; k++)
			{
				c[e][f] += a[e][k] * b[k][f];
			}
			}
		}
		for (int g = 1 ;g <= x1 ;g++)
		{
			for (int h = 1 ; h <= y2; h++)
			{
				if (h != y2)
				{
				System.out.print(c[g][h]);
				System.out.print(" ");
				}
				else if (h == y2)
				{
					System.out.print(c[g][h]);
				}
			}
			System.out.print("\n");
		}

		return 0;
	}

}

