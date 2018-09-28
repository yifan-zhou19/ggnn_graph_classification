package <missing>;

public class GlobalMembers
{
	public static int[][] sum = new int[M][2];

	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (scanf("%d%d", i, j) != EOF)
		{
		sum[i][0]++;
		sum[j][1]++;
		}
		for (i = 0; i < n; i++)
		{
		if (sum[i][1] - sum[i][0] == n - 1)
		{
			System.out.printf("%d\n", i);
			return 0;
		}
		}
		/* not found */
		System.out.print("NOT FOUND\n");
		return 0;
	}

}

