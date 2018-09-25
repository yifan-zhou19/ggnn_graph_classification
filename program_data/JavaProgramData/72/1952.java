package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
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
		int[][] gd = new int[m + 2][n + 2];
		int[] a = new int[1000];
		int[] b = new int[1000];
		int x = 0;
	   for (int i = 0;i < m + 2;i++)
	   {
		   for (int k = 0;k < n + 2;k++)
		   {
			   gd[i][k] = 0;
		   }
	   }
		for (int i = 1;i <= m;i++)
		{
			for (int k = 1;k <= n;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					gd[i][k] = Integer.parseInt(tempVar3);
				}
			}
		}
		 for (int i = 1;i <= m;i++)
		 {
			 for (int k = 1;k <= n;k++)
			 {
		 if (gd[i][k] >= gd[i - 1][k] != 0 && gd[i][k] >= gd[i + 1][k] != 0 && gd[i][k] >= gd[i][k + 1] != 0 && gd[i][k] >= gd[i][k - 1])
		 {
		 a[x] = i;
		 b[x] = k;
		 x++;
		 }
			 }
		 }

		for (int i = 0;i < x;i++)
		{
			System.out.printf("%d %d\n",a[i] - 1,b[i] - 1);
		}
		return 0;

	}

}

