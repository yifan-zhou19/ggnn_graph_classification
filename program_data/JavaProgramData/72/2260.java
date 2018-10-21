package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int n;
		int[][] a = new int[20][20];
		int[][] b = new int[24][24];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
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
		for (i = 0;i < m + 2;i++)
		{
			for (j = 0;j < n + 2;j++)
			{
				b[i][j] = 0;
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				b[i + 1][j + 1] = a[i][j];
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (b[i + 1][j + 1] + 1 > b[i][j + 1] && b[i + 1][j + 1] + 1 > b[i + 1][j] && b[i + 1][j + 1] + 1 > b[i + 1][j + 2] && b[i + 1][j + 1] + 1 > b[i + 2][j + 1])
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
		}







	}

}

