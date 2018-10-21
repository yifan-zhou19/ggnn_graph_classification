package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int Row;
		int Col;
		int sum;
		int[][] array = new int[100][100];
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
		sum = row * col;
		//sum??
		for (Row = 0;Row < row;Row++)
		{
			for (Col = 0;Col < col;Col++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					array[Row][Col] = Integer.parseInt(tempVar3);
				}
			}
		}
		//??????
		Row = 0;
		Col = -1;
		int r;
		int c;
		row--;
		while (true)
		{
			for (c = 0;c < col;c++)
			{
				Col++;
				System.out.printf("%d\n",array[Row][Col]);
				sum--;
			}
			if (sum == 0)
			{
				break;
			}
			col--;
			//??
			for (r = 0;r < row;r++)
			{
				Row++;
				System.out.printf("%d\n",array[Row][Col]);
				sum--;
			}
			if (sum == 0)
			{
				break;
			}
			row--;
			//??
			for (c = 0;c < col;c++)
			{
				Col--;
				System.out.printf("%d\n",array[Row][Col]);
				sum--;
			}
			if (sum == 0)
			{
				break;
			}
			col--;
			//??
			for (r = 0;r < row;r++)
			{
				Row--;
				System.out.printf("%d\n",array[Row][Col]);
				sum--;
			}
			if (sum == 0)
			{
				break;
			}
			row--;
			//??
		}
		return 0;
	}

}

