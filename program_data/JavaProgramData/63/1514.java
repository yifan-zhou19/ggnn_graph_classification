package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] A = new int[100][100];
		int[][] B = new int[100][100];
		int[][] C = new int[100][100];
		int m = 0;
		int x1;
		int x2;
		int y1;
		int y2;
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
		for (int i = 0;i < x1;i++)
		{
			for (int j = 0;j < y1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					A[i][j] = Integer.parseInt(tempVar3);
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
		for (int i = 0;i < x2;i++)
		{
			for (int j = 0;j < y2;j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					B[i][j] = Integer.parseInt(tempVar6);
				}
			}
		}
		for (int i = 0;i < x1;i++)
		{
			for (int j = 0;j < y2;j++)
			{
				for (int k = 0;k < x2;k++)
				{
					if (k == 0)
					{
					C[i][j] = A[i][k] * B[k][j];
					}
					else
					{
					C[i][j] = A[i][k] * B[k][j] + C[i][j];
					}

				}
			}
		}
		for (int i = 0;i < x1;i++)
		{
			for (int j = 0;j < y2;j++)
			{
				if (j == 0 && y2 != 1)
				{
				System.out.printf("%d",C[i][j]);
				}
				else if (j == 0 && y2 == 1)
				{
				System.out.printf("%d\n",C[i][j]);
				}
				else if (j < (y2 - 1) && j>0)
				{
				System.out.printf(" %d",C[i][j]);
				}
				else if (j == (y2 - 1) && i != (x1 - 1))
				{
				System.out.printf(" %d\n",C[i][j]);
				}
				else if (j == (y2 - 1) && i == (x1 - 1))
				{
				System.out.printf(" %d",C[i][j]);
				}
			}
		}
	}
}

