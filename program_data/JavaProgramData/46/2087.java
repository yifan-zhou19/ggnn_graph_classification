package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int[][] sz = new int[100][100];
	int x;
	int y;
	int z;
	int f;
	int g;
	int w;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	for (int p = 0;p < m;p++)
	{
		for (int q = 0;q < n;q++)
		{
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   sz[p][q] = Integer.parseInt(tempVar3);
		   }
		}
	}
	for (x = 0;x < m / 2 && x < n / 2;x++)
	{
	for (y = x;y < n - 1 - x;y++)
	{
	   System.out.printf("%d\n",sz[x][y]);
	}
	for (z = x;z < m - 1 - x;z++)
	{
	   System.out.printf("%d\n",sz[z][y]);
	}
	for (f = n - 1 - x;f > x;f--)
	{
	   System.out.printf("%d\n",sz[z][f]);
	}
	for (g = m - 1 - x;g > x;g--)
	{
	   System.out.printf("%d\n",sz[g][f]);
	}
	}
	if (m % 2 == 1 && n >= m)
	{
	   w = m / 2;
	   for (k = w;k < n - w;k++)
	   {
	   System.out.printf("%d\n",sz[w][k]);
	   }
	}
	else if (n % 2 == 1 && m > n)
	{
	   w = n / 2;
	   for (k = w;k < m - w;k++)
	   {
		  System.out.printf("%d\n",sz[k][w]);
	   }
	}
	return 0;
	}
}

