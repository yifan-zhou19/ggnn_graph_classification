package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int[][] a = new int[23][23];
		int i;
		int j;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i < x + 1 ; i++)
		{
			for (j = 1 ; j < y + 1 ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1 ; i < x + 1 ; i++)
		{
			for (j = 1 ; j < y + 1 ; j++)
			{
				if (a[i + 1][j] <= a[i][j] != 0 && a[i - 1][j] <= a[i][j] != 0 && a[i][j + 1] <= a[i][j] != 0 && a[i][j - 1] <= a[i][j])
				{
					System.out.print(i - 1);
					System.out.print(' ');
					System.out.print(j - 1);
					System.out.print("\n");
				}
			}
		}

		return 0;
	}


}

