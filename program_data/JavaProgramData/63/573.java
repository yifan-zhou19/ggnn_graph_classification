package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int q;
		int m;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			q = Integer.parseInt(tempVar2);
		}
		int[][] a = new int[n][q];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < q;j++)
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
			q = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			m = Integer.parseInt(tempVar5);
		}
		int[][] b = new int[q][m];
		for (i = 0;i < q;i++)
		{
			for (j = 0;j < m;j++)
			{
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				b[i][j] = Integer.parseInt(tempVar6);
			}
			}
		}
		int[][] c = new int[n][m];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
			c[i][j] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				 for (k = 0;k < q;k++)
				 {
				 c[i][j] = a[i][k] * b[k][j] + c[i][j];
				 }
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < (m - 1);j++)
			{
			System.out.printf("%d ",c[i][j]);
			}
			System.out.printf("%d\n",c[i][j]);
		}
		System.in.read();
		System.in.read();
	}
}

