package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int k = 1;
		int num = 0;
		int i;
		int j;
		int[][] sz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			j = Integer.parseInt(tempVar2);
		}
		for (row = 0;row < i;row++)
		{
			for (col = 0;col < j;col++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[row][col] = Integer.parseInt(tempVar3);
				}
			}
		}
		row = -1;
		for (num = 0;num < i * j;)
		{
			row += 1;
			for (col = k - 1;col <= j - k;col++)
			{
				System.out.printf("%d\n",sz[row][col]);
				num += 1;
			}
			col -= 1;
			if (num >= i * j)
			{
				break;
			}
			for (row = k;row <= i - k;row++)
			{
				System.out.printf("%d\n",sz[row][col]);
				num += 1;
			}
			row -= 1;
			if (num >= i * j)
			{
				break;
			}
			k = k + 1;
			for (col = j - k;col >= k - 2;col--)
			{
				System.out.printf("%d\n",sz[row][col]);
				num += 1;
			}
			col += 1;
			if (num >= i * j)
			{
				break;
			}
			for (row = i - k;row >= k - 1;row--)
			{
				System.out.printf("%d\n",sz[row][col]);
				num += 1;
			}
			if (num >= i * j)
			{
				break;
			}
		}
		return 0;
	}

}

