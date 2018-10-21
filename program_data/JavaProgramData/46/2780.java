package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[101][101];
		int[][] pos = new int[101][101];
		int row;
		int col;
		int i;
		int j;
		int count = 0;
		int n;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = row * col;
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				pos[i][j] = 1;
			}
		}
		i = 0;
		j = 0;
		while (true)
		{
			while (pos[i][j + 1] != 0)
			{
				System.out.print(array[i][j]);
				System.out.print("\n");
				pos[i][j] = 0;
				j++;
				count++;
			}
			if (count == n - 1)
			{
				break;
			}
			while (pos[i + 1][j] != 0)
			{
				System.out.print(array[i][j]);
				System.out.print("\n");
				pos[i][j] = 0;
				i++;
				count++;
			}
			if (count == n - 1)
			{
				break;
			}
			while (j >= 0 && pos[i][j - 1] != 0)
			{
				System.out.print(array[i][j]);
				System.out.print("\n");
				pos[i][j] = 0;
				j--;
				count++;
			}
			if (count == n - 1)
			{
				break;
			}
			while (i >= 0 && pos[i - 1][j] != 0)
			{
				System.out.print(array[i][j]);
				System.out.print("\n");
				pos[i][j] = 0;
				i--;
				count++;
			}
			if (count == n - 1)
			{
				break;
			}
		}
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				if (pos[i][j] == 1)
				{
					System.out.print(array[i][j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

