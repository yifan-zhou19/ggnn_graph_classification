package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int d;
	int e;
	int k;
	int f = 0;
	int n;
	int[][] sz = new int[50001][4];
	int[] dsz = new int[100000];
	for (a = 0;a < 100000;a++)
	{
		dsz[a] = 0;
	}
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (a = 0;a < n;a++)
	{
		for (b = 0;b < 2;b++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  sz[a][b] = Integer.parseInt(tempVar2);
		  }
		}
	}
	for (a = 0;a < n;a++)
	{
		sz[a][2] = 2 * sz[a][0];
		sz[a][3] = 2 * sz[a][1];
		for (k = sz[a][2];k <= sz[a][3];k++)
		{
			dsz[k] = 1;
		}
	}
	c = sz[0][2];
	d = sz[0][3];
	for (a = 1;a < n;a++)
	{
		   if (sz[a][2] < c)
		   {
			   c = sz[a][2];
		   }
		   if (sz[a][3] > d)
		   {
			   d = sz[a][3];
		   }
	}
	e = d - c + 1;
	for (k = 0;k < 100000;k++)
	{
		if (dsz[k] == 1)
		{
			f++;
		}
	}
	if (e == f)
	{
		System.out.printf("%d %d",c / 2,d / 2);
	}
	if (e != f)
	{
		System.out.print("no");
	}
	return 0;
	}



}

