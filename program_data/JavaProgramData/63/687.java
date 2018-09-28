package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int ai;
		int aj;
		int bi;
		int bj;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ai = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			aj = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < ai;i++)
		{
			for (j = 0;j < aj;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			bi = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			bj = Integer.parseInt(tempVar5);
		}
		for (i = 0;i < bi;i++)
		{
			for (j = 0;j < bj;j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[i][j] = Integer.parseInt(tempVar6);
				}
			}
		}
		for (i = 0;i < ai;i++)
		{
			for (j = 0;j < bj;j++)
			{
				for (k = 0,c[i][j] = 0;k < aj;k++)
				{
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		for (i = 0;i < ai - 1;i++)
		{
			System.out.printf("%d",c[i][0]);
			for (j = 1;j < bj;j++)
			{
				System.out.printf(" %d",c[i][j]);
			}
			System.out.print("\n");
		}
		System.out.printf("%d",c[ai - 1][0]);
			for (j = 1;j < bj;j++)
			{
				System.out.printf(" %d",c[ai - 1][j]);
			}
	}

}

