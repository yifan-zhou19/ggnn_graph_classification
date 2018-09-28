package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[][] det = new int[100][100];
		int ROW;
		int COL;
		int row1;
		int row2;
		int col1;
		int col2;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ROW = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			COL = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < ROW;j++)
		{
			for (i = 0;i < COL;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					det[j][i] = Integer.parseInt(tempVar3);
				}
			}
		}
		row1 = 0;
		row2 = ROW - 1;
		col1 = 0;
		col2 = COL - 1;
		while (row2 >= row1 != 0 && col2 >= col1)
		{
			for (i = col1;i <= col2;i++)
			{
				System.out.printf("%d\n",det[row1][i]);
				count++;
			} //verforward

			if (count == ROW * COL)
			{
				break;
			}
			for (j = (row1 + 1);j <= row2;j++)
			{
				System.out.printf("%d\n",det[j][col2]);
				count++;
			} //hordown

			if (count == ROW * COL)
			{
				break;
			}
			for (i = col2 - 1;i >= col1;i--)
			{
				System.out.printf("%d\n",det[row2][i]);
				count++;
			} //verbackward

			if (count == ROW * COL)
			{
				break;
			}
			for (j = (row2 - 1);j >= (row1 + 1);j--)
			{
				System.out.printf("%d\n",det[j][col1]);
				count++;
			} //horup

			col1++;
			col2--;
			row1++;
			row2--;
		}
		return 0;
	}
}

