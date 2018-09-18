package <missing>;

public class GlobalMembers
{
	public static int sum;
	public static void guiling(int[][] a, int p)
	{
	  int t;
	  int s;
	  int min1;
	  int min2;
	  for (s = 0;s < p;s++)
	  {
		min1 = a[s][0];
		for (t = 1;t < p;t++)
		{
		if (a[s][t] < min1)
		{
			min1 = a[s][t];
		}
		}
		for (t = 0;t < p;t++)
		{
		a[s][t] = a[s][t] - min1;
		}
	  }
	  for (t = 0;t < p;t++)
	  {
		min2 = a[0][t];
		for (s = 1;s < p;s++)
		{
		if (a[s][t] < min2)
		{
			min2 = a[s][t];
		}
		}
		for (s = 0;s < p;s++)
		{
		a[s][t] = a[s][t] - min2;
		}
	  }
	  sum = sum + a[1][1];
	}
	public static void xiaojian(int[][] a, int p)
	{
	  int i;
	  int j;
	  for (i = 0;i < p;i++)
	  {
	  for (j = 1;j < p - 1;j++)
	  {
	  a[i][j] = a[i][j + 1];
	  }
	  }
	  for (j = 0;j < p - 1;j++)
	  {
	  for (i = 1;i < p - 1;i++)
	  {
	  a[i][j] = a[i + 1][j];
	  }
	  }
	}
	public static int Main()
	{
	  int n;
	  int[][] a = new int[100][100];
	  int i;
	  int j;
	  int k;
	  int t;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1 ; i <= n ; i++)
	  {
		sum = 0;
		for (j = 0;j < n;j++)
		{
		for (k = 0;k < n;k++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[j][k] = Integer.parseInt(tempVar2);
		}
		}
		}
		for (t = n ; t >= 2 ; t--)
		{
		  guiling(a, t);
		  xiaojian(a, t);
		}
		System.out.printf("%d\n",sum);
	  }
	  return 0;
	}

}

