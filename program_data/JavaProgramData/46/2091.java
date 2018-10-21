package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int q;
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
		q = m * n;
		int[][] sz = new int[100][100];
		int i;
		int j;
		for (i = 0;i < m;i++)
		{
			 for (j = 0;j < n;j++)
			 {
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			 }
		}
		 int x;
		 int p = 0;
		for (x = 0;x <= (m / 2 + 1) && x <= (n / 2 + 1);x++)
		{
		 for (j = x;j <= (n - x - 1) && x <= (n - x - 1) && p < q;j++)
		 {
			 System.out.printf("%d\n",sz[x][j]);
		 p++;
		 }
		 for (i = x + 1;i <= (m - x - 1) && (x + 1) <= (m - x - 1) && p < q;i++)
		 {
			 System.out.printf("%d\n",sz[i][n - x - 1]);
		 p++;
		 }
		 for (j = (n - x - 2);j >= x != 0 && x <= (n - x - 2) && p < q;j--)
		 {
			 System.out.printf("%d\n",sz[m - 1 - x][j]);
		 p++;
		 }
		 for (i = (m - 2 - x);i >= (x + 1) && (x + 1) <= (m - 2 - x) && p < q;i--)
		 {
			 System.out.printf("%d\n",sz[i][x]);
		 p++;
		 }
		}
		return 0;
	}

}

