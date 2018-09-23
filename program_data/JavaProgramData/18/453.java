package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[][][] a = new int[100][100][100];
	int i;
	int j;
	int k;
	int p = 0;
	int q = 0;
	int m;
	int[] s = new int[100];
	int d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	  for (j = 0;j < n;j++)
	  {
	   for (k = 0;k < n;k++)
	   {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i][j][k] = Integer.parseInt(tempVar2);
		}
	   }
	  }
	}
	d = n;
	for (i = 0;i < d;i++)
	{
	  n = d;
	  s[i] = 0;
	  while (n > 1)
	  {
		for (j = 0;j < n;j++)
		{
		  m = a[i][j][0];
		  for (k = 1;k < n;k++)
		  {
			  if (a[i][j][k] < m)
			  {
				 m = a[i][j][k];
			  }
			  if (a[i][j][k] == 0)
			  {
				break;
			  }
		  }
		  for (k = 0;k < n;k++)
		  {
		   a[i][j][k] -= m;
		  }
		}
		for (j = 0;j < n;j++)
		{
		  m = a[i][0][j];
		  for (k = 1;k < n;k++)
		  {
			  if (a[i][k][j] < m)
			  {
				 m = a[i][k][j];
			  }
			  if (a[i][k][j] == 0)
			  {
				break;
			  }
		  }
		  for (k = 0;k < n;k++)
		  {
		   a[i][k][j] -= m;
		  }
		}
	  s[i] += a[i][1][1];
	  for (k = 0;k < n;k++)
	  {
		for (j = 1;j < n - 1;j++)
		{
		  a[i][k][j] = a[i][k][j + 1];
		}
	  }
	  for (k = 0;k < n;k++)
	  {
		for (j = 1;j < n - 1;j++)
		{
		  a[i][j][k] = a[i][j + 1][k];
		}
	  }
	  n--;

	  }
	}
	for (i = 0;i < d;i++)
	{
	System.out.printf("%d\n",s[i]);
	}
	return 0;
	}

}

