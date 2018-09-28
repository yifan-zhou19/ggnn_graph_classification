package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
	int i;
	int j;
	row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[][] a = new int[101][101];
	for (i = 0;i < row;i++)
	{
	 for (j = 0;j < col;j++)
	 {
	  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 }
	}
	int x;
	for (x = 0;x <= row != 0 && x <= col;x++)
	{
		i = x;
		if (x <= col - 1 - x)
		{
		for (j = x;j <= col - 1 - x;j++)
		{
			System.out.print(a[i][j]);
			System.out.print("\n");
		}
		}
		else
		{
			break;
		}
		j = j - 1;
		if (x + 1 <= row - 1 - x)
		{
			for (i = x + 1;i <= row - 1 - x;i++)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
			}
		}
		else
		{
			break;
		}
		i = row - 1 - x;
		if (x <= col - 2 - x)
		{
		for (j = col - 2 - x;j >= x;j--)
		{
			System.out.print(a[i][j]);
			System.out.print("\n");
		}
		}
		else
		{
			break;
		}
		j = x;
		if (x + 1 <= row - 2 - x)
		{
			for (i = row - 2 - x;i >= x + 1;i--)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
			}
		}
		else
		{
			break;
		}
	}
	return 0;
	}


}

