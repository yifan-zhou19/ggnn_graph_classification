package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row;
		int col;
		int n = 0;
		int i;
		int j;
		int[][] a = new int[100][100];
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
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		i = 0;
		j = 0;
		while (n < row + col - 1)
		{
			System.out.printf("%d\n",a[i][j]);
			if (j == 0 || (i == row - 1 && j != 0))
			{
				n++;
				j = n;
				i = 0;
			}
			else
			{
				i++;
				j--;
			}
			while (j > col - 1)
			{
				j--;
				i++;
			}
			if (i == row - 1 && j == col - 1)
			{
				System.out.printf("%d\n",a[i][j]);
				break;
			}
		}
	}
}

