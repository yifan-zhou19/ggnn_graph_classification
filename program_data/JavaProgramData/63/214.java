package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
		int i;
		int j;
		int k;
		int x1;
		int y1;
		int x2;
		int y2;
		int sum = 0;
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
				for (k = 1; k <= x2; k++)
				{
					sum = sum + a[i][k] * b[k][j];
				}
				c[i][j] = sum;
				sum = 0;
			}
		}
		for (i = 1; i <= x1; i++)
		{
			for (j = 1 ; j <= y2; j++)
			{
				if (j != y2)
				{
					System.out.print(c[i][j]);
					System.out.print(" ");
				}
				if (j == y2)
				{
					System.out.print(c[i][j]);
					System.out.print("\n");
				}
			}
		}
			return 0;
	}







}

