package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int ji;
		int[][] su = new int[100][100];
		int h = 0;
		int l = 0;
		int sum;
		int shibie;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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
					su[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		ji = row * col;
		while (ji != 0)
		{
			for (sum = 0;sum < (row + col - 1);sum++)
			{
				if (sum < col)
				{
					l = sum;
					h = 0;
				}
				else
				{
					h = sum - col + 1;
					l = col - 1;
				}
				do
				{
				System.out.printf("%d\n",su[h][l]);
				ji--;
				l--;
				h++;
				}while ((l >= 0) && (h < row));
			}
		}
		return 0;
	}

}

