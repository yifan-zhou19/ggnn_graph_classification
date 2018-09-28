package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int m;
	int n;
	int i;
	int a;
	int b;
	int c;
	int[][] jz = new int[100][100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= k;i++)
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
		for (a = 0;a < m;a++)
		{
			for (b = 0;b < n;b++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					jz[a][b] = Integer.parseInt(tempVar4);
				}
			}
		}
		c = 0;
		for (a = 0;a < m;a++)
		{
			for (b = 0;b < n;b++)
			{
				if (a == 0 || b == 0)
				{
					c = c + jz[a][b];
				}
				else if (a == m - 1 || b == n - 1)
				{
					c = c + jz[a][b];
				}
			}
		}
		System.out.printf("%d\n",c);
	}
		return 0;
	}
}

