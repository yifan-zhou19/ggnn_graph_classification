package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row; //?????????????????????????????????????????????????????????
		int col;
		int[][][] array = new int[100][100][2];
		int i;
		int j;
		int time = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				array[i][j][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i <= row / 2;i++) //??????????
		{
			if (time == row * col)
			{
				break;
			}
			for (j = 0;j < col;j++) //??????????????????????????????
			{
				if (array[i][j][1] == 0)
				{
					System.out.print(array[i][j][0]);
					System.out.print("\n");
					array[i][j][1] = 1;
					time++;
				}
			}
			for (j = 0;j < row;j++) //????????????????col-1-i(??????)
			{
				if (array[j][col - 1 - i][1] == 0)
				{
					System.out.print(array[j][col - 1 - i][0]);
					System.out.print("\n");
					array[j][col - 1 - i][1] = 1;
					time++;
				}
			}
			for (j = col - 1;j >= 0;j--) //????????????????row-1-i
			{
				if (array[row - 1 - i][j][1] == 0)
				{
					System.out.print(array[row - 1 - i][j][0]);
					System.out.print("\n");
					array[row - 1 - i][j][1] = 1;
					time++;
				}
			}
			for (j = row - 1;j >= 0;j--) //???????????
			{
				if (array[j][i][1] == 0)
				{
					System.out.print(array[j][i][0]);
					System.out.print("\n");
					array[j][i][1] = 1;
					time++;
				}
			}
		}
		return 0;
	}
}

