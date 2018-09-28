package <missing>;

public class GlobalMembers
{
	/*
	???????
	?????? 1200012921
	???2012.11.8
	*/

	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
		int i;
		int j;
		int t;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= x1; i++) //??a??
		{
			for (j = 1; j <= y1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= x2; i++) //??b??
		{
			for (j = 1; j <= y2; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1; i <= x1; i++) //???????
		{
			for (j = 1; j <= y2; j++)
			{
				for (t = 1; t <= y1; t++)
				{
					c[i][j] = c[i][j] + a[i][t] * b[t][j];
				}
			}
		}
		for (i = 1; i <= x1; i++) //????
		{
			for (j = 1; j <= y2; j++)
			{
				if (j != y2) //????????????????
				{
					System.out.print(c[i][j]);
					System.out.print(" ");
				}
				else
				{
					System.out.print(c[i][j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

