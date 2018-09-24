package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int[][] sz = new int[1000][1000];
	int a;
	int b;
	int c;
	int d;
	int e = 1;
	int s;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < n;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sz[i][j] = Integer.parseInt(tempVar2);
	}

	if (sz[i][j] == 0 && e == 1)
	{
	a = i;
	b = j;
	e = 0;
	}
	if (sz[i][j] == 0)
	{
	c = i;
	d = j;
	}
	}
	}
	s = (c - a - 1) * (d - b - 1);
	System.out.printf("%d\n",s);
	return 0;
	}
}

