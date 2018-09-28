package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int l;
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
		for (j = 0;j < n;j++)
		{
				for (l = 0;(l < m) && (l <= j);l++)
				{
					System.out.printf("%d\n",a[l][j - l]);
				}
		}
		for (i = 1;i < m;i++)
		{
			for (k = 0;(k < m - i) && (k < n);k++)
			{
				System.out.printf("%d\n",a[i + k][n - k - 1]);
			}
		}


	}
}

