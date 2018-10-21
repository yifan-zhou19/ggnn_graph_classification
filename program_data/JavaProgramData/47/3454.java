package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int[][] sz = new int[2][101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 0;a < n;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[0][a] = Integer.parseInt(tempVar2);
			}
		}
		for (a = 0;a < n;a++)
		{
			sz[1][a] = sz[0][n - 1 - a];
		}
		for (b = 0;b < n - 1;b++)
		{
			System.out.printf("%d ",sz[1][b]);
		}
		System.out.printf("%d",sz[1][n - 1]);
		return 0;


	}
}

