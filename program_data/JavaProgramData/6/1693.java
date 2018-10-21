package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int k;
	  int m;
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  k = Integer.parseInt(tempVar);
	  }
	  int[][] a = new int[100][100];
	  for (int r = 0;r < k;r++)
	  {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
		for (int i = 0;i < m;i++)
		{
		  for (int j = 0;j < n;j++)
		  {
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i][j] = Integer.parseInt(tempVar4);
			}
		  }
		}
		int s = 0;
		for (int t = 0;t < n;t++)
		{
		   s += a[0][t] + a[m - 1][t];
		}
		for (int u = 1;u < m - 1;u++)
		{
		   s += a[u][0] + a[u][n - 1];
		}
		System.out.printf("%d\n",s);
	  }
	  return 0;
	}
}

