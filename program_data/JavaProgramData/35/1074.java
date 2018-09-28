package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] sz = new int[8][8];
		char q;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		q = ConsoleInput.readToWhiteSpace(true).charAt(0);
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				sz[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int count = 0;
		for (i = 0;i < row;i++)
		{
			int a = 0;
			for (j = 1;j < col;j++)
			{
				if (sz[i][a] < sz[i][j])
				{
					a = j;
				}
			}
			int m = 0;
			int k = 0;
			for (m = 0;m < row;m++)
			{
				if (sz[i][a] > sz[m][a])
				{
					count++;
					break;
				}
				else
				{
					k++;
				}
			}
			if (k == row)
			{
				System.out.print(i);
				System.out.print('+');
				System.out.print(a);
			}
		}
		if (count == row)
		{
			System.out.print("No");
		}
		return 0;
	}


}

