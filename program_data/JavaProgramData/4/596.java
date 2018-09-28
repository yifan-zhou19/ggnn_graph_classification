package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[1000][1000];
		int[] a = new int[1000];
	int row;
	int col;
	int i;
	int j;

	row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < row;i++)
	{
		for (j = 0;j < col;j++)
		{
			array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}

	for (i = 0;i < col + row;i++)
	{
			if (i < col)
			{
			a[i] = 0;
			}
		else
		{
			a[i] = i - col + 1;
		}
	}

	for (i = 0;i < col + row;i++)
	{
		for (j = a[i];j < row && j <= i;j++)
		{
			System.out.print(array[j][i - j]);
			System.out.print("\n");
		}
	}

	return 0;
	}

}

