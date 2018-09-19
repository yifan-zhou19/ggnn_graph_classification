package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] a = new int[100][100];
		int x;
		int y;
		int r1;
		int s1;
		int r2;
		int s2;
		int N;
		for (x = 0;x <= n - 1;x++)
		{
			for (y = 0;y <= n - 1;y++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[x][y] = Integer.parseInt(tempVar2);
				}
				if (a[x][y] == 0)
				{
					r2 = x;
					s2 = y;
				}
			}
		}
		for (x = n - 1;x >= 0;x--)
		{
			for (y = n - 1;y >= 0;y--)
			{
				if (a[x][y] == 0)
				{
					r1 = x;
					s1 = y;
				}
			}
		}
		N = (r2 - r1 + 1) * (s2 - s1 + 1) - (r2 - r1 + s2 - s1) * 2;
		System.out.printf("%d\n",N);
	}

}

