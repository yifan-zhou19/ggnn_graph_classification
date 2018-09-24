package <missing>;

public class GlobalMembers
{
	//*************************
	//*???????? **
	//*?????? **
	//*???2012-11-10 **
	//*???1200012957 **
	//*************************

	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		// ???????????????????????????????????~~~
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= x1 - 1; i++)
		{
			for (j = 0; j <= y1 - 1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= x2 - 1; i++)
		{
			for (j = 0; j <= y2 - 1; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		// ???????!!!
		int p;
		int q;
		int[][] c =
		{
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		for (i = 0; i <= x1 - 1; i++)
		{
			for (p = 0, q = 0;p <= y1 - 1; p++, q++)
			{
				c[i][0] = c[i][0] + a[i][p] * b[q][0];
			}
			System.out.print(c[i][0]);
			// ???????????????????????????
			for (j = 1; j <= y2 - 1; j++)
			{
				for (p = 0, q = 0;p <= y1 - 1; p++, q++)
				{
					c[i][j] = c[i][j] + a[i][p] * b[q][j];
					// ???????????
				}
				System.out.print(" ");
				System.out.print(c[i][j]);
			}
			System.out.print("\n");
			// ????!
		}

		return 0;
	}
}

