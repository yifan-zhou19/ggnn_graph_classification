package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int m;
	int n;
	int[][] sz = new int[100][100];
	int[] sum = new int[100];
	int i;
	int j;
	int a;
	int b;
	int c;
	int d;
	int e;
	b = 0;
	c = 0;
	d = 0;
	e = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	//scanf("%d %d",&m,&n);
	for (a = 0;a < k;a++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
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
				(sz[i][j]) = Integer.parseInt(tempVar4);
			}
			}

		}


		for (j = 0;j < n;j++)
		{
		b = b + sz[0][j];
		c = c + sz[m - 1][j];
		}
		for (i = 1;i < m - 1;i++)
		{
		d = d + sz[i][0];
		e = e + sz[i][n - 1];
		}
	sum[a] = b + c + d + e;
	b = 0;
	c = 0;
	d = 0;
	e = 0;
	}
	for (a = 0;a < k;a++)
	{
	System.out.printf("%d\n",sum[a]);
	}
	return 0;
	}


}

