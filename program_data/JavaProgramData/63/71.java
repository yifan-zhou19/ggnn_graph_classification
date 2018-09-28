package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int s = 0;
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] result = new int[101][101];
		int i;
		int j;
		int k;
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
				for (k = 1; k <= y1; k++)
				{
					s = a[i][k] * b[k][j] + s;
				}
				result[i][j] = s;
				s = 0;
			}
		}
		for (i = 1; i <= x1; i++)
		{
			for (j = 1; j <= y2; j++)
			{
				if (j != y2)
				{
					System.out.print(result[i][j]);
					System.out.print(" ");
				}
				else
				{
					if (i != x1)
					{
						System.out.print(result[i][j]);
						System.out.print("\n");
					}
					else
					{
						System.out.print(result[i][j]);
					}
				}
			}
		}
		return 0;
	}
}

