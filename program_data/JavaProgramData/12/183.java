package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] num = new int[15][15];
		int[] doub = new int[15];
		int i;
		int j;
		int k;
		int[] w = new int[15];
		int row;
		for (i = 0;i < 15;i++)
		{
			for (j = 0;j < 20;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					num[i][j] = Integer.parseInt(tempVar);
				}
				if (num[i][j] == -1)
				{
					break;
				}
				if (num[i][j] == 0)
				{
					w[i] = j;
					break;
				}
			}
			if (num[i][0] == -1)
			{
				row = i;
				break;
			}
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < w[i];j++)
			{
				for (k = 0;k < w[i];k++)
				{
					if (num[i][k] == 2 * num[i][j])
					{
						doub[i]++;
					}
				}
			}
			System.out.printf("%d\n",doub[i]);
		}
		return 0;
	}
}

