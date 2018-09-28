package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int row;
		int col;
		int[][] str = new int[100][100];
		int x1;
		int x2;
		int x3;
		int x4;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;i < n;i++)
		{
			x1 = 0;
			x2 = 0;
			x3 = 0;
			x4 = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				row = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				col = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < row;j++)
			{
				for (k = 0;k < col;k++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						str[j][k] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (j = 0;j < col;j++)
			{
				x1 += str[0][j];
			}
			for (j = 0;j < row;j++)
			{
				x2 += str[j][0];
			}
			for (j = 0;j < col;j++)
			{
				x3 += str[row - 1][j];
			}
			for (j = 0;j < row;j++)
			{
				x4 += str[j][col - 1];
			}
			sum = x1 + x2 + x3 + x4 - str[0][0] - str[0][col - 1] - str[row - 1][0] - str[row - 1][col - 1];
			System.out.printf("%d\n",sum);
		}
	}





}

