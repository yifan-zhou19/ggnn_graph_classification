package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int row;
		int col;
		int n = 0;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][0] = Integer.parseInt(tempVar3);
			}
			for (j = 1;j < col;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					a[i][j] = Integer.parseInt(tempVar4);
				}
			}
		}
		for (i = 0;;i++)
		{
			for (j = i;j < col - i;j++,n++)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			if (n == row * col)
			{
				break;
			}
			for (j = i + 1;j < row - i;j++,n++)
			{
				System.out.printf("%d\n",a[j][col - i - 1]);
			}
			if (n == row * col)
			{
				break;
			}
			for (j = col - i - 2;j > i;j--,n++)
			{
				System.out.printf("%d\n",a[row - i - 1][j]);
			}
			if (n == row * col)
			{
				break;
			}
			for (j = row - i - 1;j > i;j--,n++)
			{
				System.out.printf("%d\n",a[j][i]);
			}
			if (n == row * col)
			{
				break;
			}
		}
	}
}

