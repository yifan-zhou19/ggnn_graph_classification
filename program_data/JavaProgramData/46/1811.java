package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int row;
		int col;
		int i;
		int h;
		int num;
		int total;
		int[][] sz = new int[100][100];
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
			for (h = 0;h < col;h++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][h] = Integer.parseInt(tempVar3);
				}
			}
		}
		num = 0;
		h = 0;
		total = row * col;
		while (true)
		{
			for (i = h;i < col - h;i++)
			{
				System.out.printf("%d\n",sz[h][i]);
				num++;
				if (num == total)
				{
				}
			}
			for (i = h + 1;i < row - h;i++)
			{
				System.out.printf("%d\n",sz[i][col - 1 - h]);
				num++;
				if (num == total)
				{
				}
			}
			for (i = h + 1;i < col - h;i++)
			{
				System.out.printf("%d\n",sz[row - 1 - h][col - 1 - i]);
				num++;
				if (num == total)
				{
				}
			}
			for (i = h + 1;i < row - h - 1;i++)
			{
				System.out.printf("%d\n",sz[row - 1 - i][h]);
				num++;
				if (num == total)
				{
				}
			}
			h++;
		}
	}
}

