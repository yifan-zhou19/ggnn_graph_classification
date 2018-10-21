package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] a = new int[101][101];
		int i;
		int j;
		int p;
		int n = 0;
		int row;
		int col;
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


		for (p = 1;p <= 50;p++)
		{
			for (i = p;i <= col + 1 - p;i++)
			{
				System.out.printf("%d\n",a[p][i]);
				n++;
			}
			if (n == row * col)
			{
					break;
			}
			for (i = p + 1;i <= row + 1 - p;i++)
			{
				System.out.printf("%d\n",a[i][col + 1 - p]);
				n++;
			}
			if (n == row * col)
			{
					break;
			}
			for (i = col - p;i >= p;i--)
			{
				System.out.printf("%d\n",a[row + 1 - p][i]);
				n++;
			}
			if (n == row * col)
			{
					break;
			}
			for (i = row - p;i >= p + 1;i--)
			{
				System.out.printf("%d\n",a[i][p]);
				n++;
			}
			if (n == row * col)
			{
					break;
			}
		}
	}
}

