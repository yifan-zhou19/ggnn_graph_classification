package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			int row;
			int col;
			int total = 0;
			int[][] s = new int[100][100];
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				row = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				col = Integer.parseInt(tempVar3);
			}
			int x;
			int y;
			for (x = 0;x < row;x++)
			{
				for (y = 0;y < col;y++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						s[x][y] = Integer.parseInt(tempVar4);
					}
				}
			}
			if (row < 3 || col < 3)
			{
				for (x = 0;x < row;x++)
				{
				   for (y = 0;y < col;y++)
				   {
					total += s[x][y];
				   }
				}
				System.out.printf("%d\n",total);
			}
				else
				{
			for (y = 0;y < col;y++)
			{
				total += s[0][y];
			}
			for (y = 0;y < col;y++)
			{
				total += s[row - 1][y];
			}
			for (x = 0;x < row;x++)
			{
				total += s[x][0];
			}
			for (x = 0;x < row;x++)
			{
				total += s[x][col - 1];
			}
			total = total - s[0][0] - s[0][col - 1] - s[row - 1][0] - s[row - 1][col - 1];
			System.out.printf("%d\n",total);
				}

		}
	}


}

