package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int i;
		int j;
		for (i = 1;i < 6;i++)
		{
			for (j = 1;j < 6;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int big = 0;
		int small = 1;
		int line;
		int row;
		for (i = 1;i < 6;i++) //???????
		{
			line = i;
			row = 1;
			big = a[i][1];
			for (j = 2;j < 6;j++)
			{
				if (a[i][j] > big)
				{
					big = a[i][j];
					row = j;
				} //??????????
			}
			for (j = 1;j < 6;j++)
			{
				if (a[j][row] < big)
				{
					break; //????? ????????????,??????
				}
			}
			if (j == 6)
			{
				System.out.print(line);
				System.out.print(" ");
				System.out.print(row);
				System.out.print(" ");
				System.out.print(big);
				System.out.print("\n");
			}
			else
			{
				small++; //??????????
			}
		}
		if (small == 6)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}


}

