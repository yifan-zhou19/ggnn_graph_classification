package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] A = new int[100][100];
		int[][] B = new int[100][100];
		int[][] C = new int[100][100];
		int i;
		int j;
		int a;
		int b;
		int d;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
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
			b = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			d = Integer.parseInt(tempVar5);
		}
		for (i = 0;i < b;i++)
		{
			for (j = 0;j < d;j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					B[i][j] = Integer.parseInt(tempVar6);
				}
			}
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < d;j++)
			{
				for (q = 0;q < b;q++)
				{
					C[i][j] += A[i][q] * B[q][j];
				}
			}
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < d;j++)
			{
				if (j < d - 1)
				{
					System.out.printf("%d ",C[i][j]);
				}
				if (j == d - 1)
				{
					System.out.printf("%d\n",C[i][j]);
				}
			}
		}
		return 0;
	}
}

