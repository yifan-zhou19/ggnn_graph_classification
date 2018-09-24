package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????   **
	//*????? 1300012707 **
	//*???2013.11.06  **
	//********************************
	public static int Main()
	{
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int c;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= x1; i = i + 1)
		{
			for (j = 1; j <= y1; j = j + 1)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= x2; i = i + 1)
		{
			for (j = 1; j <= y2; j = j + 1)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1; i <= x1; i = i + 1)
		{
			for (j = 1; j < y2; j = j + 1)
			{
				c = 0;
				for (int k = 1; k <= y1; k = k + 1)
				{
					c = c + a[i][k] * b[k][j];
				}
				System.out.print(c);
				System.out.print(" ");
			}
			c = 0;
			for (int k = 1; k <= y1; k = k + 1)
			{
				c = c + a[i][k] * b[k][y2];
			}
			System.out.print(c);
			System.out.print("\n");
		}
		return 0;
	}
}

