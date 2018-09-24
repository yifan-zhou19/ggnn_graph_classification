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
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;i < n;i++)
		{
			sum = 0;
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
				sum += str[0][j] + str[row - 1][j];
			}
			for (j = 1;j < row - 1;j++)
			{
				sum += str[j][0] + str[j][col - 1];
			}
			System.out.printf("%d\n",sum);
		}
	}


}

