package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????? 1300012733 **
	//*???2013.11.9  **
	//********************************
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int[][] a = new int[109][109];
		int[][] b = new int[109][109];
		int[][] c = new int[109][109];
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= x1; i++)
		{
			for (int j = 1; j <= y1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= x2; i++)
		{
			for (int j = 1; j <= y2; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 1; i <= x1; i++)
		{
			for (int j = 1; j <= y2; j++)
			{
				for (int v = 1; v <= y1 ; v++)
				{
					c[i][j] = c[i][j] + a[i][v] * b[v][j];
				}
			}
		}
		for (int i = 1; i <= x1; i++)
		{
			System.out.print(c[i][1]);
			for (int j = 2; j <= y2; j++)
			{
			System.out.print(' ');
			System.out.print(c[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

