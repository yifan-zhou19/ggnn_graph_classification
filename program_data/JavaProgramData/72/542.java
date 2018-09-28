package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead(" ");
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int i;
		int j;
		int k = 0;
		int p;
		int[][] a = new int[100][100];
		int[] hs = new int[100];
		int[] ls = new int[100];
		for (i = -1;i < m + 1;i++)
		{
			for (j = -1;j < n + 1;j++)
			{
				if (i == -1 || i == m || j == -1 || j == n)
				{
					a[i][j] = 0;
				}
			}
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
			for (j = 0;j < n;j++)
			{
				if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1])
				{
					hs[k] = i;
					ls[k] = j;
					k++;
				}

			}
		}
		for (p = 0;p < k;p++)
		{
			System.out.printf("%d %d\n",hs[p],ls[p]);
		}


		return 0;



	}
}

