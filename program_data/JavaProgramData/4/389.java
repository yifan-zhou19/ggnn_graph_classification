package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row;
		int col;
		int[][] array = new int[100][100];
		int i;
		int j;
		int k;
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
					array[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		if ((i == 1) && (j == 1))
		{
			System.out.printf("%d\n",array[0][0]);
		}
		else
		{
			for (j = 0;j < col;j++)
			{
				k = j;
				for (i = 0;i < row;i++)
				{
					if (k < 0)
					{
						break;
					}
					System.out.printf("%d\n",array[i][k]);
					k--;
				}
			}
			for (i = 1;i < row;i++)
			{
				k = col - 1;
				for (j = i;j < row;j++)
				{
					if (k < 0)
					{
						break;
					}
					System.out.printf("%d\n",array[j][k]);
					k--;
				}
			}
		}
	}
}

