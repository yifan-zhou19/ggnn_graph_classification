package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int N;
		int w;
		int s;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
	for (w = 0;w < N;w++)
	{
		s = 0;
		for (i = 0;i < 100;i++)
		{
		for (j = 0;j < 100;j++)
		{
		a[i][j] = 0;
		}
		}
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   n = Integer.parseInt(tempVar3);
	   }
	   for (i = 0;i < m;i++)
	   {
		for (j = 0;j < n;j++)
		{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a[i][j] = Integer.parseInt(tempVar4);
		}
		}
	   }
	  if ((n > 1) && (m > 1))
	  {

	   for (i = 0;i < n;i++)
	   {
	   s += a[0][i];
	   }
	   for (i = 0;i < n;i++)
	   {
	   s += a[m - 1][i];
	   }
	   for (i = 1;i < m - 1;i++)
	   {
	   s += a[i][0];
	   }
	   for (i = 1;i < m - 1;i++)
	   {
	   s += a[i][n - 1];
	   }
	  }
	  if ((n == 1) && (m > 1))
	  {
		s = a[0][0] + a[m - 1][0];
	  }
	  if ((n > 1) && (m == 1))
	  {
	  s = a[0][0] + a[0][n - 1];
	  }
	  if ((n == 1) && (m == 1))
	  {
	  s = a[0][0];
	  }

	   System.out.printf("%d\n",s);


	}
	}
}

