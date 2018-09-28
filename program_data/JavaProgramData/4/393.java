package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int col;
		int row;
		int[][] a = new int[100][100];
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
		i = 0;
		j = 0;

		for (;;)
		{

				System.out.printf("%d\n",a[i][j]);
					if (i + j == row + col - 2)
					{
						break;
					}
			if (j == 0)
			{
				j = i + j + 1;
				i = 0;
			}
			 else if (i >= row - 1)
			 {
				 j = i + j + 1;
				 i = 0;
			 }
			 else
			 {
				 i++;
				 j--;
			 }

		if (j > col - 1)
		{
			i = i + j + 1 - col;
			j = j - (j + 1 - col);
		}
		if (i + j == row + col - 2)
		{
			break;
		}

		}
		if (row + col > 2)
		{
		System.out.printf("%d\n",a[i][j]);
		}

	}
}

