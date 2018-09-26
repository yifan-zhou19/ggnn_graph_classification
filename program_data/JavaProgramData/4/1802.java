package <missing>;

public class GlobalMembers
{
	public static int[][] g = new int[100][100];


	public static int Main()
	{
		int r;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}

		for (int i = 0;i < r;i++)
		{
			for (int j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					g[i] + j = Integer.parseInt(tempVar3);
				}
			}
		}

		for (int j = 0;j < r + c - 1;j++)
		{
			for (int i = 0;i < r;i++)
			{
				if (j - i >= 0 && j - i < c)
				{
					System.out.printf("%d\n",g[i][j - i]);
				}
			}
		}

		return 0;
	}



}

