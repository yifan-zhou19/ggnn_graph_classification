package <missing>;

public class GlobalMembers
{
	// *****************************************************************************
	//*????????????.cpp
	//*??;1300012725
	//*?????2013.11
	//*?????????????
	//******************************************************************************




	public static int Main()
	{
		int[][] a = new int[200][200];
		int r; //i,j?????????????????????p??????
		int c;
		int i;
		int j;
		int p;

		r = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= r; i++)
		{
			for (j = 1; j <= c; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		i = 1;
		j = 1;
		while (i <= r != 0 && j <= c)
		{
			for (p = j; p <= c; p++)
			{
				System.out.print(a[i][p]);
				System.out.print("\n");
			}
			for (p = i + 1; p <= r;p++)
			{
				System.out.print(a[p][c]);
				System.out.print("\n");
			}
			for (p = c - 1; p >= j != 0 && i != r && j != c; p--)
			{
				System.out.print(a[r][p]);
				System.out.print("\n");
			}
			for (p = r - 1; p > i && i != r && j != c; p--)
			{
				System.out.print(a[p][j]);
				System.out.print("\n");
			}
			i++;
			j++;
			r--;
			c--; //???????
		}

		return 0;
	}

}

