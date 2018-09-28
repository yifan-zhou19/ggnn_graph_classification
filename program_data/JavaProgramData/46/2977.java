package <missing>;

public class GlobalMembers
{
	//***************************
	//**???2.cpp
	//**??????
	//**???2013.11.1
	//**?????????????
	//***************************
	public static int Main()
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		int n = 0; // n??????????

		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= row; i++)
		{
			for (int j = 1; j <= col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 1; i <= (row + 1) / 2; i++)
		{
			for (int j = i; j <= col + 1 - i; j++) // ???????
			{
				if (n == row * col)
				{
					break; // ???????????????
				}
				System.out.print(a[i][j]);
				System.out.print("\n");
				n++; // ???????????
				if (j == col + 1 - i)
				{
					for (int k = i + 1; k <= row + 1 - i; k++) // ????????????
					{
						if (n == row * col)
						{
							break;
						}
						System.out.print(a[k][j]);
						System.out.print("\n");
						n++;
						if (k == row + 1 - i)
						{
							for (int l = col - i; l >= i; l--) // ?????????????
							{
								if (n == row * col)
								{
									break;
								}
								System.out.print(a[k][l]);
								System.out.print("\n");
								n++;
								if (l == i)
								{
									for (int m = row - i; m >= 1 + i; m--) // ????????????
									{
										if (n == row * col)
										{
											break;
										}
										System.out.print(a[m][l]);
										System.out.print("\n");
										n++;
									} // ?????????????i??????????????i???????????????????
								}
							}
						}
					}
				}
			}
		}
		return 0;
	}
}

