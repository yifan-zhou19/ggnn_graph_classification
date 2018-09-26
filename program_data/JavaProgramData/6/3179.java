package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int sum = new int(int * p,int h,int l);
	int N;
	int m;
	int n;
	int i;
	int j;
	int q;
	int[][] a = new int[110][110];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		N = Integer.parseInt(tempVar);
	}
	for (q = 1;q <= N;q++)
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
		for (i = 0;i <= m - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					a[i][j] = Integer.parseInt(tempVar4);
				}
			}
		}
	System.out.printf("%d\n",sum(a[0], m, n));
	}
	}

	public static int sum(tangible.RefObject<Integer> p, int h, int l)
	{
		int r = 0;
		int i;
		int j;
		for (i = 0;i <= h - 1;i++)
		{
		if (i == 0 || i == (h - 1))
		{
			for (j = 0;j <= l - 1;j++)
			{
				r = r + *(p.argValue + i * 110 + j);
			}
		}
	else
	{
		r = r + *(p.argValue + i * 110) + *(p.argValue + i * 110 + l - 1);
	}
		}
	return r;
	}
}

