package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n;
	int a;
	int b;
	int c1;
	int c2;
	int c;
	int k1;
	int k2;
	int k;
	int[][] sz = new int[1000][1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
	{
	for (int j = 0;j < n;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(sz[i][j]) = Integer.parseInt(tempVar2);
	}
	}
	}
	for (int i = 0;i < n;i++)
	{
	for (int j = 0;j < n;j++)
	{
	if (sz[i][j] == 0)
	{
	c1 = i;
	k1 = j;

	}
	}
	}

	for (int a = n - 1;a >= 0;a--)
	{
	for (int b = n - 1;b >= 0;b--)
	{
	if (sz[a][b] == 0)
	{
	c2 = a;
	k2 = b;

	}
	}
	}

	c = c1 - c2 - 1;
	k = k1 - k2 - 1;
	System.out.printf("%d",c * k);
	return 0;
	}


}

