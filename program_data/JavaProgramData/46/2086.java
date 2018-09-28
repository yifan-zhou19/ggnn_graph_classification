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
	int a;
	int b;
	int w = 0;
	int i;

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

	if (m > n)
	{


	i = n;
	}

	else
	{


	i = m;
	}

	for (x = 0;x < i / 2;x++)

	{


	for (y = 0 + x;y < n - 1 - x;y++)


	{



	System.out.printf("%d\n",sz[x][y]);


	}


	for (z = 0 + x;z < m - 1 - x;z++)


	{



	System.out.printf("%d\n",sz[z][y]);


	}


	for (a = n - 1 - x;a > 0 + x;a--)
	{



	System.out.printf("%d\n",sz[z][a]);


	}


	for (b = m - 1 - x;b > 0 + x;b--)


	{



	System.out.printf("%d\n",sz[b][a]);


	}

	}

	if (m % 2 == 1 && n >= m)

	{


	w = m / 2;


	for (y = w;y <= n - 1 - w;y++)
	{



	System.out.printf("%d\n",sz[w][y]);
	}

	}

	else if (n % 2 == 1 && m >= n)

	{


	w = n / 2;


	for (x = w;x <= m - 1 - w;x++)
	{



	System.out.printf("%d\n",sz[x][w]);
	}


	}

	return 0;
	}


}

