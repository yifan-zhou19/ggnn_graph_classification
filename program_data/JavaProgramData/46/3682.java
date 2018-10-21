package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < row;i++) //????
		{
			for (int j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int flag = 0; //??
		for (int i = 0;;i++)
		{
			for (int j = i;j <= col - i - 1;j++) //??
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
				flag += 1;
			}
			if (flag == row * col)
			{
					break;
			}
			for (int j = i + 1;j <= row - i - 1;j++) //??
			{
				System.out.print(a[j][col - i - 1]);
				System.out.print("\n");
				flag += 1;
			}
			if (flag == row * col)
			{
					break;
			}
			for (int j = col - i - 2;j >= i + 1;j--) //??
			{
				System.out.print(a[row - i - 1][j]);
				System.out.print("\n");
				flag += 1;
			}
			if (flag == row * col)
			{
					break;
			}
			for (int j = row - i - 1;j >= i + 1;j--) //??
			{
				System.out.print(a[j][i]);
				System.out.print("\n");
				flag += 1;
			}
			if (flag == row * col)
			{
					break;
			}
		}
		return 0;
	}

}

