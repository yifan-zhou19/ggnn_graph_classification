package <missing>;

public class GlobalMembers
{
	//*******************************************
	//** ???Dec 3, 2013 - ????????  **
	//** ?????? 1300012719               **
	//** ???2013.12.06                      **
	//*******************************************
	public static int bacnum(int x, int y, int day, int[][] bacteria) //??????????????????,?????????=??????????*2+???????????
	{
		int temp = 0;
		if (day == 0) //???0????????????,?????????
		{
			return bacteria[x][y];
		}
		temp = temp + 2 * bacnum(x, y, day - 1, bacteria); //???????????????????+????(?????????)???????
		if (x > 0 && y > 0)
		{
			temp = temp + bacnum(x - 1, y - 1, day - 1, bacteria);
		}
		if (x > 0 && y < 8)
		{
			temp = temp + bacnum(x - 1, y + 1, day - 1, bacteria);
		}
		if (x < 8 && y > 0)
		{
			temp = temp + bacnum(x + 1, y - 1, day - 1, bacteria);
		}
		if (x < 8 && y < 8)
		{
			temp = temp + bacnum(x + 1, y + 1, day - 1, bacteria);
		}
		if (x > 0)
		{
			temp = temp + bacnum(x - 1, y, day - 1, bacteria);
		}
		if (x < 8)
		{
			temp = temp + bacnum(x + 1, y, day - 1, bacteria);
		}
		if (y > 0)
		{
			temp = temp + bacnum(x, y - 1, day - 1, bacteria);
		}
		if (y < 8)
		{
			temp = temp + bacnum(x, y + 1, day - 1, bacteria);
		}
		return temp; //???????????
	}
	public static int Main()
	{
		int[][] bacteria = new int[9][9]; //bacteria????????????,day?????
		int day;
		int i;
		int j;
		for (i = 0; i < 9; i++)
		{
		for (j = 0; j < 9; j++)
		{
			bacteria[i][j] = 0;
		}
		}
		bacteria[4][4] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				System.out.print(bacnum(i, j, day, bacteria));
				if (j < 8)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("\n");
				}
			}
		}
		return 0;
	}


}

