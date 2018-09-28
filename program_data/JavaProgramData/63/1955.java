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
		int sum;
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
		int[][] A = new int[x1][y1];
		for (i = 1;i <= x1;i++)
		{
			for (j = 1;j <= y1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					A[i - 1][j - 1] = Integer.parseInt(tempVar3);
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
		int[][] B = new int[x2][y2];
		for (i = 1;i <= x2;i++)
		{
			for (j = 1;j <= y2;j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					B[i - 1][j - 1] = Integer.parseInt(tempVar6);
				}
			}

		}
		for (i = 1;i <= x1;i++)
		{
			for (j = 1;j <= y2;j++)
			{
				sum = 0;
				for (k = 1;k <= x2;k++)
				{
					sum = sum + A[i - 1][k - 1] * B[k - 1][j - 1];
				}
				if (j == 1)
				{
					System.out.printf("%d",sum);
				}
				else
				{
					System.out.printf(" %d",sum);
				}
			}
			System.out.print("\n");
		}
	}
}

