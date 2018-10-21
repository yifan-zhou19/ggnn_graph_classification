package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int k;
		int[][] mat_1 = new int[100][100];
		int[][] mat_2 = new int[100][100];
		int[][] mat = new int[100][100];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y1 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					mat_1[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			y2 = Integer.parseInt(tempVar5);
		}
		for (i = 0;i < x2;i++)
		{
			for (j = 0;j < y2;j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					mat_2[i][j] = Integer.parseInt(tempVar6);
				}
			}
		}

		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y2;j++)
			{
				for (k = 0;k < y1;k++)
				{
					mat[i][j] += mat_1[i][k] * mat_2[k][j];
				}
			}
		}
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y2;j++)
			{
				System.out.printf("%d%c",mat[i][j],(j == y2 - 1)?'\n':' ');
			}
		}
		return 0;
	}
}

