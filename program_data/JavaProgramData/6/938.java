package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void sum();
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			sum();
		}

	}
	public static void sum()
	{
		int m;
		int n;
		int i;
		int j;
		int s = 0;
		int[][] a = new int[101][101];
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
		for (i = 0;i < m;i++)
		{
			s = s + a[i][0];
		}
		for (i = 0;i < m;i++)
		{
			s = s + a[i][n - 1];
		}
		for (i = 1;i < n - 1;i++)
		{
			s = s + a[0][i];
		}
		for (i = 1;i < n - 1;i++)
		{
			s = s + a[m - 1][i];
		}
		System.out.printf("%d\n",s);
	}
}

