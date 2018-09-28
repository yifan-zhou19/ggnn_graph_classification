package <missing>;

public class GlobalMembers
{
	//*****************************
	//*??: ???? **
	//*??:??? 1300012991 **
	//*??:2013.11.11 **
	//*****************************

	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int k;
		int m;
		int[][] a = new int[101][101]; //??????????????
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= x1; i++) //??????????
		{
			for (j = 1; j <= y1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= x2; i++) //??????????
		{
			for (j = 1; j <= y2; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 1; i <= x1; i++) //??:??c????(i,j)??a??i??b??j?????????
		{
			for (j = 1; j <= y2; j++)
			{
				for (k = 1, m = 1; k <= y1 != 0 && m <= x2; k++, m++)
				{
					c[i][j] = c[i][j] + a[i][k] * b[m][j];
				}
				if (j < y2)
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

