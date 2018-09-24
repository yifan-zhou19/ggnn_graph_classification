package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row = 0;
		int line = 0;
		int[][] scores = new int[8][8];
		int i = 0;
		int j = 0;
		int maxline = 0;
		int minrow = 0;
		int count = 0;
		int i1 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			line = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < line;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					scores[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < row - 1;i++)
		{
			for (j = 0;j < line-1;j++)
			{
				if (scores[i][maxline] < scores[i][j + 1])
				{
					maxline = j + 1;
				}
			} //?????????maxline
			for (i1 = 0;i1 < row - 1;i1++)
			{
				if (scores[minrow][maxline] > scores[i1 + 1][maxline])
				{
					minrow = i1 + 1;
				}
			} //?????????
			if (i == minrow)
			{
				System.out.printf("%d+%d\n",minrow,maxline);
				count++;
			}
		}
		if (count == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}

}

