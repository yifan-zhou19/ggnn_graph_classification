package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int k;
		int sum = 0;
		int a;
	int i;
	int j;
	int q;
	int[] b = new int[100];
	int[][] s = new int[100][100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}


	for (q = 1;q <= k;q++)
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
	for (i = 1;i <= m;i++)
	{
		for (j = 1;j <= n;j++)
		{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			s[i][j] = Integer.parseInt(tempVar4);
		}
		}
	}
	for (j = 1;j <= n;j++)
	{
		sum += s[1][j];
	sum += s[m][j];
	}
	for (i = 1;i <= m;i++)
	{
		sum += s[i][1];
	sum += s[i][n];
	}
	a = s[1][1] + s[1][n] + s[m][1] + s[m][n];
	sum -= a;
	b[q] = sum;
	sum = 0;
	}
	for (q = 1;q <= k;q++)
	{
		System.out.printf("%d\n",b[q]);
	}
	return 0;
	}

}

