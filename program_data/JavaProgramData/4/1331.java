package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[100][100];
		int row;
		int col;
		int c;
		int r;
		int sum;
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
		for (r = 0;r < row;r++)
		{
			for (c = 0;c < col;c++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					array[r][c] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (sum = 0;sum <= row + col - 2;sum++)
		{
			if (sum < col)
			{
				for (c = sum;c >= 0;c--)
				{
					if ((sum - c) >= row)
					{
						break;
					}
					System.out.printf("%d\n",array[sum - c][c]);
				}
			}
			else
			{
				for (r = sum - col + 1;r < row;r++)
				{
					if ((sum - r) < 0)
					{
						break;
					}
					System.out.printf("%d\n",array[r][sum - r]);
				}
			}
		}
		return 0;
	}





}

