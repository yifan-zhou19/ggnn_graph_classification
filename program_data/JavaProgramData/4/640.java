package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int[][] a = new int[100][100];
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
			System.out.printf("%d\n",a[0][0]);
		for (j = 1;j < n;j++)
		{
			for (i = 0;i < j + 1 && i < m;i++)
			{
				System.out.printf("%d\n",a[i][j - i]);
			}
		}
		for (i = 1;i < m;i++)
		{
			for (j = 0;j < n && j < m - i;j++)
			{
				System.out.printf("%d\n",a[j + i][n - 1 - j]);
			}
		}




		return 0;
	}
}

