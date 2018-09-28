package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] shuzu = new int[100][100];
		int i;
		int j;
		int k;
		int n;
		int row;
		int col;
		int shuru;
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
					shuru = Integer.parseInt(tempVar3);
				}
				shuzu[i][j] = shuru;
			}
		}
		for (k = 0;k <= row + col - 2;k++)
		{
			for (i = 0;i < row;i++)
			{
				for (j = 0;j < col;j++)
				{
					if (i + j == k)
					{
						System.out.printf("%d\n",shuzu[i][j]);
					}
				}
			}
		}
		return 0;

	}
}

