package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[100][100];
		int col;
		int row;
		int cs = 0;
		int i;
		int j;
		int x = 0;
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

		do
		{
			for (i = cs;i < cs + col - 1;i++)
			{
				System.out.printf("%d\n",array[cs][i]);
			}

			for (i = cs;i < cs + row - 1;i++)
			{
				System.out.printf("%d\n",array[i][cs + col - 1]);
			}

			if (i != cs)
			{
			for (i = cs;i < cs + col - 1;i++)
			{
				System.out.printf("%d\n",array[cs + row - 1][2 * cs + col - i - 1]);
			}
			}
			else
			{
				System.out.printf("%d\n",array[cs + row - 1][cs + col - 1]);
				x = 1;
			}

			if (i != cs)
			{
			for (i = cs;i < cs + row - 1;i++)
			{
				System.out.printf("%d\n",array[2 * cs + row - i - 1][cs]);
			}
			}
			else if (x == 0)
			{
				System.out.printf("%d\n",array[cs + row - 1][cs]);
			}

			cs++;
			col -= 2;
			row -= 2;

		} while (col > 0 && row > 0);

		return 0;
	}



}

