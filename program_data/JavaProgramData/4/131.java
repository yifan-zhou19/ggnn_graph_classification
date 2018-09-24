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
		int k;
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
			for (i = 0,j = 0,k = 2;j < col;i++,j--)
			{
				System.out.printf("%d\n",a[i][j]);
				if (j == 0 || i == row - 1)
				{
					j = k;
					k = k + 1;
					i = -1;
				}
			}
			for (i = 1,j = col - 1,k = 1;i < row;i++,j--)
			{
				System.out.printf("%d\n",a[i][j]);

				if (i == row - 1 || j == 0)
				{
					i = k;
					k++;
					j = col;
				}
			}
	}



}

