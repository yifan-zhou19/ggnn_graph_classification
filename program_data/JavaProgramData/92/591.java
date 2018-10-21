package <missing>;

public class GlobalMembers
{
	public static void pailie(int[] a, int n)
	{
		 int i;
		 int j;
		 for (i = 0;i < n;i++)
		 {
			 int max = i;
			 for (j = i + 1;j < n;j++)
			 {
					 if (a[j] > a[max])
					 {
						 max = j;
					 }
			 }
			 int temp = a[i];
			 a[i] = a[max];
			 a[max] = temp;
		 }
	}
	public static int f(int[] a, int[] b, int n)
	{
		int max;
		int i;
		int j;
		int[][] g = new int[1001][1001];
		for (i = 0;i <= n;i++)
		{
		   for (j = 0;j <= n;j++)
		   {
			  g[i][j] = -300000;
		   }
		}
		g[0][0] = 0;

		for (i = 0;i < n;i++)
		{
			for (j = 0;j <= i;j++)
			{
			   if (g[i][j] > -200000)
			   {

				   if (a[j] > b[i])
				   {
							g[i + 1][j + 1] = maxa(g[i][j] + 200, g[i + 1][j + 1]);
				   }
				   else if (a[j] < b[i])
				   {
							g[i + 1][j] = maxa(g[i][j] - 200, g[i + 1][j]);
				   }
				   else if (a[j] == b[i] && b[i] == a[n - 1 - i + j])
				   {
							g[i + 1][j] = maxa(g[i][j], g[i + 1][j]);
				   }
				   else
				   {
							g[i + 1][j + 1] = maxa(g[i][j], g[i + 1][j + 1]);
							g[i + 1][j] = maxa(g[i][j] - 200, g[i + 1][j]);
				   }
			   }
			}
		}
		max = g[n][0];
		for (j = 1;j <= n;j++)
		{
			max = g[n][j] > max != 0?g[n][j]:max;
		}
		return (max);
	}
	public static int maxa(int x, int y)
	{
		return (x > y != 0?x:y);
	}
	public static int Main()
	{
		  int n;
		  int[] a = new int[1000];
		  int[] b = new int[1000];
		  int i;
		  for (;;)
		  {
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  n = Integer.parseInt(tempVar);
			  }
			  if (n == 0)
			  {
				  break;
			  }
			  for (i = 0;i < n;i++)
			  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  a[i] = Integer.parseInt(tempVar2);
				  }
			  }
			  for (i = 0;i < n;i++)
			  {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  b[i] = Integer.parseInt(tempVar3);
				  }
			  }
			  pailie(a, n);
			  pailie(b, n);
			  System.out.printf("%d\n",f(a, b, n));
		  }
		  return 0;
	}
}

