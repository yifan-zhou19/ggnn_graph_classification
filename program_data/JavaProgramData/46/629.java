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
			if (2 * s + 1 == row)
			{
				break;
			}
			for (i = s + 1;i < row - s;i++)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			i -= 1;
			t += 1;
			if (col == t + s)
			{
				break;
			}
			for (j = col - t - 1;j >= s;j--)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			j += 1;
			s += 1;
			if (row == s + t)
			{
				break;
			}
			for (i = row - s - 1;i >= t;i--)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			i += 1;
			if (col == 2 * t)
			{
				break;
			}
		} while (t != col && s != row);
		return 0;
	}


}

