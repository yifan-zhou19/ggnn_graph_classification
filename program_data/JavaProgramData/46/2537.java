package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] number = new int[100][100]; //????
		int row = 0;
		int col = 0;
		int aleft = 0;
		int aright = 0;
		int bup = 0;
		int bdown = 0;
		int count = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < row;i++) //????
		{
			for (int j = 0;j < col;j++)
			{
				number[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		aright = col - 1;
		bdown = row - 1;
		while (true) //??????????????
		{
			if (count == row * col)
			{
				break;
			}
			for (int i = aleft;i <= aright;i++)
			{
				System.out.print(number[bup][i]);
				System.out.print("\n");
				count++;
			}
			bup++;
			if (count == row * col)
			{
				break;
			}
			for (int i = bup;i <= bdown;i++)
			{
				System.out.print(number[i][aright]);
				System.out.print("\n");
				count++;
			}
			aright--;
			if (count == row * col)
			{
				break;
			}
			for (int i = aright;i >= aleft;i--)
			{
				System.out.print(number[bdown][i]);
				System.out.print("\n");
				count++;
			}
			bdown--;
			if (count == row * col)
			{
				break;
			}
			for (int i = bdown;i >= bup;i--)
			{
				System.out.print(number[i][aleft]);
				System.out.print("\n");
				count++;
			}
			aleft++;
		}
		return 0;
	}
}

