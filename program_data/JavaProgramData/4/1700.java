package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row;
		int col;
		int i = 0;
		int j = 0;
		int k = 0;
		int[][] str = new int[100][100];
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
					str[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (k = 0;k < col;k++)
		{
			for (i = 0,j = k;j >= 0;i++,j--)
			{
				if (str[i][j] == 0)
				{
					break;
				}
				else
				{
					System.out.printf("%d\n",str[i][j]);
				}
			}
		}
		i = 0;
		k = 0;
		j = 0;
		for (k = 1;k < row;k++)
		{
			for (i = k, j = col - 1;(i < row) && (j >= 0);i++, j--)
			{
				System.out.printf("%d\n",str[i][j]);
			}
		}
	}




}

