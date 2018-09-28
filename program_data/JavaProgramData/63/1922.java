package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int q;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			q = Integer.parseInt(tempVar2);
		}
		int[][] A = new int[100][100];
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < q;j++)
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
			q = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			n = Integer.parseInt(tempVar5);
		}
		int[][] B = new int[100][100];
		for (i = 0;i < q;i++)
		{
			for (j = 0;j < n;j++)
			{
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				B[i][j] = Integer.parseInt(tempVar6);
			}
			}
		}
		int[][] C = new int[100][100];
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
			for (k = 0;k < q;k++)
			{
				C[i][j] = C[i][j] + A[i][k] * B[k][j];
			}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
			if (j != n - 1)
			{
				System.out.printf("%d ",C[i][j]);
			}
			else
			{
				System.out.printf("%d",C[i][j]);
			}
			}
			  System.out.print("\n");
		}
	}
}

