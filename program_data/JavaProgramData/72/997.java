package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
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
		int[][] a = new int[m + 2][n + 2];
		for (i = 1;i < m + 1;i++)
		{
		  for (j = 1;j < n + 1;j++)
		  {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   a[i][j] = Integer.parseInt(tempVar3);
		   }
		  }
		}
		for (j = 0;j < n + 2;j++)
		{
		   a[0][j] = 0;
		}
		for (j = 0;j < n + 2;j++)
		{
		   a[m + 1][j] = 0;
		}
		for (i = 0;i < m + 2;i++)
		{
		  a[i][0] = 0;
		}
		for (i = 0;i < m + 2;i++)
		{
		  a[i][n + 1] = 0;
		}
	   for (i = 1;i < m + 1;i++)
	   {
		  for (j = 1;j < n + 1;j++)
		  {
			  if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
			  {
		 System.out.printf("%d %d\n",i - 1,j - 1);
			  }
		  }
	   }
	   return 0;
	}

}

