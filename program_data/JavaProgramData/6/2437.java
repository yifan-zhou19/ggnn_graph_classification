package <missing>;

public class GlobalMembers
{
	public static void mk()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int s = 0;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
		for (j = 0;j < n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Integer.parseInt(tempVar3);
			}
		}
		}
		s = 0;
		for (i = 0;i < n;i++)
		{
			s += a[0][i];
		}
		for (j = 1;j < m;j++)
		{
			s += a[j][n - 1];
		}

		for (k = n - 2;k >= 0;k--)
		{

			s += a[m - 1][k];
		}

		for (i = m - 2;i > 0;i--)
		{
			s += a[i][0];
		}
		System.out.printf("%d\n",s);
	}



	public static int Main()
	{
		int p;
		int q;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Integer.parseInt(tempVar);
		}
		for (q = 0;q < p;q++)
		{
			mk();
		}
		return 0;
	}

}

