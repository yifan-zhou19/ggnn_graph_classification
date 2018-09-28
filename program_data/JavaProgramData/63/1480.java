package <missing>;

public class GlobalMembers
{
	//********************************
	//*???1   **
	//*?????? 1200012867 **
	//*???2012.  **
	//********************************

	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int k;
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
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
				c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		for (i = 1; i <= x1; i++)
		{
			System.out.print(c[i][1]);
			for (j = 2; j <= y2; j++)
			{
				System.out.print(' ');
				System.out.print(c[i][j]);
			}
			System.out.print("\n");
		}
		System.in.read();
		System.in.read();
		return 0;
	}
}

