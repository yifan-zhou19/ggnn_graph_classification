package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int[][] a = new int[30][30];
	  int i;
	  int j;
	  int k;
	  int m;
	  int n;
	  int t;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  t = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= t;i++)
	  {
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
		  for (j = 0;j <= n;j++)
		  {
			  for (k = 0;k <= m;k++)
			  {
				  a[j][k] = 0;
			  }
		  }
		  for (j = 1;j <= n;j++)
		  {
			  a[j][0] = 1;
			  a[j][1] = 1;
		  }
		  for (j = 1;j <= m;j++)
		  {
			  a[1][j] = 1;
			  a[0][j] = 1;
		  }
		  for (j = 2;j <= n;j++)
		  {
			  for (k = 2;k <= m;k++)
			  {
				  if (k >= j)
				  {
					  a[j][k] = a[j - 1][k] + a[j][k - j];
				  }
				  else
				  {
					  a[j][k] = a[j - 1][k];
				  }
			  }
		  }
		  System.out.printf("%d\n",a[n][m]);
	  }
	}
}

