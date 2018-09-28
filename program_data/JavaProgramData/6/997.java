package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int i;
		int k;
		int m;
		int a;
		int t;
		int all;
		int sum;
		int[][] s = new int[500][500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			all = Integer.parseInt(tempVar);
		}
		m = 0;
		for (t = 0;t < all;t++)
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
		sum = 0;
		 for (i = 0;i < m;i++)
		 {
		  for (j = 0;j < n;j++)
		  {
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  s[i][j] = Integer.parseInt(tempVar4);
		  }
		  sum += s[i][j];
		  }
		 }
		  if ((m == 1) || (n == 1))
		  {
			  System.out.printf("%d\n", sum);
		  }
		  else
		  {
		  for (i = 1;i <= m - 2;i++)
		  {
		  for (j = 1;j <= n - 2;j++)
		  {
		  sum = sum - s[i][j];
		  }
		  }
		  System.out.printf("%d\n",sum);
		  }
		}

					 return 0;
	}


}

