package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int hang;
		int lie;
		int row;
		int col;
		int min;
		int i;
		int j;

		for (row = 0;row < 5;row++)
		{
			for (col = 0;col < 5;col++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[row][col] = Integer.parseInt(tempVar);
				}
			}
		}
		i = 0;
		for (col = 0;col < 5;col++)
		{
			min = sz[0][col];
			lie = col;
			for (row = 0;row < 5;row++)
			{
				if (sz[row][col] <= min)
				{
					min = sz[row][col];
					hang = row;
				}
			}
			j = 0;
			col = 0;
			while (col < 5)
			{
				if (min >= sz[hang][col])
				{
					j++;
				}
				col++;
			}
			if (j == 5)
			{
				System.out.printf("%d %d %d\n",hang + 1,lie+1,min);
				i++;
			}
			col = lie;

		}
		if (i == 0)
		{
			System.out.print("not found");
		}

		return 0;
	}
}

