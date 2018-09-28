package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int d;
		int[][] a = new int[9][9];
		int[][] tmp = new int[9][9];
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = num;
		for (int i = 0; i < d; i++)
		{
			for (int x = 0; x < 9; x++)
			{
				for (int y = 0; y < 9; y++)
				{
					tmp[x][y] = 0;
				}
			}
			for (int x = 0; x < 9; x++)
			{
				for (int y = 0; y < 9; y++)
				{
					if (x > 0)
					{
						tmp[x - 1][y] += a[x][y];
						if (y > 0)
						{
							tmp[x - 1][y - 1] += a[x][y];
							if (y < 9)
							{
								tmp[x - 1][y + 1] += a[x][y];
							}
						}
						if (x < 9)
						{
							tmp[x + 1][y] += a[x][y];
							if (y > 0)
							{
								tmp[x + 1][y - 1] += a[x][y];
								if (y < 9)
								{
									tmp[x + 1][y + 1] += a[x][y];
								}
							}
						}
					}
					if (y > 0)
					{
						tmp[x][y - 1] += a[x][y];
					}
					if (y < 9)
					{
						tmp[x][y + 1] += a[x][y];
					}
					tmp[x][y] += a[x][y] * 2;
				}
			}
				for (int x = 0; x < 9; x++)
				{
					for (int y = 0; y < 9; y++)
					{
						a[x][y] = tmp[x][y];
					}
				}
		}
		for (int x = 0; x < 9; x++)
		{
			for (int y = 0; y < 9; y++)
			{
				System.out.print(a[x][y]);
				if (y == 8)
				{
					System.out.print("\n");
				}
				else
				{
					System.out.print(" ");
				}
			}
		}






		return 0;
	}
}

