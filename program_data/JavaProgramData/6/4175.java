package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int y;
	int i;
	int j;
	int k;
	int m;
	int n;
	int[][] u = new int[100][100];
	int s;
	int d;
	int x;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}

	for (y = 1;y <= k;y++)
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
		for (i = 0;i < m;i++)
		{
	for (j = 0;j < n;j++)
	{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			u[i][j] = Integer.parseInt(tempVar4);
		}
	}
		}
	s = 0;
	for (i = 0;i < m;i++)
	{
	for (j = 0;j < n;j++)
	{
		s += u[i][j];
	}
	}
	d = 0;
	for (i = 1;i < m - 1;i++)
	{
		for (j = 1;j < n - 1;j++)
		{
			d += u[i][j];
		}
	}
	x = s - d;
	System.out.printf("%d\n",x);
	}

	return 0;

	}

}

