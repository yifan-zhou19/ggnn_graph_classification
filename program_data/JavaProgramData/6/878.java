package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int row;
		int col;
		int[][] c = new int[100][100];
		int[] result = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
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
						*(c + j) + k = tempVar4;
					}
					if (k == 0 || k == col - 1 || j == 0 || j == row - 1)
					{
						result[i] += *(*(c + j) + k);
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",result[i]);
		}
	}
}

