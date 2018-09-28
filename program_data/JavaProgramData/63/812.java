package <missing>;

public class GlobalMembers
{
	public static int[][] m = new int[100][100];
	public static int[][] n = new int[100][100];
	public static int[][] c = new int[100][100];
	public static int Main()
	{
		int x1;
		int x2;
		int y1;
		int y2;
		int i;
		int j;
		int k;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y1;j++)
			{
				m[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < x2;i++)
		{
			for (j = 0;j < y2;j++)
			{
				n[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y2;j++)
			{
				for (k = 0;k < x2;k++)
				{
				c[i][j] += m[i][k] * n[k][j];
				}
			}
			for (j = 0;j < y2 - 1;j++)
			{
				System.out.print(c[i][j]);
				System.out.print(' ');
			}
			System.out.print(c[i][y2 - 1]);
			System.out.print("\n");
		}
		return 0;
	}






}

