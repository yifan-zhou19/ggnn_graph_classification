package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		int i;
		int j;
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
		for (i = 0,j = 0;;)
		{
			System.out.printf("%d\n",a[i][j]);
			if (i == row - 1 && j == col - 1)
			{
				break;
			}
			else
			{
			if (j == 0)
			{
				if (i >= col - 1)
				{
					i = i - col + 2;
					j = col - 1;
				}
				else
				{
					j = i + 1;
					i = 0;
				}
			}
			else if (i == row - 1)
			{
				if (i + j >= col - 1)
				{
					i = (i + j) - col + 2;
					j = col - 1;
				}
				else
				{
					j = i + j + 1;
					i = 0;
				}
			}
			else
			{
				i++;
				j--;
			}
			}


		}
		return 0;
	}
}

