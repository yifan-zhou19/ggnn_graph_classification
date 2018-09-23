package <missing>;

public class GlobalMembers
{
	public static int[][] k = new int[26][2];
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k[i][1] = Integer.parseInt(tempVar2);
			}
			 k[i][0] = 1;
			for (j = 0; j < i; j++)
			{
				if (k[j][1] >= k[i][1] != 0 && k[j][0] + 1 > k[i][0])
				{
					k[i][0] = k[j][0] + 1;
				}
			}
			if (k[i][0] > m)
			{
				m = k[i][0];
			}
		}
		System.out.printf("%d", m);
		return 0;
	}
}

