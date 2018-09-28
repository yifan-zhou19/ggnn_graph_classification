package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] hang = {-1, -1, -1, -1, -1, -1, -1, -1};
		int[] d = {0, 0, 0, 0, 0, 0, 0, 0};
	int[][] ma = new int[8][8];
	int i;
	int m;
	int n;
	int t;
	int tem;
	int[] c = {0, 0, 0, 0, 0, 0, 0, 0};
	for (i = 0;i < 8;i++)
	{
		for (t = 0;t < 8;t++)
		{
		ma[i][t] = -1312;
		}
	}



	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < m;i++)
	{
		for (t = 0;t < n;t++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			ma[i][t] = Integer.parseInt(tempVar3);
		}
		}
	}

	for (i = 0;i < m;i++)
	{
			for (t = 0;t < n;t++)
			{
			if (ma[i][t] != -1312)
			{
			if (ma[i][t] > hang[i])
			{
				hang[i] = ma[i][t];
			d[i] = t;
			}
			}
			}
	}

	//for (i=0;i<m;i++)
	//printf("%d %d\n",hang[i],d[i]);

	for (i = 0;i < m;i++)
	{
		tem = d[i];
		for (t = 0;t < m;t++)
		{
			if (hang[i] < ma[t][tem])
			{
			c[i]++;
			}
		}

	}
	tem = 0;
	for (i = 0;i < m;i++)
	{
	//	printf("%d\n",c[i]);
		if (c[i] == m - 1)
		{
			System.out.printf("%d+%d\n",i,d[i]);
		}
		else
		{
			tem++;
		}

	}
	if (tem == m)
	{
	System.out.print("No");
	}
	}
}

