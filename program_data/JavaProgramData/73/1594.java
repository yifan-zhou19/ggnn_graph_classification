package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] sz = new int[5][5];
	int[] zd = new int[5];
	int[] zx = new int[5];
	int s;
	int p = 0;
	int a;
	int b;
	for (a = 0;a < 5;a++)
	{
		for (b = 0;b < 5;b++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				sz[a][b] = Integer.parseInt(tempVar);
			}
		}
	}
		for (a = 0;a < 5;a++)
		{
			s = 0;
		for (b = 0;b < 5;b++)
		{

		if (sz[a][b] >= s)
		{
		 s = sz[a][b];
		zd[a] = s;

		}

		}
		}
		for (b = 0;b < 5;b++)
		{
			s = 100000;
		for (a = 0;a < 5;a++)
		{
	if (sz[a][b] <= s)
	{
		s = sz[a][b];
		zx[b] = s;
	}
		}
		}

	for (a = 0;a < 5;a++)
	{
		for (b = 0;b < 5;b++)
		{
			if (sz[a][b] == zd[a] && sz[a][b] == zx[b])
			{
				System.out.printf("%d %d %d",a + 1,b + 1,sz[a][b]);
			p++;
			}
		}
	}
		if (p == 0)
		{
			System.out.print("not found");
		}

	 return 0;
	}


}

