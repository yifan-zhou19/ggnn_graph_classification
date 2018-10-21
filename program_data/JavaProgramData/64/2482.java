package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] x = new int[20];
	int[] y = new int[20];
	int[] z = new int[20];
	int i;
	int j;
	int q;
	int w;
	int k;
	double[][] dis = new double[20][20];
	double max;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y[i] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			z[i] = Integer.parseInt(tempVar4);
		}
	}
		for (i = 1;i < n;i++)
		{
	for (j = i + 1;j <= n;j++)
	{
	dis[i][j] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
	}
		}
	for (i = 1;i <= ((n * (n - 1)) / 2);i++)
	{
	 max = 0;
	  for (j = 1;j < n;j++)
	  {
	  for (k = j + 1;k <= n;k++)
	  {
	  if (dis[j][k] > max)
	  {
	   max = dis[j][k];
	   q = j;
	   w = k;
	  }
	  }
	  }
	System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",x[q],y[q],z[q],x[w],y[w],z[w],dis[q][w]);
	dis[q][w] = 0;
	}
	return 0;
	}
}

