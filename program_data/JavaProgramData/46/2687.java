package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[105][105];
		int row;
		int col;
		int min;
		int i;
		int j;
		int n;
		int x;
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
		for (i = 1;i <= row;i++)
		{
			for (j = 1;j <= col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (row <= col)
		{
			min = row;
		}
		else
		{
			min = col;
		}
		if (min % 2 == 0)
		{
			n = min / 2;
		}
		else
		{
			n = min / 2 + 1;
		}
		for (x = 1;x <= n;x++)
		{
			i = x;
			for (j = x;j <= col - x + 1;j++)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			if (row == min && row % 2 == 1 && x == n)
			{
				break;
			}
			j = col - x + 1;
			for (i = x + 1;i <= row - x + 1;i++)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			if (col == min && col % 2 == 1 && x == n)
			{
				break;
			}
			i = row - x + 1;
			for (j = col - x;j >= x;j--)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			if (row == min && row % 2 == 0 && x == n)
			{
				break;
			}
			j = x;
			for (i = row - x;i >= x + 1;i--)
			{
				System.out.printf("%d\n",a[i][j]);
			}
		}
	}
}

