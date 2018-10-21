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
		int[][] a = new int[row + 2][col + 2];
		for (i = 0;i < row + 2;i++)
		{
			for (j = 0;j < col + 2;j++)
			{
				a[i][j] = 0;
			}
		}
		//memset(a,0,sizeof(a));
		for (i = 1;i <= row;i++)
		{
			for (j = 1;j <= col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		i = 1;
		j = 1;
		while (true)
		{
			if (a[i][j + 1] != 0 && a[i][j - 1] == 0 && a[i - 1][j] == 0)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");

				a[i][j] = 0;
				j++;
				continue;
			}
			if (a[i + 1][j] != 0 && a[i - 1][j] == 0 && a[i][j + 1] == 0)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");

				a[i][j] = 0;
				i++;
				continue;
			}
			if (a[i][j - 1] != 0 && a[i][j + 1] == 0 && a[i + 1][j] == 0)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");

				a[i][j] = 0;
				j--;
				continue;
			}
			if (a[i - 1][j] != 0 && a[i + 1][j] == 0 && a[i][j - 1] == 0)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");

				a[i][j] = 0;
				i--;
				continue;
			}
			else
			{
		System.out.print(a[i][j]);
		System.out.print("\n");
			break;
			}
		}
		return 0;
	}

}

