package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[105][105];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,-1,(Integer.SIZE / Byte.SIZE)); //???????
		int x = 0;
		int y = 0;
		int st = 1;
		for (int i = 0;i < row;i++) //??
		{
			for (int j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		while (true)
		{
			if (st == 1)
			{ //?
				System.out.print(a[x][y]);
				System.out.print("\n");
				a[x][y] = -1;
				y++;
				if (a[x][y] == -1)
				{ //??
					st = 2;
					y--;
					x++;
					if (a[x][y] == -1) //??
					{
						break;
					}
				}
			}
			else if (st == 2)
			{ //?
				System.out.print(a[x][y]);
				System.out.print("\n");
				a[x][y] = -1;
				x++;
				if (a[x][y] == -1)
				{
					st = 3;
					x--;
					y--;
					if (a[x][y] == -1)
					{
						break;
					}
				}
			}
			else if (st == 3)
			{ //?
				System.out.print(a[x][y]);
				System.out.print("\n");
				a[x][y] = -1;
				y--;
				if (y < 0)
				{ //??
					y = 0;
					st = 4;
					x--;
				}
				if (a[x][y] == -1)
				{
					st = 4;
					y++;
					x--;
					if (a[x][y] == -1)
					{
						break;
					}
				}
			}
			else if (st == 4)
			{ //?
				System.out.print(a[x][y]);
				System.out.print("\n");
				a[x][y] = -1;
				x--;
				if (a[x][y] == -1)
				{
					st = 1;
					x++;
					y++;
					if (a[x][y] == -1)
					{
						break;
					}
				}
			}
		}

		return 0;
	}
}

