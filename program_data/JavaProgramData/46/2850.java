package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int[][] array = new int[101][101];
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					array[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
			int num = row + col - 1;
			for (i = 1;i <= num;i++)
			{
				if (count == row * col)
				{
					break;
				}
				else
				{
					switch (i % 4)
					{
					case 1:
					{
							for (j = i / 4;j < col - i / 4;j++)
							{
								System.out.printf("%d\n",array[i / 4][j]);
								count += 1;
							}
							break;
					}
					case 2:
					{
							for (j = i / 4 + 1;j < row - i / 4;j++)
							{
								System.out.printf("%d\n",array[j][col - i / 4 - 1]);
								count += 1;
							}
							break;
					}
					case 3:
					{
							for (j = col - 2 - i / 4;j >= i / 4;j--)
							{
								System.out.printf("%d\n",array[row - 1 - i / 4][j]);
								count += 1;
							}
							break;
					}
					case 0:
					{
							for (j = row - 1 - i / 4;j >= i / 4;j--)
							{
								System.out.printf("%d\n",array[j][i / 4 - 1]);
								count += 1;
							}
							break;
					}
					}
				}
			}
			return 0;
	}






}

