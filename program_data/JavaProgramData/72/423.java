package <missing>;

public class GlobalMembers
{
	//*****************************
	//*???2011?1?9?         *
	//*??????               *
	//*?????3                *   
	//*****************************
	public static int Main() //???
	{ //?????
		int m = 0;
		int n = 0;
		int[][] gaocheng = new int[100][100];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < n;j++)
			{
				gaocheng[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int x = 0;
		int y = 0;
		for (x = 0;x < m;x++)
		{
			for (y = 0;y < n;y++)
			{
				if (x == 0)
				{
					if (y == 0)
					{
						if (gaocheng[x][y] >= gaocheng[x + 1][y] != 0 && gaocheng[x][y] >= gaocheng[x][y + 1])
						{
							System.out.print(x);
							System.out.print(" ");
							System.out.print(y);
							System.out.print("\n");
						}
						else
						{
							continue;
						}
					}
					else if (y == n - 1)
					{
						if (gaocheng[x][y] >= gaocheng[x + 1][y] != 0 && gaocheng[x][y] >= gaocheng[x][y - 1])
						{
							System.out.print(x);
							System.out.print(" ");
							System.out.print(y);
							System.out.print("\n");
						}
						else
						{
							continue;
						}
					}
					else
					{
						if (gaocheng[x][y] >= gaocheng[x + 1][y] != 0 && gaocheng[x][y] >= gaocheng[x][y + 1] != 0 && gaocheng[x][y] >= gaocheng[x][y - 1])
						{
							System.out.print(x);
							System.out.print(" ");
							System.out.print(y);
							System.out.print("\n");
						}
						else
						{
							continue;
						}
					}
				}
				else if (x == m - 1)
				{
					if (y == 0)
					{
						if (gaocheng[x][y] >= gaocheng[x - 1][y] != 0 && gaocheng[x][y] >= gaocheng[x][y + 1])
						{
							System.out.print(x);
							System.out.print(" ");
							System.out.print(y);
							System.out.print("\n");
						}
						else
						{
							continue;
						}
					}
					else if (y == n - 1)
					{
						if (gaocheng[x][y] >= gaocheng[x - 1][y] != 0 && gaocheng[x][y] >= gaocheng[x][y - 1])
						{
							System.out.print(x);
							System.out.print(" ");
							System.out.print(y);
							System.out.print("\n");
						}
						else
						{
							continue;
						}
					}
					else
					{
						if (gaocheng[x][y] >= gaocheng[x - 1][y] != 0 && gaocheng[x][y] >= gaocheng[x][y + 1] != 0 && gaocheng[x][y] >= gaocheng[x][y - 1])
						{
							System.out.print(x);
							System.out.print(" ");
							System.out.print(y);
							System.out.print("\n");
						}
						else
						{
							continue;
						}
					}
				}
				else
				{
					if (y == 0)
					{
						if (gaocheng[x][y] >= gaocheng[x - 1][y] != 0 && gaocheng[x][y] >= gaocheng[x][y + 1] != 0 && gaocheng[x][y] >= gaocheng[x + 1][y])
						{
							System.out.print(x);
							System.out.print(" ");
							System.out.print(y);
							System.out.print("\n");
						}
						else
						{
							continue;
						}
					}
					else if (y == n - 1)
					{
						if (gaocheng[x][y] >= gaocheng[x - 1][y] != 0 && gaocheng[x][y] >= gaocheng[x][y - 1] != 0 && gaocheng[x][y] >= gaocheng[x + 1][y])
						{
							System.out.print(x);
							System.out.print(" ");
							System.out.print(y);
							System.out.print("\n");
						}
						else
						{
							continue;
						}
					}
					else
					{
						if (gaocheng[x][y] >= gaocheng[x - 1][y] != 0 && gaocheng[x][y] >= gaocheng[x][y + 1] != 0 && gaocheng[x][y] >= gaocheng[x][y - 1] != 0 && gaocheng[x][y] >= gaocheng[x + 1][y])
						{
							System.out.print(x);
							System.out.print(" ");
							System.out.print(y);
							System.out.print("\n");
						}
						else
						{
							continue;
						}
					}
				}
			}
		}
		return 0;
	} //?????
}

