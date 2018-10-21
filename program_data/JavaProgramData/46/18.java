package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		int i = 0;
		int j = 0;
		int t = 0;
		int s = 0;
		int isRow;
		int isCol;
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
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		i = 0;
		j = 0;
		do
		{
			for (j = t;j < col - t;j++)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			j -= 1;
			isRow = 0;
			for (i = s + 1;i < row - s;i++)
			{
				System.out.printf("%d\n",a[i][j]);
				isRow = 1;
			}
			if (isRow == 0)
			{
				break;
			}
			i -= 1;
			t += 1;
			isCol = 0;
			for (j = col - t - 1;j >= s;j--)
			{
				System.out.printf("%d\n",a[i][j]);
				isCol = 1;
			}
			if (isCol == 0)
			{
				break;
			}

			j += 1;
			s += 1;
			for (i = row - s - 1;i >= t;i--)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			i += 1;
		} while (t != col && s != row);
		return 0;
	}
}

