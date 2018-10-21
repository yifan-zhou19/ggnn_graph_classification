package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int flag = 0;
		int time = 0;
		int i;
		int j;
		int k = 0;
		int row;
		int col;
		int[][] a = new int[100][100];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (k = 0; k <= row * col;)
		{
			for (j = time; j < col - time ;j++)
			{
				System.out.print(a[time][j]);
				System.out.print("\n");
				k++;
				if (k == row * col)
				{
					flag = 1;
					break;
				}
			}
			if (flag != 0)
			{
			break;
			}
			for (i = 1 + time; i < row - time; i++)
			{
				System.out.print(a[i][col - 1 - time]);
				System.out.print("\n");
				k++;
				if (k == row * col)
				{
					flag = 1;
					break;
				}
			}
			if (flag != 0)
			{
			break;
			}
			for (j = col - 2 - time ; j > time; j--)
			{
				System.out.print(a[row - 1 - time][j]);
				System.out.print("\n");
				k++;
				if (k == row * col)
				{
					flag = 1;
					break;
				}
			}
			if (flag != 0)
			{
			break;
			}
			for (i = row - 1 - time; i > time;i--)
			{
				System.out.print(a[i][time]);
				System.out.print("\n");
				k++;
				if (k == row * col)
				{
					flag = 1;
					break;
				}
			}
			if (flag != 0)
			{
			break;
			}
			time++;
		}
		return 0;
	}
}

