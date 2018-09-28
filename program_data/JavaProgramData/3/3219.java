package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int a;
		int b;
		int[] sz = new int[1000];
		int[][] ew = new int[1000][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (a = 0;a < n - 1;a++)
		{
			for (b = a + 1;b < n;b++)
			{
				ew[a][b] = sz[a] + sz[b];
			}
		}
		for (a = 0;a < n - 1;a++)
		{
			ew[a][n] = ew[a][n - 1];
			ew[n - 1][n] = ew[n - 2][n - 1];
		}
		for (a = 0;a < n - 1;a++)
		{
			for (b = a + 1;b < n;b++)
			{
				if (ew[a][b] == k)
				{
					System.out.print("yes");
					break;
				}
			}
			if (ew[a][b] == k)
			{
					a--;
					break;
			}
		}
		if ((a == n - 1) && (b == n))
		{
			System.out.print("no");
		}
		return 0;
	}




}

