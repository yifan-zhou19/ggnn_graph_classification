package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] n = new int[ROW][COL];
		int row;
		int col;
		int i;
		int j;
		int begin;
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
					n[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (begin = 0;;begin++)
		{
				if (begin >= (col - begin))
				{
					break;
				}
				for (i = begin,j = begin;j < (col - begin);j++)
				{
					System.out.printf("%d\n",n[i][j]);
				}
				if ((begin + 1) >= (row - begin))
				{
					break;
				}
				else
				{
					for (i = (begin + 1),j = (col - begin - 1);i < (row - begin);i++)
					{
						System.out.printf("%d\n",n[i][j]);
					}
				}
				if ((col - begin - 2) < begin)
				{
					break;
				}
				else
				{
					for (i = (row - begin - 1),j = (col - begin - 2);j > (begin - 1);j--)
					{
						System.out.printf("%d\n",n[i][j]);
					}
				}
				if ((row - begin - 2) < (begin + 1))
				{
					break;
				}
				else
				{
					for (i = (row - begin - 2),j = begin;i > begin;i--)
					{
						System.out.printf("%d\n",n[i][j]);
					}
				}

		}
	}
}

